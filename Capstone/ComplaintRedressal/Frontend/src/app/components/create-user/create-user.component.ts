import { Component, OnInit } from '@angular/core';
import { AbstractControl, FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { ActivatedRoute } from '@angular/router';
import { IDropdownSettings } from 'ng-multiselect-dropdown';
import { map } from 'rxjs/operators';
import { Customer } from 'src/app/common/customer';
import { Engineer } from 'src/app/common/engineer';
import { Manager } from 'src/app/common/manager';
import { MultiSelect } from 'src/app/common/multi-select';
import { User } from 'src/app/common/user';
import { Zipcode } from 'src/app/common/zipcode';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-create-user',
  templateUrl: './create-user.component.html',
  styleUrls: ['./create-user.component.css']
})
export class CreateUserComponent implements OnInit {

  userForm:FormGroup;
  formHeading:string='New user';
  role:string;
  zipcodes:string[]=[];
  constructor(private formBuilder:FormBuilder, private userService:UserService,private route:ActivatedRoute) { }

  serviceList;
  zipcodeList;
  dropdownSettings;
  userId:number=0;
  userRole:string='';
  ngOnInit():void {
    this.serviceList = this.getData();
    this.zipcodeList=this.getZipcodes();
    this.dropdownSettings = {
      singleSelection: false,
      idField: 'item_id',
      textField: 'item_text',
      selectAllText: 'Select All',
      unSelectAllText: 'UnSelect All'
    };

    this.userForm=this.formBuilder.group({

      user:this.formBuilder.group({
        id:[''],
        fullName: new FormControl("",[Validators.required]),
        role:new FormControl("",[Validators.required]),
        email:new FormControl("",[Validators.required,Validators.email]),
        phone:new FormControl("",[Validators.required]),
        password:new FormControl("",[Validators.required])
      }),

      customer:this.formBuilder.group({
        id:[''],
        serviceType:new FormControl("",[Validators.required]),
        address:new FormControl("",[Validators.required]),
        zipcode:new FormControl("",[Validators.required]),
        
      }),

      engineer:this.formBuilder.group({
        id:[''],
        zipcode:new FormControl("",[Validators.required])
      }),

      manager:this.formBuilder.group({
        id:[''],
        zipcode:new FormControl("",[Validators.required])
      })

    });
  
    this.route.paramMap.subscribe(()=>{
      this.editUser();
    })
    
  }

  editUser(){

    if(this.route.snapshot.paramMap.has('id')){
      this.formHeading='Edit User';
      this.userId=+this.route.snapshot.paramMap.get('id');
      this.userRole=this.route.snapshot.paramMap.get('role');
      let editUserForm = this.userForm.get('user');
      
      // If role is Customer then set Customer form
      if(this.userRole=='customer'){
       this.editCustomer(editUserForm);
      }

      if(this.userRole=='engineer'){
        this.editEngineer(editUserForm);
      }

      if(this.userRole=='manager'){
        this.editManager(editUserForm);
      }
     
      
    }
  }

  editManager(editUserForm: AbstractControl) {
    let editManagerForm=this.userForm.get('manager');
    this.userService.getManagerById(this.userId).subscribe(data=>{
      editUserForm.setValue(data.user);
      this.roleHandler();
      editManagerForm.get('zipcode').setValue(data.zipcode);
      editManagerForm.get('id').setValue(data.id);
    })
  }
  editEngineer(editUserForm: AbstractControl) {
   
    let editEngineerForm=this.userForm.get('engineer');
    this.userService.getEngineerById(this.userId).subscribe(data=>{
      editUserForm.setValue(data.user);
      this.roleHandler();
      editEngineerForm.get('zipcode').setValue(data.zipcode);
      editEngineerForm.get('id').setValue(data.id);
    })
  }

  editCustomer(editUserForm:AbstractControl){
    
    let editCustomerForm = this.userForm.get('customer')
        
    this.userService.getCustomerById(this.userId).subscribe(data=>{
      console.log(data);
      
      editUserForm.setValue(data.user);
      this.roleHandler();
      editCustomerForm.get('address').setValue(data.address);
      editCustomerForm.get('serviceType').setValue(data.serviceType);
      editCustomerForm.get('zipcode').setValue(data.zipcode);
      editCustomerForm.get('id').setValue(data.id);

     /**Instead of the below data assigned userform as data.user
      *  editUserForm.get('fullName').setValue(data.user.fullName);
      editUserForm.get('role').setValue(data.user.role);
     
      editUserForm.get('phone').setValue(data.user.phone);
      editUserForm.get('email').setValue(data.user.email);
      editUserForm.get('password').setValue(data.user.password);
     
      */
      this.formHeading='Edit User'

    })

  }
  

  getZipcodes() : Array<MultiSelect>{

    let multiSelect:MultiSelect[]=[];
    this.userService.getZipcodes().subscribe((data: string[])=>{
      this.zipcodes=data;
      console.log(this.zipcodes);
      for (let i = 0; i < data.length; i++) {
        let theMultiSelect = new MultiSelect();
        theMultiSelect.item_id=i;
        theMultiSelect.item_text=data[i];
        theMultiSelect.group='z';
        multiSelect.push(theMultiSelect);
        
      }
      
    })

    return multiSelect;

    
  }

  getData() : Array<MultiSelect>{
    return [
      { item_id: 1, item_text: 'landline', group : 'S' },
      { item_id: 2, item_text: 'phone', group : 'S' },
      { item_id: 3, item_text: 'fiber optic', group : 'S' },
      
    ];
  }

  onItemSelect(item: any) {
    // console.log(item);
  }
  onSelectAll(items: any) {
    // console.log(items);
  }

  roleHandler(){
    this.role= this.userForm.get('user').value.role;
    // console.log("==========>Role Selected: "+this.role);
   
    
  }
  submitHandle(){
    // console.log(this.userForm.get('user').value);
    // console.log(this.userForm.get('customer').value);

    let user:User=this.userForm.get('user').value;
  //  For Customer Role
  // ********************
   if(this.role=='customer'){

    const services:MultiSelect[]=this.userForm.get('customer').value.serviceType;
    let serviceToString:string[]=[];
    services.map(data=>serviceToString.push(data.item_text));
    // serviceToString.map(data=>console.log(data));
    let customer:Customer=new Customer();
    customer =this.userForm.get('customer').value;
    customer.serviceType=serviceToString;
    customer.user=user;
    this.userService.createCustomer(customer).subscribe({
      next:response=>{
        alert( `Customer created successfully! Customer ID: ${response}`);
        
      },
      error:err=>{
        alert(`There was an error: ${err.message}`);
       
      }
    })

   }

   //  For Engineer Role
  // ********************
    if(this.role=='engineer'){
      let engineer: Engineer = new Engineer();
      engineer=this.userForm.get('engineer').value;
      engineer.user=user;
      this.userService.createEngineer(engineer).subscribe({
        next:response=>{
          alert( `Engineer created successfully! Engineer ID: ${response}`);
          
        },
        error:err=>{
          alert(`There was an error: ${err.message}`);
         
        }
      })
    }

  //  For Manager Role
  // ********************

  if(this.role=="manager"){
    let manager:Manager=new Manager();
    const pincodes:MultiSelect[]=this.userForm.get('manager').value.zipcode;
    let pincodesToString:string[]=[];
    pincodes.map(data=>pincodesToString.push(data.item_text));
    manager=this.userForm.get('manager').value;
    manager.user=user;
    manager.zipcode=pincodesToString;
    this.userService.createManager(manager).subscribe({
      next:response=>{
        alert( `Manager created successfully! Manager ID: ${response}`);
        
      },
      error:err=>{
        alert(`There was an error: ${err.message}`);
       
      }
    })
  }
    
  }

}

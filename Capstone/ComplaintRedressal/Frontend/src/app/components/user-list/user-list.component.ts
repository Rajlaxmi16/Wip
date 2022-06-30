import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { Customer } from 'src/app/common/customer';
import { Engineer } from 'src/app/common/engineer';
import { Manager } from 'src/app/common/manager';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-user-list',
  templateUrl: './user-list.component.html',
  styleUrls: ['./user-list.component.css']
})
export class UserListComponent implements OnInit {

  

  customers:Customer[]=[];
  engineers:Engineer[]=[];
  managers:Manager[]=[];
  role:string='';
  constructor(private userService:UserService, private route:ActivatedRoute) { }


  ngOnInit(): void {

    this.route.paramMap.subscribe(()=>{
      this.loadusers();
    })
   
  }
  loadusers() {
    if(this.route.snapshot.paramMap.has('role')){
      this.role = this.route.snapshot.paramMap.get('role');

      if(this.role=='customer'){

        this.userService.getCustomers().subscribe(data=>[
          this.customers=data
        ]);
      }

      if(this.role=='engineer'){
        this.userService.getEngineers().subscribe(data=>{
          this.engineers=data;
        });
      }
      if(this.role=='manager'){
        this.userService.getManagers().subscribe(data=>{
          this.managers=data;
        });

      }
    }
  }

  deleteUser(id:number,role:string){
    this.userService.deleteCustomer(id).subscribe(data=>{
      alert(`User ${data} has been deleted successfully`)
      this.loadusers();
    });
    
  }

}

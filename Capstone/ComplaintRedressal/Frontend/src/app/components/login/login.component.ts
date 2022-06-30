import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { UserDto } from 'src/app/common/user-dto';
import { LoginService } from 'src/app/services/login.service';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  loginForm:FormGroup;
  constructor(
    private formBulder:FormBuilder, 
    private loginService:LoginService,
     private userService:UserService,
     private router:Router
  ) { }

  ngOnInit(): void {

    this.loginForm=this.formBulder.group({
      email:new FormControl('',[Validators.required,Validators.email]),
        password:new FormControl('',Validators.required)
    });
  }

  loginhandler(){
    
    let userDto: UserDto=this.loginForm.value;
    this.loginService.checkLogin(userDto).subscribe({
      next:response=>{
        if(response!=null){
          alert( `Logged in successfully! User Name: ${response.fullName}`);
          
          if(response.role=='customer'){
            this.userService.getCustomerByUserId(response.id).subscribe(data=>{
              this.userService.loggedInCustomer=data;
              this.router.navigateByUrl("ticket-list");
            })
          }
         else if(response.role=='engineer'){
            this.userService.getEngineerByUserId(response.id).subscribe(data=>{
              this.userService.loggedInEngineer=data;
              this.router.navigateByUrl("ticket-list");
            })
          }
          else if(response.role=='manager'){
            this.userService.getManagerByUserId(response.id).subscribe(data=>{
              this.userService.loggedInManager=data;
              this.router.navigateByUrl("ticket-list");
            })
          }
          else if(response.role=='admin'){
            this.userService.loggedInCustomer;
            this.loginService.loggedInUser.subscribe(data=>{
              console.log(data);
              this.router.navigateByUrl("home");
              
            })
        
          }
          else{
              alert("something went wrong");
          }
          
        }
        
        
      },
      error:err=>{
        // alert(`There was an error: ${err.message}`);
        alert("incorrect credentials")
      }
    })

  }

}

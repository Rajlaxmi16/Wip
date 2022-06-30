import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BehaviorSubject, Observable, Subject } from 'rxjs';
import { Customer } from '../common/customer';
import { Engineer } from '../common/engineer';
import { Manager } from '../common/manager';
import { User } from '../common/user';
import { UserDto } from '../common/user-dto';
import { UserService } from './user.service';

@Injectable({
  providedIn: 'root'
})
export class LoginService {


  loggedInUser:Subject<User>=new BehaviorSubject<User>(null);
  loggedInCustomer:Subject<Customer> = new BehaviorSubject<Customer>(null);
  loggedInEngineer:Subject<Engineer> = new BehaviorSubject<Engineer>(null);
  loggedInManager:Subject<Manager> = new BehaviorSubject<Manager>(null);

  constructor(private http:HttpClient,private userService:UserService) { }

  checkLogin(userDto:UserDto):Observable<User>{

    const loginUrl="http://localhost:8081/login/check";
    
     this.http.post<User>(loginUrl,userDto).subscribe(data=>{
      this.loggedInUser.next(data);

      // If user is a customer then get their details
      if(data.role=='customer'){
        this.userService.getCustomerByUserId(data.id).subscribe(data=>{
          this.loggedInCustomer.next(data);
        })
      }
       // If user is an Engineer then get their details
        if(data.role=='engineer'){
         this.userService.getEngineerByUserId(data.id).subscribe(data=>{
           this.loggedInEngineer.next(data);
         })
       }

        // If user is an Manager then get their details
        if(data.role=='manager'){
          this.userService.getManagerByUserId(data.id).subscribe(data=>{
            this.loggedInManager.next(data);
          })
        }
     })

     return  this.http.post<User>(loginUrl,userDto);
  }



}

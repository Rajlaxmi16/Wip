import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Customer } from '../common/customer';
import { Engineer } from '../common/engineer';
import { Manager } from '../common/manager';
import { Zipcode } from '../common/zipcode';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  loggedInCustomer:Customer=null;
  loggedInEngineer:Engineer=null;
  loggedInManager:Manager=null;
  
  constructor(private http:HttpClient) { }

  createManager(manager: Manager):Observable<any> {
    const postUrl='http://localhost:8081/users/managers/new';
    return this.http.post<Manager>(postUrl,manager);
  }
  createEngineer(engineer: Engineer):Observable<any> {
    const postUrl='http://localhost:8081/users/engineers/new';
    return this.http.post<Engineer>(postUrl,engineer);
  }

  

  createCustomer(customer:Customer):Observable<any>{

    const postUrl='http://localhost:8081/users/customers/new';
    // customer.ticket=null;
    return this.http.post<Customer>(postUrl,customer);
   
  }

  getZipcodes():Observable<string[]>{
    const getUrl = "http://localhost:8081/users/zipcodes/";
   console.log( this.http.get(getUrl));
   
    return this.http.get<string[]>(getUrl).pipe(
      map(response=>response)
      )
  }

  getCustomers():Observable<Customer[]>{
    const getUrl='http://localhost:8081/users/customers';
    return this.http.get<Customer[]>(getUrl);

  }

  getCustomerById(id:number):Observable<Customer>{
    const getUrl='http://localhost:8081/users/customers/'+id;
    return this.http.get<Customer>(getUrl);
  }

  getCustomerByUserId(id:number):Observable<Customer>{

    const getUrl="http://localhost:8081/users/customers/findByUserId/"+id;

    return this.http.get<Customer>(getUrl);

  }

  getEngineerByUserId(id:number):Observable<Engineer>{
    const getUrl="http://localhost:8081/users/engineers/findByUserId/"+id;
    return this.http.get<Engineer>(getUrl);
  }

  getManagerByUserId(id:number):Observable<Manager>{
    const getUrl="http://localhost:8081/users/managers/findByUserId/"+id;
    return this.http.get<Manager>(getUrl);
  }

  getEngineers():Observable<Engineer[]>{
    const getUrl='http://localhost:8081/users/engineers';
    return this.http.get<Engineer[]>(getUrl);
  }

  getEngineerById(id:number):Observable<Engineer>{
    const getUrl='http://localhost:8081/users/engineers/'+id;
    return this.http.get<Engineer>(getUrl);
  }

  getManagers():Observable<Manager[]>{
    const getUrl='http://localhost:8081/users/managers';
    return this.http.get<Manager[]>(getUrl);
  }

  getManagerById(id:number):Observable<Manager>{
    const getUrl='http://localhost:8081/users/managers/'+id;
    return this.http.get<Manager>(getUrl);
  }

  deleteCustomer(id:number):Observable<any>{
    const deleteUrl='http://localhost:8081/users/customers/'+id;
    return this.http.delete(deleteUrl);
  }

  
}

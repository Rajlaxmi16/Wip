import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Engineer } from '../common/engineer';
import { Feedback } from '../common/feedback';
import { Notes } from '../common/notes';
import { Ticket } from '../common/ticket';

@Injectable({
  providedIn: 'root'
})

export class TicketService {

  private postUrl:string='http://localhost:8081/tickets/new';
  constructor(private httpClient:HttpClient) { }

  raiseNewTicket(ticket:Ticket):Observable<any>{
    return this.httpClient.post<Ticket>(this.postUrl,ticket);
  }

  getCustomerTickets(customerId:number):Observable<Ticket[]>{
    const getUrl="http://localhost:8081/tickets/customer/"+customerId;
    return this.httpClient.get<Ticket[]>(getUrl);
  }

  getAllTickets():Observable<Ticket[]>{
    const getUrl="http://localhost:8081/tickets/";
    return this.httpClient.get<Ticket[]>(getUrl);
  }

  getTicketById(id:number):Observable<Ticket>{
    const getUrl="http://localhost:8081/tickets/"+id;
    return this.httpClient.get<Ticket>(getUrl);
  }

  getEngineersByZipcode(zipcode:string):Observable<Engineer[]>{
    
    const getUrl='http://localhost:8081/users/engineers/byZipcode/'+zipcode;
    return this.httpClient.get<Engineer[]>(getUrl);
  }

  getNotesByTicketId(id:number):Observable<Notes[]>{
    const getUrl='http://localhost:8081/tickets/notes/'+id;
    return this.httpClient.get<Notes[]>(getUrl);
  }

  saveNotes(notes:Notes):Observable<any>{
    const postUrl='http://localhost:8081/tickets/notes/save';
    return this.httpClient.post<Notes>(postUrl,notes);
  }

  saveFeedback(feedBack:Feedback):Observable<any>{
    const postUrl='http://localhost:8081/tickets/feedback/submit';
    return this.httpClient.post<Feedback>(postUrl,feedBack);
  }

  getFeedback(ticketId:number):Observable<Feedback>{
    const getUrl='http://localhost:8081/tickets/feedback/'+ticketId;
    return this.httpClient.get<Feedback>(getUrl);

  }

}


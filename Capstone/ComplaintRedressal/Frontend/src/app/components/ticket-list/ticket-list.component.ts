import { Component, OnInit } from '@angular/core';
import { Ticket } from 'src/app/common/ticket';
import { User } from 'src/app/common/user';
import { LoginService } from 'src/app/services/login.service';
import { TicketService } from 'src/app/services/ticket.service';

@Component({
  selector: 'app-ticket-list',
  templateUrl: './ticket-list.component.html',
  styleUrls: ['./ticket-list.component.css']
})
export class TicketListComponent implements OnInit {

  tickets:Ticket[]=[];
  selectedTicket:Ticket;
  loggedInUser:User=null;
  constructor(private ticketService:TicketService,private loginService:LoginService) { }

  ngOnInit(): void {
    
   this.loginService.loggedInUser.subscribe(data=>{
     console.log("line 22");
     this.loggedInUser=data;
     if(data.role=='customer'){
      console.log("line 25");
       this.loginService.loggedInCustomer.subscribe(data2=>this.getTicketsByCustomerId(data2.id));
       console.log("line 27");
     }
     else{
      this.getAllTickets();
      console.log("line 31");
     }
   })

  }
  // End Of onInit


  getTicketsByCustomerId(id:number) {
    this.ticketService.getCustomerTickets(id).subscribe(data=>{
      this.tickets=data;
    })
  }

  getAllTickets() {
    this.ticketService.getAllTickets().subscribe(data=>{
      this.tickets=data;
    });
  }

}

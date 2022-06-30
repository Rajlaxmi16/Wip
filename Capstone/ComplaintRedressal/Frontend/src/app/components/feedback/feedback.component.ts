import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { ActivatedRoute, Router } from '@angular/router';
import { Feedback } from 'src/app/common/feedback';
import { Ticket } from 'src/app/common/ticket';
import { TicketService } from 'src/app/services/ticket.service';

@Component({
  selector: 'app-feedback',
  templateUrl: './feedback.component.html',
  styleUrls: ['./feedback.component.css']
})
export class FeedbackComponent implements OnInit {

  ticket:Ticket;
  feedbackForm: FormGroup;

  
  
  constructor(private ticketService:TicketService,private router:ActivatedRoute, private formBuilder:FormBuilder) { }

  ngOnInit(): void {

    if(this.router.snapshot.paramMap.has('ticketId'))
    this.ticketService.getTicketById(+this.router.snapshot.paramMap.get('ticketId')).subscribe(data=>{
      this.ticket=data;
    });

    this.feedbackForm=this.formBuilder.group({
      id:[''],
      rating:[''],
      comments:['']
    });

    
  }

  submitHandler(){
    let feedback:Feedback=new Feedback();
    feedback = this.feedbackForm.value;
    feedback.ticket = this.ticket; 
    console.log(feedback);

    this.ticketService.saveFeedback(feedback).subscribe({
      next:res=>{
        alert("Feedback submitted successfully"+res);
      },
      error:err=>{
        alert("There was an error"+err.message);
      }
    })

  }

}

import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Ticket } from 'src/app/common/ticket';
import { UserService } from 'src/app/services/user.service';

@Component({
  selector: 'app-assign-engineer',
  templateUrl: './assign-engineer.component.html',
  styleUrls: ['./assign-engineer.component.css']
})
export class AssignEngineerComponent implements OnInit {

  ticket:Ticket;

  constructor(private userService:UserService,private router:Router) { }

  ngOnInit(): void {

    this.router

  }

}

import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {HttpClientModule} from '@angular/common/http';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { RouterModule, Routes } from '@angular/router';
import { CreateCustomerComponent } from './components/create-customer/create-customer.component';
import { CreateEmployeeComponent } from './components/create-employee/create-employee.component';
import { CreateUserComponent } from './components/create-user/create-user.component';
import { ReactiveFormsModule } from '@angular/forms';
import { NgMultiSelectDropDownModule } from 'ng-multiselect-dropdown';
import { UserListComponent } from './components/user-list/user-list.component';
import { TicketComponent } from './components/ticket/ticket.component';
import { TicketListComponent } from './components/ticket-list/ticket-list.component';
import { LoginComponent } from './components/login/login.component';
import { CoreComponent } from './components/core/core.component';
import { TicketCustomerComponent } from './components/ticket-customer/ticket-customer.component';
import { TicketEditComponent } from './components/ticket-edit/ticket-edit.component';
import { AssignEngineerComponent } from './components/assign-engineer/assign-engineer.component';
import { FeedbackComponent } from './components/feedback/feedback.component';



const routes:Routes=[
  {path:'home',component:TicketListComponent},
  {path:"ticket",component:TicketComponent},
  {path:"ticket-list",component:TicketListComponent},
  {path:"create",component:CreateUserComponent},
  {path:"users/:role",component:UserListComponent},
  {path:"editUser/:id/:role",component:CreateUserComponent},
  {path:"login",component:LoginComponent},
  {path:"viewTicket/:id",component:TicketComponent},
  {path:"feedback/:ticketId", component:FeedbackComponent},
  {path:'**',redirectTo:'/login',pathMatch:'full'}
];

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    CreateCustomerComponent,
    CreateEmployeeComponent,
    CreateUserComponent,
    UserListComponent,
    TicketComponent,
    TicketListComponent,
    LoginComponent,
    CoreComponent,
    TicketCustomerComponent,
    TicketEditComponent,
    AssignEngineerComponent,
    FeedbackComponent,
    
    
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(routes),
    ReactiveFormsModule,
    AppRoutingModule,
    NgMultiSelectDropDownModule.forRoot(),
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }

import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import{ FormsModule } from '@angular/forms';
import{ HttpModule } from '@angular/http';
import{ RouterModule, Routes } from '@angular/router';

import { AppComponent } from './app.component';
import { CustomerService } from './customer.service';

import { FooterComponent } from './footer/footer.component';
import { HeaderComponent } from './header/header.component';
import { WelcomeComponent } from './welcome/welcome.component';
import { SignInComponent } from './sign-in/sign-in.component';
import { BookTicketComponent } from './book-ticket/book-ticket.component';
import { ListTicketInfoComponent } from './list-ticket-info/list-ticket-info.component';
import { AddEditPassengerComponent } from './add-edit-passenger/add-edit-passenger.component';
import { GetFlightDetailsComponent } from './get-flight-details/get-flight-details.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import { ListPassengerComponent } from './list-passenger/list-passenger.component';
import { RemovePassengerComponent } from './remove-passenger/remove-passenger.component';
import { GetPassengerByIdComponent } from './get-passenger-by-id/get-passenger-by-id.component';
import { ListschedulesComponent } from './listschedules/listschedules.component';
import { GetScheduleByIdComponent } from './get-schedule-by-id/get-schedule-by-id.component';
import { CancelTicketComponent } from './cancel-ticket/cancel-ticket.component';
import { GetTicketByIdComponent } from './get-ticket-by-id/get-ticket-by-id.component';
import { GetFlightByIdComponent } from './get-flight-by-id/get-flight-by-id.component';
import { ListFlightComponent } from './list-flight/list-flight.component';
import { RegisterComponent } from './register/register.component';
import { HomeComponent } from './home/home.component';


const appRoutes: Routes = [{
  path: 'welcome', component: WelcomeComponent,
  children: [{path: 'login', component: SignInComponent},
  {path: 'signup', component: RegisterComponent}]
},
  {path: 'home', component: HomeComponent,
  children: [
  { path : 'BookTicket' , component: BookTicketComponent},
  { path : 'ViewBookedTicket' , component: ListTicketInfoComponent},
  { path : 'addPassenger', component:  AddEditPassengerComponent},
  { path : 'update/:id', component:AddEditPassengerComponent },
  { path : 'getFlightDetails',component:GetFlightDetailsComponent}
]},
{ path: '', redirectTo: '/welcome' , pathMatch: 'full'},
{path: '**', component:  PageNotFoundComponent}
];

@NgModule({
  declarations: [
    AppComponent,
    SignInComponent,
    RegisterComponent,
    GetFlightDetailsComponent,
    ListPassengerComponent,
    RemovePassengerComponent,
    GetPassengerByIdComponent,
    AddEditPassengerComponent,
    ListschedulesComponent,
    GetScheduleByIdComponent,
    BookTicketComponent,
    CancelTicketComponent,
    GetTicketByIdComponent,
    ListTicketInfoComponent,
    GetFlightByIdComponent,
    ListFlightComponent,
    PageNotFoundComponent,
    AddEditPassengerComponent,
    WelcomeComponent,
    HomeComponent,
    FooterComponent,
    HeaderComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule,
    RouterModule.forRoot(appRoutes)
   
  ],
  providers: [CustomerService],
  bootstrap: [AppComponent]
})
export class AppModule { }

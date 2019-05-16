import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';
import { RouterModule, Routes } from '@angular/router';

import { AppComponent } from './app.component';
import { LoginComponent } from './login/login.component';
import { AdminService } from './admin.service';
import { HeaderComponent } from './header/header.component';
import { FooterComponent } from './footer/footer.component';
import { AddFlightComponent } from './Flight/add-flight/add-flight.component';
import { RemoveFlightComponent } from './Flight/remove-flight/remove-flight.component';
import { GetFlightByIdComponent } from './Flight/get-flight-by-id/get-flight-by-id.component';
import { GetAllComponent } from './Flight/get-all/get-all.component';
import { AddRouteComponent } from './Route/add-route/add-route.component';
import { RemoveRouteComponent } from './Route/remove-route/remove-route.component';
import { GetRouteByIdComponent } from './Route/get-route-by-id/get-route-by-id.component';
import { AddScheduleComponent } from './Schedule/add-schedule/add-schedule.component';
import { RemoveScheduleComponent } from './Schedule/remove-schedule/remove-schedule.component';
import { GetScheduleByIdComponent } from './Schedule/get-schedule-by-id/get-schedule-by-id.component';
import { AddLocationComponent } from './Location/add-location/add-location.component';
import { RemoveLocationComponent } from './Location/remove-location/remove-location.component';
import { GetLocationByIdComponent } from './Location/get-location-by-id/get-location-by-id.component';
import { PagenotfoundComponent } from './pagenotfound/pagenotfound.component';
import { HomeComponent } from './home/home.component';
import { FlightComponent } from './Flight/flight/flight.component';
import { RouteComponent } from './Route/route/route.component';
import { LocationComponent } from './Location/location/location.component';
import { ScheduleComponent } from './Schedule/schedule/schedule.component';
import { TicketstatusComponent } from './ticketstatus/ticketstatus.component';
import { GetalllocationsComponent } from './Location/getalllocations/getalllocations.component';
import { GetallrouteComponent } from './Route/getallroute/getallroute.component';
import { GetallscheduleComponent } from './Schedule/getallschedule/getallschedule.component';

const appRoutes: Routes = [
  {path: 'login', component: LoginComponent},
  {path: 'home', component: HomeComponent,
  children: [
  { path: 'flight', component: GetAllComponent},
   
  { path: 'addflight', component: AddFlightComponent },
  {path: 'editflight/:fid',component:AddFlightComponent},
  {path: 'getflightbyid/:id', component: GetFlightByIdComponent},
  {path: 'remove/:id', component: RemoveFlightComponent},

  { path: 'addroute', component: AddRouteComponent },
  { path: 'route', component: GetallrouteComponent},
  {path: 'getroutebyid/:id', component: GetRouteByIdComponent},
  {path: 'remove/:id', component: RemoveRouteComponent},
  
  { path: 'location', component: GetalllocationsComponent},
  { path: 'addlocation', component: AddLocationComponent },

  {path: 'getlocationbyid/:id', component: GetLocationByIdComponent},
  {path: 'remove/:id', component: RemoveLocationComponent},

  { path: 'addschedule', component: AddScheduleComponent },
  { path: 'schedule', component: GetallscheduleComponent},
  {path: 'getschedulebyid/:id', component: GetScheduleByIdComponent},
  {path: 'remove/:id', component: RemoveScheduleComponent},
  {path: 'ticketstatus/:id', component: TicketstatusComponent},
]},
{ path: '', redirectTo: '/login' , pathMatch: 'full'},
{path: '**', component: PagenotfoundComponent}
];






  

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    HeaderComponent,
    FooterComponent,
    AddFlightComponent,
    RemoveFlightComponent,
    GetFlightByIdComponent,
    GetAllComponent,
    AddRouteComponent,
    RemoveRouteComponent,
    GetRouteByIdComponent,
    AddScheduleComponent,
    RemoveScheduleComponent,
    GetScheduleByIdComponent,
    AddLocationComponent,
    RemoveLocationComponent,
    GetLocationByIdComponent,
    PagenotfoundComponent,
    HomeComponent,
    FlightComponent,
    RouteComponent,
    LocationComponent,
    ScheduleComponent,
    TicketstatusComponent,
    GetalllocationsComponent,
    GetallrouteComponent,
    GetallscheduleComponent
    
  ],
  imports: [
    BrowserModule,FormsModule,HttpModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [AdminService],
  bootstrap: [AppComponent]
})
export class AppModule { }

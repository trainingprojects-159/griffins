import { Component, OnInit } from '@angular/core';
import { Flight } from '../../flight';
import { Router, Routes, ActivatedRoute, ParamMap } from '../../../../node_modules/@angular/router';
import { AdminService } from '../../admin.service';
import { Route } from '../../route';

@Component({
  selector: 'app-add-flight',
  templateUrl: './add-flight.component.html',
  styleUrls: ['./add-flight.component.css']
})
export class AddFlightComponent implements OnInit {
flight: Flight =new Flight ;
routes: Route[];
userId: string;
routid: string;
  constructor( private _router: Router, private _adminService: AdminService
    ,private route:ActivatedRoute) { }

  ngOnInit() {
    this._adminService.getAllRoutes()
    .then(routes => this.routes = routes);

    let fid=null;
    this.route.paramMap.subscribe(parameterMap =>{
     const fid = parameterMap.get('fid');
     if(fid){
       console.log("id "|| fid);
     this._adminService.getFlightById(fid).then(flight =>this.flight =flight); 
     }else{
      console.log("invalid id");
     }
   });
  

  }
  flightForm(): void{
    this.flight = {
      'flightId': null, 
      'fname':  null,
      'reserveSeat':  null,
      'flightType':  null,
      'seatCap':  null,
      'admin':{
        'userId': null,
        'password':'no'
      },
      'route':{
        'routeId':  null,
        'source':{
          'locId':'2',
          'locName':'no'},
        'destination':{
          'locId':'2',
          'locName':'no'},
        'cost':88,
        'distance':7,
        'duration':9
      }
        
   };
  }
  saveFlight(): void{
    
    this.flight = {
      'flightId': this.flight.flightId, 
      'fname': this.flight.fname,
      'reserveSeat': this.flight.reserveSeat,
      'flightType': this.flight.flightType,
      'seatCap': this.flight.seatCap,
      'admin':{
        'userId': localStorage.getItem('userid'),
        'password':'no'
      },
      'route':{
        'routeId': this.routid,
        'source':{
          'locId':'2',
          'locName':'no'},
        'destination':{
          'locId':'2',
          'locName':'no'},
        'cost':88,
        'distance':7,
        'duration':9
      }
        
      // 'admin':{
      //   'userId':this.userId,
      //   'password':"no value",
      // },
      // 'route':{
      //   'routeId':this.route.routeId,
      //   'source':
      // }

        };
        if(this.flight.flightId == null){
      this._adminService.addFlight(this.flight);
      console.log(this.flight);
      this.flightForm();}
      else{
        this.flight = {
          'flightId': this.flight.flightId, 
          'fname': this.flight.fname,
          'reserveSeat': this.flight.reserveSeat,
          'flightType': this.flight.flightType,
          'seatCap': this.flight.seatCap,
          'admin':{
            'userId': localStorage.getItem('userid'),
            'password':'no'
          },
          'route':{
            'routeId': this.routid,
            'source':{
              'locId':'2',
              'locName':'no'},
            'destination':{
              'locId':'2',
              'locName':'no'},
            'cost':88,
            'distance':7,
            'duration':9
          }
            };
            console.log('update called');
        this._adminService.updateFlight(this.flight,);
      console.log(this.flight);
      this.flightForm();}
      }
  
}

import { Component, OnInit } from '@angular/core';
import { AdminService } from '../../admin.service';
import { Router } from '../../../../node_modules/@angular/router';
import { Flight } from '../../flight';

@Component({
  selector: 'app-get-all',
  templateUrl: './get-all.component.html',
  styleUrls: ['./get-all.component.css']
})
export class GetAllComponent implements OnInit {
flights: Flight[];
  constructor(private _adminService: AdminService,private router: Router) { }

  ngOnInit() {
    this._adminService.getAllFlights().then(flights =>this.flights=flights);
  }
  delete(flightId:string):void{
    this._adminService.deleteFlight(flightId);
  }
}

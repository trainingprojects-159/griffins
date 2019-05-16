import { Component, OnInit } from '@angular/core';
import { AdminService } from '../../admin.service';
import { Router } from '../../../../node_modules/@angular/router';

@Component({
  selector: 'app-getalllocations',
  templateUrl: './getalllocations.component.html',
  styleUrls: ['./getalllocations.component.css']
})
export class GetalllocationsComponent implements OnInit {
  locations: Location[];
  constructor(private _adminService: AdminService,private router: Router) { }

  ngOnInit() {
    this._adminService.getAllLocations().then(locations =>this.locations=locations);
  }
  delete(locId:string):void{
    this._adminService.deleteLocation(locId);
  }
}

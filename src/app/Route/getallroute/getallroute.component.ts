import { Component, OnInit } from '@angular/core';
import { Route } from '../../route';
import { AdminService } from '../../admin.service';
import { Router } from '../../../../node_modules/@angular/router';

@Component({
  selector: 'app-getallroute',
  templateUrl: './getallroute.component.html',
  styleUrls: ['./getallroute.component.css']
})
export class GetallrouteComponent implements OnInit {
  routes: Route[];
  constructor(private _adminService: AdminService,private router: Router) { }

  ngOnInit() {
    this._adminService.getAllRoutes().then(routes =>this.routes=routes);
  }


  edit(routeId:string):void{
    this.router.navigateByUrl('home/addroute');
  }
  delete(routeId:string):void{
    this._adminService.deleteRoute(routeId);
    console.log('naviageed');
    this.router.navigateByUrl('home/route');
  }

}

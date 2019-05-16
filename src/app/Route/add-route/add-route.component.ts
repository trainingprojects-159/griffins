import { Component, OnInit } from '@angular/core';
import { Route } from '../../route';
import { Router } from '../../../../node_modules/@angular/router';
import { AdminService } from '../../admin.service';

@Component({
  selector: 'app-add-route',
  templateUrl: './add-route.component.html',
  styleUrls: ['./add-route.component.css']
})
export class AddRouteComponent implements OnInit {
route: Route = new Route;
  constructor(private router: Router, private _adminService: AdminService) { }

  ngOnInit() {
  }
saveRoute(): void{
  console.log(this.route.routeId);
  console.log(this.route.source);
}
}

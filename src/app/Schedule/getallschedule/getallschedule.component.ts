import { Component, OnInit } from '@angular/core';
import { Schedule } from '../../schedule';
import { AdminService } from '../../admin.service';
import { Router } from '../../../../node_modules/@angular/router';

@Component({
  selector: 'app-getallschedule',
  templateUrl: './getallschedule.component.html',
  styleUrls: ['./getallschedule.component.css']
})
export class GetallscheduleComponent implements OnInit {
  schedules: Schedule[];
  constructor(private _adminService: AdminService,private router: Router) { }

  ngOnInit() {
    this._adminService.getAllSchedules().then(schedules =>this.schedules=schedules);
  }
  delete(scheId:string):void{
    this._adminService.deleteSchedule(scheId);
  }

}

import { Component, OnInit } from '@angular/core';
import { Schedule } from '../../schedule';
import { Router } from '../../../../node_modules/@angular/router';
import { AdminService } from '../../admin.service';

@Component({
  selector: 'app-add-schedule',
  templateUrl: './add-schedule.component.html',
  styleUrls: ['./add-schedule.component.css']
})
export class AddScheduleComponent implements OnInit {
schedule: Schedule = new Schedule;
  constructor(private router: Router, private _adminService: AdminService) { }

  ngOnInit() {
  }
saveSchedule(): void{
  console.log(this.schedule.scheId);
  console.log(this.schedule.scheDate);
}
}

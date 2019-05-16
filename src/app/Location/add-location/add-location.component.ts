import { Component, OnInit } from '@angular/core';
import { Location } from '../../Location';
import { Router, ActivatedRoute } from '../../../../node_modules/@angular/router';
import { AdminService } from '../../admin.service';

@Component({
  selector: 'app-add-location',
  templateUrl: './add-location.component.html',
  styleUrls: ['./add-location.component.css']
})
export class AddLocationComponent implements OnInit {
location: Location = new Location;

  constructor(private router: Router, private _adminService: AdminService,private route:ActivatedRoute) { }

  ngOnInit() {
  }
  resetForm(){
    this.location = {
      'locId': null,
      'locName': null
    }
  }
  saveLocation(): void{
    this.location = {
      'locId': this.location.locId,
      'locName': this.location.locName
    }
    console.log(this.location.locId);
    console.log(this.location.locName);
  }
}
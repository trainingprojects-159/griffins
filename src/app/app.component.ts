import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
    styleUrls: ['./app.component.css']
  })
  export class AppComponent {
    title = 'Employee Details';
    isDisabled=false;
    badHtml='Hello <script>alert ("hi");</script> World';
    onClick():void{
      console.log('button is clicked');
    }
  }
  


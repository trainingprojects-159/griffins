import { Component, OnInit } from '@angular/core';
import { error } from 'protractor';
import { Router } from '@angular/router';
import { Customer } from '../customer';
import { CustomerService } from '../customer.service';

@Component({
  selector: 'app-sign-in',
  templateUrl: './sign-in.component.html',
  styleUrls: ['./sign-in.component.css']
})
export class SignInComponent implements OnInit {
  customer:Customer = new Customer;
  error='invalid';
  constructor(private router:Router,
    private _customerService : CustomerService) { }

  ngOnInit() {
  }
login():boolean{
  this._customerService.signIn(this.customer.email,
    this.customer.password)
    .then(result => {
    if(result === true){
      console.log('loggin success')
      this.router.navigateByUrl('home');
    }else{
      this.error='invalid username and password ';
      this.router.navigateByUrl('login');
    }
  },error => {this.error =error;});
  console.log('loggin success');
  return true;
}

  }

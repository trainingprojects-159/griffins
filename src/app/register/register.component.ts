import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { CustomerService } from '../customer.service';
import { Customer } from '../customer';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
customer: Customer = new Customer;
  constructor(private _customerService: CustomerService) { }

  ngOnInit() {
  }

resetForm(form?: NgForm){
  if(form!=null){
    form.reset();
  }
}


  register(form: NgForm):void{
    this.customer ={
      "userId":this.customer.userId,
      "uname": this.customer.uname, 
      "gender": this.customer.gender,
      "contact":this.customer.contact, 
      "password":this.customer.password,
      "dob": this.customer.dob,
      "address":this.customer.address,
      "email": this.customer.email,
      "nic": this.customer.nic
    };
    this._customerService.register(this.customer);
    console.log("ts data");
    console.log(this.customer);
    this.resetForm(form);
  }

}

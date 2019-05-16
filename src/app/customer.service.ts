import { Injectable } from '@angular/core';
import { Headers, Http } from '@angular/http';
import { Customer } from './customer';
import { PassengerInfo } from './passenger-info';
import { Flight } from './flight';
import { Schedule } from './schedule';
import { TicketInfo } from './ticket-info';

@Injectable()
export class CustomerService {
private url='http://localhost:8012/Griffin_Airway1/user';
  constructor(private _http:Http) { }
  private headers =new Headers({'content-Type':'application/json'});

  private handleError(error:any):Promise<any>{
  //  console.error('error',error);
    return Promise.reject(error.message||error)
  }

  register(customer:Customer):Promise<Customer>{
    console.log(customer);
    return this._http.post('http://localhost:8012/Griffin_Airway1/user/register',
    JSON.stringify(customer),
    {headers : this.headers})
  .toPromise().then(res =>res.json() as Customer)
  .catch(this.handleError);
  }

  signIn(email:string,password:string):Promise<boolean>{
    const lurl=`${this.url}/signIn/${email}/${password}`;
    return this._http.get(lurl,JSON.stringify({email:email,password:password}))
    .toPromise()
    .then(response => { 
      const Customer =response.json() && response.json().Customer;
      console.log(response.text());
      if(response.text()==='true'){
        return false;
      }else{
        return true;
      }
    })
    .catch(this.handleError);

  }
  getFlightDetails(source:string, destination: string, scheduleDate:string):Promise<Customer>{
    const lurl=`http://localhost:8012/Griffin_Airway1/user/getFlightDetails/${source}/${destination}/${scheduleDate}`;
    return this._http.get(lurl).toPromise().then(res =>res.json() as Customer)
  .catch(this.handleError);
  }



  addPassenger(passengerInfo:PassengerInfo):Promise<PassengerInfo>{
    return this._http.post('http://localhost:8012/Griffin_Airway1/user/passenger/add',JSON.stringify(passengerInfo))
    .toPromise().then(res => res.json() as PassengerInfo).catch(this.handleError);
  }

  updatePassenger(passengerInfo:PassengerInfo):Promise<PassengerInfo>{
   
    return this._http.put('http://localhost:8012/Griffin_Airway1/user/passenger/edit',JSON.stringify(passengerInfo))
    .toPromise().then(res => res.json() as PassengerInfo).catch(this.handleError);
  }

  // getEmployeeById(passId): Promise<PassengerInfo> {
  //   const lurl = `http://localhost:8012/Griffin_Airway1/user/passenger/${passengerInfo}`;
  //     return this._http
  //     .get(lurl)
  //     .toPromise()
  //     .then(res => res.json() as PassengerInfo)
  //     .catch(this.handleError);
  //   }

  // getAllPassenger():Promise<PassengerInfo>{
  //   return
  //   this._http.get('http://localhost:8012/Griffin_Airway1/user/passengers')
  //   .toPromise()
  //   .then(res => res.json() as PassengerInfo[])
  //   .catch(this.handleError);
  // }

  // getFlightById(flight:Flight):Promise<Flight>{
  //   const
  //   lurl=`http://localhost:8012/Griffin_Airway1/user/flight/${flightid}`
  //   return
  //   this._http.get(lurl)
  //   .toPromise().then(res => res.json() as Flight).catch(this.handleError);
  // }

  getAllFlight():Promise<Flight>{
    return this._http.get('http://localhost:8012/Griffin_Airway1/user/flights')
    .toPromise()
    .then(res => res.json() as Flight[])
    .catch(this.handleError);
  }



  // getScheduleById(schedule:Schedule):Promise<Schedule>{
  //   const
  //   lurl=`http://localhost:8012/Griffin_Airway1/user/schedule/${scheId}`
  //   return
  //   this._http.get(lurl)
  //   .toPromise().then(res => res.json() as Schedule).catch(this.handleError);
  // }

  getAllSchedule():Promise<Schedule>{
    return this._http.get('http://localhost:8012/Griffin_Airway1/user/schedules')
    .toPromise()
    .then(res => res.json() as Schedule[])
    .catch(this.handleError);
  }



  addTicket(ticketInfo:TicketInfo):Promise<TicketInfo>{
    return this._http.post('http://localhost:8012/Griffin_Airway1/user/ticketInfo/add'
    ,JSON.stringify(TicketInfo))
    .toPromise().then(res => res.json() as TicketInfo).catch(this.handleError);
  }

  // updateTicket(ticketInfo:TicketInfo):Promise<TicketInfo>{
  //   return
  //   this._http.put(`http://localhost:8012/Griffin_Airway1/user/ticketInfo/{ticketId}`
  //   ,JSON.stringify(TicketInfo))
  //   .toPromise().then(res => res.json() as TicketInfo).catch(this.handleError);
  // }

  // getTicketById(ticketInfo:TicketInfo):Promise<TicketInfo>{
  //   const
  //   lurl=`http://localhost:8012/Griffin_Airway1/user/ticketInfo/{ticketId}`
  //   return
  //   this._http.get(lurl)
  //   .toPromise().then(res => res.json() as TicketInfo).catch(this.handleError);
  // }
  getAllTicket():Promise<TicketInfo>{
    return this._http.get('http://localhost:8012/Griffin_Airway1/user/ticketInfos')
    .toPromise()
    .then(res => res.json() as TicketInfo[])
    .catch(this.handleError);
  }
}


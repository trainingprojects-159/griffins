import { Injectable } from '@angular/core';
import { Headers,Http } from '@angular/http';
import { Flight } from './flight';
import { Route } from './route';
import { Schedule } from './schedule';
import { Ticketinfo } from './ticketinfo';


@Injectable()
export class AdminService {
  private url:'http://localhost:8625/GriffinAirways/admin';
  private  headers = new Headers({'Content-Type': 'application/json'});
  constructor(private _http: Http) { }
   
  
        private handleError(error: any): Promise<any>
     { console.error('error', error)
       return Promise.reject(error.message || error)
     }
     login(userId: string, password: string): Promise<boolean>
     {
       const lurl= `http://localhost:8625/GriffinAirways/admin/login/${userId}/${password}`;
       return this._http.get(lurl, JSON.stringify({userId: userId,password: password}))
       .toPromise()
       .then(response =>{
         const admin =response.json() && response.json().Admin;
         console.log(response.text());
         if(response.text() === 'true')
         {
           return false;
         }

           else{
             return true;
           }
        
       })
       .catch(this.handleError);
     }

     addFlight(flight: Flight): Promise<Flight>{
       return this._http.post('http://localhost:8625/GriffinAirways/admin/flight/add',
       JSON.stringify(flight),
       {headers : this.headers})
       .toPromise()
       .then(res => res.json() as Flight)
       .catch(this.handleError);
}


updateFlight(flight: Flight): Promise<Flight>{
  const lurl= `http://localhost:8625/GriffinAirways/admin/flight/edit`;
  return this._http.put(lurl,
  JSON.stringify(flight),
  {headers : this.headers})
  .toPromise()
  .then(res => res.json() as Flight)
  .catch(this.handleError);
}

getAllFlights(): Promise<Flight[]>
{
  return this._http.get('http://localhost:8625/GriffinAirways/admin/flights')
  .toPromise()
  .then(res => res.json() as Flight[])
  .catch(this.handleError);
}

getFlightById(flightid: string): Promise<Flight>{
const lurl=`http://localhost:8625/GriffinAirways/admin/flight/${flightid}`;
return this._http
   .get(lurl)
  .toPromise()
  .then(res => res.json() as Flight)
  .catch(this.handleError); 
}

deleteFlight(flightid: string): Promise<void>{
  const lurl=`http://localhost:8625/GriffinAirways/admin/remove/${flightid}`;
  return this._http
     .delete(lurl)
    .toPromise()
    .then(res => null)
    .catch(this.handleError); 
}

addRoute(routes: Route): Promise<Route>{
  return this._http.post('http://localhost:8625/GriffinAirways/admin/route/add',
  JSON.stringify(routes),
  {headers : this.headers})
  .toPromise()
  .then(res => res.json() as Route)
  .catch(this.handleError);
}

updateRoute(route: Route): Promise<Route>{
  return this._http.put('http://localhost:8625/GriffinAirways/admin/route/{routeid}',
  JSON.stringify(route),
  {headers : this.headers})
  .toPromise()
  .then(res => res.json() as Route)
  .catch(this.handleError);
}

getAllRoutes(): Promise<Route[]>
{
  return this._http.get('http://localhost:8625/GriffinAirways/admin/routes')
  .toPromise()
  .then(res => res.json() as Route[])
  .catch(this.handleError);
}

getRouteById(routeid: string): Promise<Route>{
  const lurl=`http://localhost:8625/GriffinAirways/admin/route/${routeid}`;
  return this._http
     .get(lurl)
    .toPromise()
    .then(res => res.json() as Route)
    .catch(this.handleError); 
  }

  deleteRoute(routeid: string): Promise<void>{
    const lurl=`http://localhost:8625/GriffinAirways/admin/remove/${routeid}`;
    return this._http
       .delete(lurl)
      .toPromise()
      .then(res => null)
      .catch(this.handleError); 
  }

  addLocations(location: Location): Promise<Location>{
    return this._http.post('http://localhost:8625/GriffinAirways/admin/location/add',
    JSON.stringify(location),
    {headers : this.headers})
    .toPromise()
    .then(res => res.json() as Location)
    .catch(this.handleError);
  }

  updateLocation(location: Location): Promise<Location>{
    return this._http.put('http://localhost:8625/GriffinAirways/admin/location/{locId}',
    JSON.stringify(location))
    .toPromise()
    .then(res => res.json() as Location)
    .catch(this.handleError);
  }

  getAllLocations(): Promise<Location[]>
{
  return this._http.get('http://localhost:8625/GriffinAirways/admin/locations')
  .toPromise()
  .then(res => res.json() as Location[])
  .catch(this.handleError);
}

getLocationById(locId: string): Promise<Location>{
  const lurl=`http://localhost:8625/GriffinAirways/admin/location/${locId}`;
  return this._http
     .get(lurl)
    .toPromise()
    .then(res => res.json() as Location)
    .catch(this.handleError); 
  }

  deleteLocation(locId: string): Promise<void>{
    const lurl=`http://localhost:8625/GriffinAirways/admin/remove/${locId}`;
    return this._http
       .delete(lurl)
      .toPromise()
      .then(res => null)
      .catch(this.handleError); 
  }

  addSchedules(schedule: Schedule): Promise<Schedule>{
    return this._http.post('http://localhost:8625/GriffinAirways/admin/schedules/add',
    JSON.stringify(schedule))
    .toPromise()
    .then(res => res.json() as Schedule)
    .catch(this.handleError);
  }

  updateSchedule(schedule: Schedule): Promise<Schedule>{
    return this._http.put('http://localhost:8625/GriffinAirways/admin/schedule/{scheId}',
    JSON.stringify(schedule),
    {headers : this.headers})
    .toPromise()
    .then(res => res.json() as Schedule)
    .catch(this.handleError);
  }

  getAllSchedules(): Promise<Schedule[]>
{
  return this._http.get('http://localhost:8625/GriffinAirways/admin/schedules')
  .toPromise()
  .then(res => res.json() as Schedule[])
  .catch(this.handleError);
}  

getScheduleById(scheId: string): Promise<Schedule>{
  const lurl=`http://localhost:8625/GriffinAirways/admin/location/${scheId}`;
  return this._http
     .get(lurl)
    .toPromise()
    .then(res => res.json() as Schedule)
    .catch(this.handleError); 
  }

  deleteSchedule(scheId: string): Promise<void>{
    const lurl=`http://localhost:8625/GriffinAirways/admin/remove/${scheId}`;
    return this._http
       .delete(lurl)
      .toPromise()
      .then(res => null)
      .catch(this.handleError); 
  }


}
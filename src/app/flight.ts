import { Route } from "./route";
import { Admin } from "./admin";

export class Flight {
    flightId:string;
    fname:string;
    reserveSeat:number;
    seatCap:number;
    flightType:string;

    route:Route;
    admin:Admin;

}

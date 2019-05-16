import { PassengerInfo } from "./passenger-info";
import { Schedule } from "./schedule";
import { Customer } from "./customer";

export class TicketInfo {

    ticketId:string;
    paymentId:number;
    seatInfo:string;

    passengerInfo:PassengerInfo;
    schedule:Schedule;
    customer:Customer;

    
}

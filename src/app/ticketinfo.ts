import { Passengerinfo } from "./passengerinfo";
import { Schedule } from "./schedule";
import { Customers } from "./customers";

export class Ticketinfo {
    ticketId: string;
	paymentId: number;
    seatInfo: string;
    passengerInfo: Passengerinfo;
    schedule: Schedule;
    customer: Customers;

}

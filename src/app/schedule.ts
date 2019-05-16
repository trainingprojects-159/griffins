import { Flight } from "./flight";
import { Route } from "./route";
import { Admin } from "./admin";

export class Schedule {
    scheId: string;
    scheDate: string;
    flight: Flight;
    route: Route;
    admin: Admin;
}

import { Admin } from "./admin";
import { Location } from "./location";

export class Route {
    routeId: string;
    distance: number;
    duration: number;
    cost: number;
    source: Location;
    destination: Location;
    //admin: Admin;

}

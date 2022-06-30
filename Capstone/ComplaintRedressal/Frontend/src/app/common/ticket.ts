import { Customer } from "./customer";
import { Engineer } from "./engineer";

export class Ticket {
    id:number;
    address: string
    customer:Customer;
    engineer:Engineer;
    description: string;
    issueType: string;
    mobile: string;
    serviceType: string;
    zipcode: string;
    createdOn:Date;
    updatedOn:Date;
    status:string;
    // notes:string[];
}

import { Ticket } from "./ticket";

export class Notes {
    id:number;
    ticket:Ticket;
    comments:string;
    updatedBy:string;
    createdOn:Date;
    isCustomer:boolean;

}


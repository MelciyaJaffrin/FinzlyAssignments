import {pet} from './pet';

export class dog extends pet{
    
    name:string;

    constructor(name:string){
        super();
        this.name = name;
    }
    override display(){
        console.log("This is dog class");
        console.log("Name of dog is: "+ this.name);
    }
}
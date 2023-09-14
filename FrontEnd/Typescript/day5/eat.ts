import {dog} from './dog';

export class eat extends dog{

    override display(){
        console.log("Dog "+this.name+" is eating");
    }
}
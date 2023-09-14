import {pet} from '../day5/pet'

class cat extends pet{

    override display(): void {

        console.log("This is cat class inherited from pet class");
        
    }
}

let catObj = new cat();
catObj.display();
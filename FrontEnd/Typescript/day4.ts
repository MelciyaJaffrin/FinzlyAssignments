//Display class data using advance features of Javascript

export class student{

    id:number;
    name:string;
    dept:string;

    constructor(id:number,name:string, dept:string){
        this.id=id;
        this.name= name;
        this.dept=dept;

    }

    display(){
        console.log(`
                id  :${this.id}
                name:${this.name}
                Dept:${this.dept}
        `)
    }
}
// let obj=new student(1,"jaff","CSE")
// obj.display()
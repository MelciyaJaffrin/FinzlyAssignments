//Anonymous Functions
//1. Without parameter and without return type

let temp1=function(){
    console.log("Anonymous Function");
}
temp1();

//2. With parameter and without return type
let temp2=function(a:number,b:number){
    console.log("Addition of number "+a+" and "+b+" is: "+(a+b));
}
temp2(10,2);

//3. Without parameter and with return type
let temp3 = function():number{
    return (10+5);
}
let res = temp3();
console.log("Addition of two numbers is: "+res);

//4. With parameter and with return type
let temp4=function(c:number, d:number):number{
    return (c+d);
}
let res1= temp4(10,10);
console.log("Addition of two numbers is: "+res1);

//Fat Arrow Function
//1. Without parameter and without return type
let temp5 = () => {
    console.log("Fat arrow function");
}
temp5();

//2. With parameter and without return type
let temp6 = (a:number,b:number) => {
    console.log("Addition of number "+a+" and "+b+" is: "+(a+b));
}
temp6(2,2);

//3. Without parameter and with return type
let temp7 = ():number =>{
    return (100+10);
}
let res2 = temp7();
console.log("Addition of two numbers is: "+res2);

//4. With parameter and with return type
let temp8= (a:number,b:number):number => {
    return (a+b);
}
let res3 = temp8(1000,50);
console.log("Addition of two numbers is:"+res3);





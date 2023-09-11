//Anonymous Functions
//1. Without parameter and without return type
var temp1 = function () {
    console.log("Anonymous Function");
};
temp1();
//2. With parameter and without return type
var temp2 = function (a, b) {
    console.log("Addition of number " + a + " and " + b + " is: " + (a + b));
};
temp2(10, 2);
//3. Without parameter and with return type
var temp3 = function () {
    return (10 + 5);
};
var res = temp3();
console.log("Addition of two numbers is: " + res);
//4. With parameter and with return type
var temp4 = function (c, d) {
    return (c + d);
};
var res1 = temp4(10, 10);
console.log("Addition of two numbers is: " + res1);
//Fat Arrow Function
//1. Without parameter and without return type
var temp5 = function () {
    console.log("Fat arrow function");
};
temp5();
//2. With parameter and without return type
var temp6 = function (a, b) {
    console.log("Addition of number " + a + " and " + b + " is: " + (a + b));
};
temp6(2, 2);
//3. Without parameter and with return type
var temp7 = function () {
    return (100 + 10);
};
var res2 = temp7();
console.log("Addition of two numbers is: " + res2);
//4. With parameter and with return type
var temp8 = function (a, b) {
    return (a + b);
};
var res3 = temp8(1000, 50);
console.log("Addition of two numbers is:" + res3);

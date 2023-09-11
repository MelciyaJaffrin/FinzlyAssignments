//Home Work
let k:string[]=[];
k.push("Jaff");
k.push("Bismi","Jesi");
k.splice(2,0,"Ambi","Jini");
k.splice(4,0,"Chan");

console.log(k.join(" - "));

for(let i=0;i<k.length;i++)
{
    console.log("Name in the index "+i+" is "+k[i]);
}
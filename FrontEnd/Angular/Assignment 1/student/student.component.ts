import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {

  name:string = "Melciya Jaffrin";
  age:number = 22;

  constructor() { }

  ngOnInit(): void {
  }

}

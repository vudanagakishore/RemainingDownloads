import { Component, OnInit } from '@angular/core';
import { Employee, MyServiceService } from '../my-service.service';

@Component({
  selector: 'app-employee-add',
  templateUrl: './employee-add.component.html',
  styleUrls: ['./employee-add.component.css']
})
export class EmployeeAddComponent implements OnInit {

  createdEmployee:Employee;

  createdFlag:boolean=false;

  service:MyServiceService;

  constructor(service:MyServiceService) 
  {
    this.service=service;
  }

  ngOnInit() {
  }

  add(data:any){
    this.createdEmployee=new Employee(data.eid,data.ename,data.gender,data.edesignation,data.Salary,data.eaddress,data.econtact);
    this.service.add(this.createdEmployee);
    alert("Added Succesfully!!!");
    this.createdFlag=true;
   }
}

import { Component, OnInit } from '@angular/core';
import { MyServiceService, Employee } from '../my-service.service';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css'],
})
export class EmployeeListComponent implements OnInit {

  service:MyServiceService;
  constructor(service:MyServiceService) { 
    this.service=service;
  }

  employees:Employee[]=[];
  

  delete(eid:number)
  {
    this.service.delete(eid);
    this.employees=this.service.getEmployees();
  }

  isUpdate:boolean=true;
  updateData()
  {
    this.isUpdate=!this.isUpdate;
  }
  update(data:any)
  {
    this.service.update(data);
    this.employees=this.service.getEmployees();
  }

  column:string="id"; 
  order:boolean=true;

  sort(column:string)
  {    
    if(this.column==column )
    {
      this.order=!this.order;
    }
    else
    {
      this.order=true;
      this.column=column;
    }
  }
  
  ngOnInit() {
    this.service.fetchEmployees();
    this.employees=this.service.getEmployees();
  }

  
}

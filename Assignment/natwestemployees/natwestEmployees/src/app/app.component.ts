import { Component, OnInit } from '@angular/core';
import { Employees } from './employees';
import { EmployeesService } from './employees.service';
import { NgForm } from '@angular/forms';
import { HttpErrorResponse } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
 
  // public employees: Employees[];
  // public editEmployee: Employees;
  // public deleteEmployee: Employees;
  public employees: Employees[] = []; 
  public editEmployee: Employees = {} as Employees; 
  public deleteEmployee: Employees = {} as Employees; 

  constructor(private employeeServices: EmployeesService) { }
      ngOnInit() {
    this.getEmployees();
    
  }

  public getEmployees(): void {
    this.employeeServices.getEmployees().subscribe(
      (response: Employees[]) => {
        this.employees = response;
        console.log(this.employees);
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
  }
  public onAddEmloyee(addForm: NgForm): void {
    document.getElementById('add-employee-form').click();
    this.employeeServices.addEmployee(addForm.value).subscribe(
      (response: Employees) => {
        console.log(response);
        this.getEmployees();
        addForm.reset();
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
        addForm.reset();
      }
    );
  }

  public onUpdateEmployee(employee: Employees): void {
    this.employeeServices.updateEmployee(employee).subscribe(
      (response: Employees) => {
        console.log(response);
        this.getEmployees();
      },
      (error: HttpErrorResponse) => {
        alert(error.message);
      }
    );
    }
    public onDeleteEmployee(employeeId: number): void {
      this.employeeServices.deleteEmployee(employeeId).subscribe(
        (response: void) => {
          console.log(response);
          this.getEmployees();
        },
        (error: HttpErrorResponse) => {
          alert(error.message);
        }
      );
      }
      public searchEmployees(key: string): void {
        console.log(key);
        const results: Employees[] = [];
        for (const employee of this.employees) {
          if (employee.name.toLowerCase().indexOf(key.toLowerCase()) !== -1
            || employee.email.toLowerCase().indexOf(key.toLowerCase()) !== -1
            || employee.jobtitle.toLowerCase().indexOf(key.toLowerCase()) !== -1
            || employee.phone.toLowerCase().indexOf(key.toLowerCase()) !== -1
            || employee.employeeCode.toLowerCase().indexOf(key.toLowerCase()) !== -1) {
            results.push(employee);
          
        }
      }
      this.employees = results;
      if (results.length === 0 || !key) {
        this.getEmployees();
      
      }

} 
public onOpenModal(employee: Employees, mode: string): void {
  const container = document.getElementById('main-container');
  const button = document.createElement('button');
  button.type = 'button';
  button.style.display = 'none';
  button.setAttribute('data-toggle', 'modal');
  if (mode === 'add') {
    button.setAttribute('data-target', '#addEmployeeModal');
  }
  if (mode === 'edit') {
    this.editEmployee = employee;
    button.setAttribute('data-target', '#updateEmployeeModal');
  }
  if (mode === 'delete') {
    this.deleteEmployee = employee;
    button.setAttribute('data-target', '#deleteEmployeeModal');
  }
  if (container) {
    container.appendChild(button);
    button.click();
}
  //container.appendChild(button);
 // button.click();

}
}
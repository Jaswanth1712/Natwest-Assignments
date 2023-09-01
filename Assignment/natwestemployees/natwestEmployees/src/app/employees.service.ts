import { Injectable } from '@angular/core';
import { Employees } from './employees';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EmployeesService {
  public deleteEmployee(employeeId: number) {
    return this.http.delete<Employees>('http://localhost:3000/employees/delete/${employeeId}');
  }
  public updateEmployee(employee: Employees): Observable<Employees> {
    return this.http.put<Employees>('http://localhost:3000/employees/update', employee);
  }
  public addEmployee(employee:Employees) {
    return this.http.post<Employees>('http://localhost:3000/employees/add', employee);
  }
  public getEmployees(): Observable<Employees[]> {
    return this.http.get<Employees[]>('http://localhost:3000/employees/all');
  }

  constructor(private http: HttpClient) { }
}
import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class PersonserviceService {
  getUsers() {
    return this.http.get("http://localhost:3000/personaldetails");
  }
  public deleteUser(emailid: any) {
    return this.http.delete("http://localhost:3000/deletedetails/"+emailid);
  }
  public getUserByEmailId(emailid: string | String | undefined) {
    return this.http.get("http://localhost:3000/personaldetails/emailid/" + emailid);
  }
  constructor(private http: HttpClient) { }
  public doRegistration(user: any){
    return this.http.post("http://localhost:3000/bank",user,{responseType:'text' as 'json'});
  }
}
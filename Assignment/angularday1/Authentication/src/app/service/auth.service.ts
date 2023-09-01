import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  constructor(private http:HttpClient) { }

  apiurl = "http://localhost:3000/user";
  RegisterUser(inputData:any){
    return this.http.post(this.apiurl,inputData);
  }

  getAll(){
    return this.http.get(this.apiurl);
  }

  updateUser(inputData:any,id:any){
    return this.http.put(this.apiurl+"/"+id,inputData);
  }

  getUserbyCode(id:any){
    return this.http.get(this.apiurl+"/"+id);
  }

  isLoggedIn(){
    return sessionStorage.getItem('username')!=null;
  }

  getUserrole(){
    return sessionStorage.getItem('userrole')!=null?sessionStorage.getItem('userrole')?.toString():'';
  }
  

}
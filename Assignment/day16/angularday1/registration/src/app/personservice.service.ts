import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class PersonserviceService {
  constructor(private http: HttpClient) { }
  public doRegistration(user:any) {
    return this.http.post("http://localhost:3000/bank", user,{responseType:'text'as 'json'});
  }
}

import { Component, OnInit } from '@angular/core';
import { PersonserviceService } from '../personservice.service';
@Component({
  selector: 'app-search-delete',
  templateUrl: './search-delete.component.html',
  styleUrls: ['./search-delete.component.css']
})
export class SearchDeleteComponent implements OnInit {
   users:any;
   emailid:String | undefined;
  constructor(private service:PersonserviceService) { }
  public findUserByEmailId(){
    let resp=this.service.getUserByEmailId(this.emailid);
    resp.subscribe((data: any)=>this.users=data);
  }
  public deleteUser(id:string){
    let resp=this.service.deleteUser(id);
    resp.subscribe((data)=>this.users=data);
  }
  ngOnInit() {
    let resp=this.service.getUsers();
    resp.subscribe((data)=>this.users=data);
  }
}
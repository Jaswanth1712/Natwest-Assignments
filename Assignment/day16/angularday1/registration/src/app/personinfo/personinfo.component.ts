import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { PersonserviceService } from '../personservice.service';

@Component({
  selector: 'app-personinfo',
  templateUrl: './personinfo.component.html',
  styleUrls: ['./personinfo.component.css']
})
export class PersoninfoComponent implements OnInit {
  message: any;
  user: User=new User("","","","","","","","","","","");
  constructor(private  service:PersonserviceService) { }
  ngOnInit() {
  }
  public registerNow() {
    let resp=this.service.doRegistration(this.user);
    resp.subscribe((data)=>this.message=data);
}
}







import { Component, DoCheck } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements DoCheck{
  title = 'Authentication';
  isadmin = false;
  isMenuVisible = false;
  ismenurequired : boolean | undefined;
  constructor(private router:Router){
    
  }
  ngDoCheck(): void {
    let currenturl = this.router.url;
    if(currenturl=='/login'||currenturl=='/register'){
      this.ismenurequired=false
    }else{
      this.ismenurequired=true
    }
  }
}
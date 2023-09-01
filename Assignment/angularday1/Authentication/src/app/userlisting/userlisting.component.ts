import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from '../service/auth.service';
import { MatTable, MatTableDataSource } from '@angular/material/table';
import { UpdatepopupComponent } from '../updatepopup/updatepopup.component';
import { MatDialog } from '@angular/material/dialog';

@Component({
  selector: 'app-userlisting',
  templateUrl: './userlisting.component.html',
  styleUrls: ['./userlisting.component.css']
})
export class UserlistingComponent {
  paginator: any;
  constructor(private router:Router,private service:AuthService, private dialog:MatDialog){
this.loadUser();
  }
  userlisting:any;
  dataSource:any;
  loadUser(){
    this.service.getAll().subscribe(res=>{
      this.userlisting=res;
      this.dataSource=new MatTableDataSource(this.userlisting);
      this.dataSource.paginator=this.paginator;
    });
  }

  displayedColumns: string[] = ['username', 'name', 'email','role','status','action'];


  updateUser(code:any){
    this.dialog.open(UpdatepopupComponent,{
      enterAnimationDuration: '1000ms',
      exitAnimationDuration:'500ms',
      width: '50%',
      data:{
        usercode:code
      }
    })
  }
  opendialog(){

  }
}
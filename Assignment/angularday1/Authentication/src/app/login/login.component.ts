import { Component } from '@angular/core';
import { FormBuilder,Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { ToastrService } from 'ngx-toastr';
import { AuthService } from '../service/auth.service';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  constructor(private builder: FormBuilder, private router: Router, private toastr: ToastrService,private service:AuthService) {
  }
  result:any;
  loginForm = this.builder.group({
    id:this.builder.control('',Validators.required),
    password:this.builder.control('',Validators.required)
  });
  proceedLogin(){
    if(this.loginForm.valid){
      this.service.getUserbyCode(this.loginForm.value.id).subscribe(item=>{
        this.result=item;
        if (this.result.password===this.loginForm.value.password){
          if (this.result.isactive){
          sessionStorage.setItem('username',this.result.id);
          sessionStorage.setItem('role',this.result.role);
          this.router.navigate(['']);
        }else{
          this.toastr.error('pls contact to administrator','inactive user');
        }
      }
      else{
          this.toastr.error('invalid credentials');
        }
      });
  }
      else{
        this.toastr.warning ('ples enter valid data');
      }
      }
   }
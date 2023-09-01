import { Component } from '@angular/core';
import { FormBuilder, Validators } from '@angular/forms';
import { ToastrService } from 'ngx-toastr';
import { AuthService } from '../service/auth.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-updatepopup',
  templateUrl: './updatepopup.component.html',
  styleUrls: ['./updatepopup.component.css']
})
export class UpdatepopupComponent {

  constructor(private builder: FormBuilder, private router: Router, private service:AuthService) {

  }

  
  updatepopupForm = this.builder.group({
    id: this.builder.control(""),
    name: this.builder.control(""),
    password: this.builder.control("",),
    email: this.builder.control("''",),
    gender: this.builder.control('male'),
    role: this.builder.control(""),
    isactive: this.builder.control(false)
  });

  updatepopup(){
this.service.updatepopup(this.registerForm.value.id, this.registerForm)

  }
}

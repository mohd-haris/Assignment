import { Component, OnInit } from '@angular/core';
import { FormGroup } from '@angular/forms';
import {FormBuilder, Validators} from '@angular/forms';
@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styles: []
})
export class LoginComponent implements OnInit {
  loginform: FormGroup;
  submitted = false;
  invalidLogin = false;
  constructor(private formbuilder: FormBuilder) { }

  ngOnInit() {
    this.loginform = this.formbuilder.group({
      email: ['', Validators.required],
      password: ['', Validators.required]
    });
  }

  onSubmit() {
    this.submitted = true;
    if (this.loginform.invalid) {
      console.log('Invalid form');
      return;

    }
    if (this.loginform.controls.email.value === 'abcd@gmail.com' && this.loginform.controls.password.value === 'password') {
      window.alert('Login successful');
    }
   else {
      this.invalidLogin = true;

    }
  }

}

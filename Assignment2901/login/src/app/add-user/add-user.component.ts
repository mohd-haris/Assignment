import { Component, OnInit } from '@angular/core';
import { FormBuilder, Validators, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-add-user',
  templateUrl: './add-user.component.html',
  styleUrls: ['./add-user.component.css']
})
export class AddUserComponent implements OnInit {
  addForm: FormGroup;
  submitted = false;
  invalidAdd = false;
  name = '[a-zA-Z ]*';
 mobnumPattern = '^((\\+91-?)|0)?[0-9]{10}$';
 emailPattern = '^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$' ;
 pwdpattern = '(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[$@$!%*?&])[A-Za-z\d$@$!%*?&].{8,}$';
  constructor(private formBuilder: FormBuilder) { }

  ngOnInit() {
    this.addForm = this.formBuilder.group({
      id : ['', Validators.required, Validators.pattern],
      name: ['', Validators.required , Validators.pattern],
      username: ['', Validators.required],
      email: ['', Validators.required, Validators.pattern],
      password : ['', Validators.required, Validators.pattern],
      mobile : ['', Validators.required, Validators.pattern],
      });
  }
  onSubmit() {
    this.submitted = true;
    if (this.addForm.invalid) {
    window.alert('Form invalid');
    return;
    }
    else {
    this.invalidAdd = true;
    window.alert('Registered');
    }
    }



}

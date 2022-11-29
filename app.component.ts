import { Component } from '@angular/core';
import {FormControl,FormGroup,Validators} from '@angular/forms'

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  loginForm= new FormGroup({
    username: new FormControl('Shreya',[Validators.required]),
    password: new FormControl('Shreya',[Validators.required]),
  })
  get username(){
    return this.loginForm.get('username')
  }
  get password(){
    return this.loginForm.get('password')
  }
  loginUser()
  {
    console.warn(this.loginForm.value)
  }

 
}

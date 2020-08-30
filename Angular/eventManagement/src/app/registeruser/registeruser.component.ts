import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-registeruser',
  templateUrl: './registeruser.component.html',
  styleUrls: ['./registeruser.component.css']
})
export class RegisteruserComponent implements OnInit {
  fname: String;
  lname: String;
  email: string;
  pwd: String;
  cpwd: String;

  headers = new Headers
  args: 
  {
    headers:({'Content-Type': 'application/json'})
  }

  url = 'https://localhost:8080/api/user';

  constructor(private http: HttpClient) { 
    this.fname;
    this.lname;
    this.email;
    this.pwd;
    this.cpwd;
  }

  postedData = [{
    "fname": this.fname,
    "lname": this.lname,
    "email": this.email,
    "pwd": this.pwd,
    "cpwd": this.cpwd 
  }]

  postData()
    {
      let obs = this.http.post(this.url, this.postedData, this.args);
      obs.subscribe((response)=>console.log(response))
    }
    
  ngOnInit(): void {
  }

}

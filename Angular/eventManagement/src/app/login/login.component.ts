import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  uname: String;
  pwd: String;

  headers = new Headers
  args:
  {
    headers:({'Contact-type': 'application/json'})
  }

  url = "https://localhost:8080/api/user";

  constructor(private http: HttpClient) { 
    this.uname;
    this.pwd;
  }

  postedData = [{
    "uname": this.uname,
    "pwd": this.pwd
  }]

  postData()
  {
    let obs = this.http.post(this.url, this.postedData, this.args);
    obs.subscribe((response)=>console.log(response))
  }

  ngOnInit(): void {
  }

}

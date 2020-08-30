import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-add-event',
  templateUrl: './add-event.component.html',
  styleUrls: ['./add-event.component.css']
})
export class AddEventComponent implements OnInit {
  event_name: String;
  event_date: String;
  event_time: String;
  eplace: String;
  event_type: String;
  sdescp: String;
  ldescp: String;

  headers = new Headers
  args:
  {
    headers:({'Contennt-Type': 'application/json'})
  }
  
  url = 'https://localhost:8081/api/event';

  constructor(public http: HttpClient) { 
    this.event_name;
    this.event_date;
    this.event_time;
    this.eplace;
    this.event_type;
    this.sdescp;
    this.ldescp;
  }
  
  postedData = [{
      "event_name": this.event_name,
      "event_date": this.event_date,
      "event_time": this.event_time,
      "place": this.eplace,
      "event_type": this.event_type,
      "sdescp": this.sdescp,
      "ldescp": this.ldescp
    }]

    postData()
    {
      let obs = this.http.post(this.url, this.postedData, this.args);
      obs.subscribe((response)=>console.log(response))
    }

  ngOnInit(): void {
  }
  //getData()
  //{
  //  let obs = this.http.get(this.url);
  //  obs.subscribe( (response) => {
  //    this.res = JSON.stringify(response);
  //  });
  //};
}

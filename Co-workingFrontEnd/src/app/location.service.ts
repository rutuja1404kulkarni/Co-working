import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class LocationService {


  location:any;


  constructor(private httpClient:HttpClient) { }

  getSpaceByLocation(location):any{
    console.log("In location Service");
    return this.httpClient.get(`http://localhost:8099/v1/api/space/location/${location}`);
  }
}

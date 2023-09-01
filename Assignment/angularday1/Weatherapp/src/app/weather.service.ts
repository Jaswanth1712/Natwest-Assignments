import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { WeatherData } from './weather/weather.module';
import { environment } from 'src/environments/environment';
@Injectable({
  providedIn: 'root'
})
export class WeatherService {
    constructor(private http: HttpClient) { }
    public getWeatherData(cityName: string):Observable<WeatherData> {
    return this.http.get<WeatherData>(environment.weatherBaseUrl + '/city/'+ cityName,{
         headers:new HttpHeaders()
           .set(environment.XRapidAPIHostName, environment.XRapidAPIHostValue)
           .set(environment.XRapidAPIKeyName, environment.XRapidAPIKeyValue)
    });
  }
}
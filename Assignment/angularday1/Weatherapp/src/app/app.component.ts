import { Component, OnInit } from '@angular/core';
import { WeatherData } from './weather/weather.module';
import { WeatherService } from './weather.service';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.less']
})
export class AppComponent  implements OnInit{
  cityName: string;
  weatherData?: WeatherData;
   constructor(private weatherService: WeatherService){
    this.cityName='Mumbai';
   }
  ngOnInit(): void {
    this.getWeatherData(this.cityName);
    this.cityName = '';
  }
  getWeatherData(cityName: string) {
    this.weatherService.getWeatherData(cityName).subscribe({
      next:(response)=>{
        this.weatherData = response;
        console.log(response)
      }
    });
  }
onSubmit() {
  this.getWeatherData(this.cityName);
  this.cityName = '';
}
}
package se.chasacademy.fredrikhallstrom.PracticeTasks.taskLibrary.WeatherReport;

import se.chasacademy.fredrikhallstrom.PracticeTasks.taskLibrary.TaskTemplate;

public class WeatherReport implements TaskTemplate {
    @Override
    public void start() {
        Weather nowWeather = Weather.SUNNY;

        switch (nowWeather) {
            case SUNNY -> IO.println("Det är soligt idag");
            case CLOUDY -> IO.println("Solen skiner men ovanför molnen...");
            case RAINY -> IO.println("Det regnar idag.\nKom ihåg paraplyet!!");
            case SNOWY -> IO.println("Äntligen snö, nu tankar vi snöskotrarna!!!");
        }
    }

}

package model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
public class Location {
   private String CountryName;
   private String cityName;
   private String CountryCode;
   private String cityAbbreviation;

   public String getLocationInfo() {
      FacadeWeatherConditions weather = new FacadeWeatherConditions();
      return weather.getWeatherConditions();
   }

}

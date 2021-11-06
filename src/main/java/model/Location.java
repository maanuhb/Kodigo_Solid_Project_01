package model;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
public class Location {
   @NonNull
   private String CountryName;
   @NonNull
   private String CountryCode;
   private String cityName;
   private String cityAbbreviation;

   public String getLocationInfo() {
      return CountryName + " " + cityName + " " + cityAbbreviation;
   }
}

package model;

import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class Location {
   @NonNull
   private String CountryName;
   @NonNull
   private String CountryCode;
   private String cityName;
   private String cityAbbreviation;
   private String longitude;
   private String latitude;

   public String getLocationInfo() {
      return CountryName + " " + cityName;
   }

}

package model;


public class Location {
   private String CountryName;
   private String cityName;
   private String cityAbbreviation;

   public String getLocationInfo() {
      return CountryName + " " + cityName + " " + cityAbbreviation;
   }
}

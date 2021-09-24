/*
The functions should have a double value as the parameter or an integer value
and should also return a double value.
*/
public class CtoFTester {
  public static double celsiusToFahrenheit(double celsius){
    double fahr = (celsius * 9/5 + 32);
    return fahr;
  }

  public static double FahrenheitToCelsius(double fahr){
    double cel = ((fahr - 32) / 1.8);
    return cel;
  }
  public static void main (String[]args){
    System.out.println("13.4 degrees celsius is " + celsiusToFahrenheit (13.4) + " degrees fahrenheit.");
    System.out.println("115.2 degrees fahrenheit is " + FahrenheitToCelsius (115.2) + " degrees celsius.");
    }
}

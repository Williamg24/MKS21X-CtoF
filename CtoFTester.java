/*
The functions should have a double value as the parameter or an integer value
and should also return a double value.
*/
public class CtoFTester {
  public static double celsiusToFahrenheit(double celsius){
    double fahr = (celsius * 9/5 + 32);
    return fahr;
  }

  public static void main (String[]args){
    System.out.println(celsiusToFahrenheit (13.4));
    }
}

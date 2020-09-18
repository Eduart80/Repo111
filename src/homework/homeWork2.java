package homework;

import java.util.Scanner;

public class homeWork2 {
    public static void main(String[] args) {


        /*     Fahrenheit to Celsius
         *    F = ( °C - 32) * 5/9
         */
        double tFahrenheit = 100;
        double tCelsius = (tFahrenheit -32 ) * 5/9;
        System.out.println("100 Fahrenheit is equal to "+ tCelsius + " degree celsius.");

        /*      Kelvin to Fahrenheit
         *    F = T(K) × 9/5 - 459.67
         */
        double tKelvin = 220;
        double ttFahrenheit = tKelvin * 9/5 - 459.67;
        System.out.println("220 Kelvin is equal to "+ ttFahrenheit + " degree Fahrenheit" );

        /*      Kelvin to Celsius
         *    C = T(K) - 273.15
         */
        double ttCelsius = 30;
        double ttKelvin = ttCelsius - 273.15;
        System.out.println("30 Kelvin is equal to "+ ttKelvin + " degree Celsius" );

        /*      Fahrenheit to Kelvin
         *    T(K) = (T(°F) + 459.67)× 5/9
         */
        double tmFahrenheit = 100;
        double tmKelvin = (tmFahrenheit + 459.67)  * 5/9;
        System.out.println("100 deg fahrenheit is equal to "+ tmKelvin + " degree Kelvin" );

        /*    Celsius to Fahrenheit
         *    T(°F) = T(°C) × 9/5 + 32
         */
        double tmCelsius = 100;
        double tmpFahrenheit = tmCelsius *9/5 + 32;
        System.out.println("100 deg Celsius is equal to "+ tmpFahrenheit + " degree Fahrenheit" );

        /*    Celsius to Kelvin
         *    T(K) = T(°C) + 273.15
         */
        double tmpCelsius = 10;
        double tmpKelvin = tmpCelsius + 273.15;
        System.out.println("10 deg Celsius is equal to "+ tmpKelvin + " degree Kelvin" );


    }
}

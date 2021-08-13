/*
 * ---------------------------------------------------------------------------
 * File name: Temp.java
 * Project name: Conversion
 * ---------------------------------------------------------------------------
 * Creator's name and email: Matt Harrison, harrisonms1@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: 3/20/2019
 * ---------------------------------------------------------------------------
 */
import java.util.Scanner;
public class Temp
{
	// TODO: implement the Temp class


	public static double CelsiusToFahrenheit(double cf)
	{
		return (cf*1.8)+32;

	}
	public static double FahrenheitToCelsius(double fc)
	{

		return (fc-32)/1.8;

	}


	public static double CelsiusToKelvin(double ck)
	{

		return ck+273.15;

	}

	public static double FahrenheitToKelvin(double fk)
	{

		return (fk-32)*1.8+32;

	}

	public static double KelvinToCelsius (double kc)
	{
		return kc-273.15;


	}

	public  static  double KelvinToFahrenheit (double kf)
	{
		return (kf-273.15)*1.8+32;
	}


}

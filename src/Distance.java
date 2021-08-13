/*
 * ---------------------------------------------------------------------------
 * File name: Distance.java
 * Project name: Conversion
 * ---------------------------------------------------------------------------
 * Creator's name and email: Matt Harrison, harrisonms1@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: 3/20/2019
 * ---------------------------------------------------------------------------
 */

public class Distance
{
	// TODO: implement the Distance class

	public static double MilesToKilometer (double mkm)
	{
		return mkm*1.60934;
	}

	public static double MilesToNauticalMile(double mnm)
	{
		return mnm*0.868976;
	}

	public static double MilesToMeter(double mmeter)
    {
    	return mmeter*1609.34;
    }

    public static double MilesToFeet(double mfeet)
    {
	    return mfeet*5280;
    }

    public static double KilometerToMiles(double kmiles)
    {
    	return kmiles*0.621371;
    }

    public static double KilometerToNauticalMile(double knm)
    {
	    return knm*0.539957;
    }

	public static double KilometerToMeter(double kmeter)
	{
		return kmeter*1000;
	}

	public static double KilometerToFeet(double kfeet)
	{
		return kfeet*32803.84;
	}

	public static double NauticalMileToMiles(double nmmiles)
	{
		return nmmiles*1.15078;
	}

	public static double NauticalMileToKilometer(double nmkm)
	{
		return nmkm*1.852;
	}

	public static double NauticalMileToMeters(double nmmeters)
	{
		return nmmeters*1852;
	}

	public static double NauticalMileToFeet(double nmfeet)
	{
		return nmfeet*6076.12;
	}

	public static double MeterToMiles(double mmiles)
	{
		return mmiles*0.000621371;
	}

	public static double MeterToKilometer(double meterkm)
	{
		return meterkm*0.001;
	}

	public static double MeterToNauticalMile(double meternm)
	{
		return meternm*0.000539957;
	}

	public static double MeterToFeet(double meterf)
	{
		return meterf*3.28084;
	}


	public static double FeetToKilometer(double fkm)
	{
		return fkm*0.0003048;
	}

	public static double FeetToNauticalMile(double fnm)
	{
		return fnm*0.000164579;
	}

	public static double FeetToMeters(double fmeters)
	{
		return fmeters*0.3048;
	}

}

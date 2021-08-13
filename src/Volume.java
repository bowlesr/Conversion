/*
 * ---------------------------------------------------------------------------
 * File name: Volume.java
 * Project name: Conversion
 * ---------------------------------------------------------------------------
 * Creator's name and email: Matt Harrison, harrisonms1@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: 3/20/2019
 * ---------------------------------------------------------------------------
 */

public class Volume
{
	// TODO: implement the Volume class

	public static double LiterToMilliliter(double lm)
	{
		return lm*1000;
	}

	public static double LiterToCubicInch(double lci)
	{
		return lci*61.0237;
	}

	public static double MilliliterToLiter(double ml)
	{
		return ml*0.001;
	}

	public static double MillilterToCubicInch(double mci)
	{
		return mci*0.0610237;
	}

	public static double CubicInchToLiter(double cil)
	{
		return cil*0.01638701;
	}

	public static double CubicInchToMilliliter(double cim)
	{
		return cim*16.3871;
	}

}

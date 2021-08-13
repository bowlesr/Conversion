/*
 * ---------------------------------------------------------------------------
 * File name: Weight.java
 * Project name: Conversion
 * ---------------------------------------------------------------------------
 * Creator's name and email: Matt Harrison, harrisonms1@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: 3/20/2019
 * ---------------------------------------------------------------------------
 */

public class Weight
{
	// TODO: implement the Weight class

	public static double MetricTonToImperalTon(double mtit)
	{
		return mtit*0.984207;
	}

	public static double MetricTonToUSTon(double mtust)
	{
		return mtust*1.10231;
	}

	public static double ImperalTonToMetricTon(double itmt)
	{
		return itmt*1.01605;
	}

	public static double ImperalTonToUSTon(double itust)
	{
		return itust*1.12;
	}

	public static double USTonToMetrinTon(double ustmt)
	{
		return ustmt*0.907185;
	}

	public static double USTonToImperalTon(double ustit)
	{
		return ustit*0.892857;
	}

}

/*
 * ---------------------------------------------------------------------------
 * File name: Time.java
 * Project name: Conversion
 * ---------------------------------------------------------------------------
 * Creator's name and email: Matt Harrison, harrisonms1@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: 3/20/2019
 * ---------------------------------------------------------------------------
 */

public class Time
{
	// TODO: implement the Time class

	public static Double SecondToMinute(double sm)
	{
		return sm*60;
	}

	public static Double SecontToHour(double sh)
	{
		return sh*3600;
	}

	public static Double MinuteToSecond(double ms)
	{
		return ms*60;
	}

	public static Double MinuteToHour(double mh)
	{
		return mh/60;
	}

	public static Double HourToMinutes(double hm)
	{
		return hm*60;
	}

	public static Double HourToSeconds(double hs)
	{
		return hs*3600;
	}
}

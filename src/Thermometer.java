/*
 * ---------------------------------------------------------------------------
 * File name: Thermometer.java
 * Project name: Conversion
 * ---------------------------------------------------------------------------
 * Creator's name and email: Matt Harrison, harrisonms1@etsu.edu
 * Course:  CSCI 1260
 * Creation Date: 3/19/2019
 * ---------------------------------------------------------------------------
 */

public class Thermometer
{
	// TODO: implement the Thromometer class

	private int temperature;
	private TempType type;

	public Thermometer(int temperature, TempType type)
	{
		this.temperature = temperature;
		this.type = type;
		//TempType types[] = TempType.values();
	}

	public Thermometer(int temperature, String type) throws Exception
	{
		this.temperature = temperature;
		this.type = TempType.valueOf(Character.toString(type.toUpperCase().charAt(0)));

		// i want to error out if the first letter iws not in sinde the tempYype list
		// C,F,K are valid

		/*if(type.toUpperCase().charAt(0) == 'K' || type.toUpperCase().charAt(0) == 'C' || type.toUpperCase().charAt(0) == 'F')
		{
			this.type = TempType.valueOf(Character.toString(type.toUpperCase().charAt(0)));
		}
		else
		{
			//error
			throw new Exception("invalid type")
		}

		// this will take the first char and moves it back to a string for it to work
		this.type = TempType.valueOf(Character.toString(type.toUpperCase().charAt(0)));
	}

	public Thermometer(int temperature, Char type)
	{
		this.temperature = temperature;
		this.type = TempType.valueOf(Character.toString(type.toUpperCase(type)));
	}*/

	}


	// i want to change F to C
	public void changeType(String type) throws Exception
	{
		if (this.type == TempType.valueOf(type))
		{
			// do something
			throw new Exception("You're a DUMBASS!!!!");
		}
		else
		{
			if(this.type == TempType.C && TempType.valueOf(type) == TempType.F)
			{
				this.temperature = (int) Temp.FahrenheitToCelsius(this.temperature);
				this.type = TempType.F;
			}
			else if(this.type == TempType.F && TempType.valueOf(type) == TempType.C)
			{
				this.temperature = (int) Temp.CelsiusToFahrenheit(this.temperature);
				this.type = TempType.C;
			}



		}
	}

	public void raiseTemp()
	{
		this.temperature ++;
	}

}

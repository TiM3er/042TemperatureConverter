package Kelvin;

public class Kelvin {
	static public void  KelvinToCelsiusz(double TempKel)
	{
		System.out.println(TempKel-272.15 + " C");
	}
	static public void kelvinToFahrenheit(double TempKel)
	{
		double TempFah = (TempKel*1.8)-459.67;
		System.out.println(TempFah + " F");
	}
}

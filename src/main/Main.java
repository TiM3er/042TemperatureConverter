package main;
import Kelvin.Kelvin;
import celsius.Celsius;
import fahrenheita.Fahrenheita;;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


	}
	public static void Kelvin(double temp)
	{
		Kelvin.KelvinToCelsiusz(temp);
		Kelvin.kelvinToFahrenheit(temp);	
	}
	public static void Celsius(double temp)
	{
		Celsius.CelsiusToKelvin(0);
		Celsius.CelsiusToFahrenheit(10);
	}
	public static void Fahrenheita(double temp)
	{
		Fahrenheita.FahrenheitaToCelsius(0);
		Fahrenheita.FahrenheitaToKelvin(60);	
	}

}

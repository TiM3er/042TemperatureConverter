package main;
import java.util.Scanner;

import Kelvin.Kelvin;
import celsius.Celsius;
import fahrenheita.Fahrenheita;;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double temperatura;
		System.out.println("C - celsius\nK - Kelvin\nF - Fahrenheit");
		Scanner scan = new Scanner(System.in);
		char wybur = scan.nextLine().charAt(0);
		System.out.println("Give a Temperature to convert: ");
		temperatura=scan.nextDouble();
		switch (wybur) {
		case 'K':
			Kelvin(temperatura);
		break;
		case 'C':
			Celsius(temperatura);
		break;
		case 'F':
			Fahrenheita(temperatura);
		break;

		default:
			Kelvin(temperatura);
			Celsius(temperatura);
			Fahrenheita(temperatura);
		break;
		}

	}
	public static void Kelvin(double temp)
	{
		System.out.println("From Kelvin to: ");
		Kelvin.KelvinToCelsiusz(temp);
		Kelvin.kelvinToFahrenheit(temp);	
	}
	public static void Celsius(double temp)
	{
		System.out.println("From Celsius to: ");
		Celsius.CelsiusToKelvin(0);
		Celsius.CelsiusToFahrenheit(10);
	}
	public static void Fahrenheita(double temp)
	{
		System.out.println("From Fahrenheita to: ");
		Fahrenheita.FahrenheitaToCelsius(0);
		Fahrenheita.FahrenheitaToKelvin(60);	
	}

}

package fahrenheita;

public class Fahrenheita {
	public static void FahrenheitaToCelsius(double Far)
	{
		System.out.println((Far-32)/1.8 + " C");
	}
	public static void FahrenheitaToKelvin(double Far)
	{
		System.out.println(((Far+459.67)*5)/9 + " K");
	}
}

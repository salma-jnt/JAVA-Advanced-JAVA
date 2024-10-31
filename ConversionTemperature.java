public class ConversionTemperature {
    public static void main(String[] args) {
        double temperatureCelcius = Double . parseDouble ( args [0]) ;
        double temperatureFahrenheit = (9.0 / 5.0)*temperatureCelcius + 32 ;
        System.out.println("Température passée en argument en degrés Celsius : " + temperatureCelcius);
        System.out.println(temperatureCelcius + " degrés Celsius équivalent à " + temperatureFahrenheit + " degrés Fahrenheit");
    }
}
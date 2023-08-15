public class TempFer {
    public static void main(String[] args) {
        for (int celsius = 0; celsius <= 100; celsius++) {
            double fahrenheit = (celsius * 9.0 / 5.0) + 32.0;
            System.out.println(celsius + "°C = " + fahrenheit + "°F");
        }
    }
}


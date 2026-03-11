public class conversaoTemperatura {
    static void main() {
        int temperatura = 24;
        double temperaturaFahrenheit = (temperatura * 1.8) + 32;
        System.out.printf(String.format("A temperatura %d° Celsius em Fahrenheit fica %.1f°", temperatura, temperaturaFahrenheit));
    }
}


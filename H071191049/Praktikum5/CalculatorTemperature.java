public class CalculatorTemperature extends Converter implements Temperature {
    @Override
    void start() {
        System.out.println("Temperature Converter is started");
    }

    @Override
    void stop() {
        System.out.println("Temperature Converter is teminated");
    }

    @Override
    public double celciusToFahrenheit(double value) {
        return (value*(9.0/5.0)) + 32;
    }

    @Override
    public double celciusToKelvin(double value) {
        return value + 273.15;
    }
}
abstract class Converter{

    public abstract void start();
    public abstract void stop();
}

class ConverterData extends Converter implements Data{
   
    public long teraToGiga(long value){
        return value*1024;
    }
    // septi run ulang coba
    public long teraToMega(long value){
        return value*(1024*1024);
    }

    public long teraToKilo(long value){
        return value*(1024*1024*1024);
    }

    @Override
    public void start(){
        System.out.println("Data Converter is started");
    }

    @Override
    public void stop(){
        System.out.println("Data Converter is terminated");
    }
}

class ConverterTemperature extends Converter implements Temperature{

    @Override
    public double celciusToFahrenheit(double value) {
        return value*1.8+32;
    }
    @Override
    public double celciusToKelvin(double value) {
        return value+273.15;
    }

    @Override
    public void start(){
        System.out.println("Calculator Temperature is started");
    }
    @Override
    public void stop(){
        System.out.println("Calculator Temperature is terminated");
    }
}

class ConverterDistance extends Converter implements Distance{
    
    @Override
    public double inchToMetre(double value) {
        return value*0.0254;
    }
    @Override
    public double metreToKilo(double value) {
        return value/1000;
    }
    @Override
    public double metreToMilli(double value) {
        return value*1000;
    }
    @Override
    public void start(){
        System.out.println("Calculator Distance is started");
    }
    @Override
    public void stop(){
        System.out.println("Calculator Distance is terminated");
    }
}

interface Data{
    long teraToGiga(long value);
    long teraToMega(long value);
    long teraToKilo(long value);
}

interface Temperature{
    double celciusToFahrenheit(double value);
    double celciusToKelvin(double value);
}

interface Distance{
    double inchToMetre(double value);
    double metreToKilo(double value);
    double metreToMilli(double value);
}

public class Main {
    public static void main(String[] args) {
        ConverterData cData = new ConverterData();
        cData.start();
        if (cData.teraToGiga(9) == 9216) {
            System.out.println("Terabyte To Gigabyte = OK");
            if (cData.teraToMega(16) == 16777216) {
                System.out.println("Terabyte To Megabyte = OK");
                if (cData.teraToKilo(1) == 1073741824) {
                    System.out.println("Terabyte To Kilobyte = OK");
                } else {
                    System.out.println("Terabyte To Kilobyte = INCORRECT");
                    return;
                }
            } else {
                System.out.println("Terabyte To Megabyte = INCORRECT");
                return;
            }
        } else {
            System.out.println("Terabyte To Gigabyte = INCORRECT");
            return;
        }
        cData.stop();
        System.out.println("\n");

        ConverterTemperature cTemp = new ConverterTemperature();
        cTemp.start();
        if (cTemp.celciusToFahrenheit(9) == 48.2) {
            System.out.println("Celcius to Fahrenheit = OK");
            if (cTemp.celciusToKelvin(11) == 284.15) {
                System.out.println("Celcius to Kelvin = OK");
            } else {
                System.out.println("Celcius to Kelvin = INCORRECT");
                return; 
            }
        } else {
            System.out.println("Celcius to Fahrenheit = INCORRECT");
            return;
        }
        cTemp.stop();
        System.out.println("\n");

        ConverterDistance cDistance = new ConverterDistance();
        cDistance.start();
        if (cDistance.inchToMetre(1) == 0.0254) {
            System.out.println("Inch to Metre = OK");
            if (cDistance.metreToKilo(12500) == 12.5) {
                System.out.println("Metre to Kilometre = OK");
                if (cDistance.metreToMilli(12.9) == 12900) {
                    System.out.println("Metre to Millimetre = OK");
                } else {
                    System.out.println("Metre to Millimetre = INCORRECT");
                    return;
                }
            } else {
                System.out.println("Metre to Kilometre = INCORRECT");
                return;
            }
        } else {
            System.out.println("Inch to Metre = INCORRECT");
            return;
        }
        cDistance.stop();
        System.out.println("\n");
    }
}

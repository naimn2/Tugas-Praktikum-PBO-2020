
public class CalculatorData extends Converter implements Data {
    @Override
    public void start() {
        System.out.println("Data Converter is started");
    }

    @Override
    public void stop() {
        System.out.println("Data Converter is Terminated");
    }
    
    @Override
    public long teraToGiga(long value) {
        return value*1024;
    }

    @Override
    public long teraToMega(long value) {
        return value*(1024*1024);
    }

    @Override
    public long teraToKilo(long value) {
        return value*(1024*1024*1024);
    }

    

    
}
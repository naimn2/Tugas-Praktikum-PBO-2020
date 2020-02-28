public class MainLampu {

    public static void main(String[] args) {
        Lampu lampu = new Lampu();
        lampu.blueIsOn = true;
        lampu.turnOn();
        lampu.getState();
        lampu.turnOff();
        lampu.getState();


    }
}
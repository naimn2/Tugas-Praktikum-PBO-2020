package 01;

public class Lampu {

    boolean blueIsOn = true;
    boolean redIsOn = false;

    public void turnOn(){
        if (blueIsOn){
        blueIsOn = true;
        redIsOn = false;
        }
        else {
        blueIsOn = false;
        redIsOn = true;
        }
    }

    public void turnOff(){
        blueIsOn = false;
        redIsOn = false;
    }

    public void getState(){
        if (!blueIsOn && !redIsOn){
            System.out.println("tidak ada lampu yang menyala");
        }
        else if (redIsOn){
            System.out.println("lampu biru = off \nlampu merah = on");
        }
        else if (blueIsOn){
            System.out.println("lampu biru = on \nlampu merah = off");
        }
    }

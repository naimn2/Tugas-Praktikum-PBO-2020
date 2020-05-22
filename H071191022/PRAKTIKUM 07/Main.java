import java.util.ArrayList;

class Race {
    int numberOfRunner;
    ArrayList <String> participants = new ArrayList<>();
    boolean started = false;

    public void start(){

    if(numberOfRunner >= 3){
        started = true;
        System.out.println("The race starts . . .");
    }else{
        System.out.println("The race cannot be started , runners are not enough");
    }
    }

    public void result(){
    
        try {
 		Thread.sleep(numberOfRunner * 1000);
        } catch (InterruptedException e){
            
 		e.printStackTrace();
        }

        while(participants.size() != numberOfRunner){
            continue;
        }

        System.out.println("1st : " + participants.get(0));
        System.out.println("2nd : " + participants.get(1));
        System.out.println("3rd : " + participants.get(2));

        for(int i = 3; i < participants.size(); i++){
            System.out.println(participants.get(i) + " lose");
        }

        System.out.println("Execution TIme: "+((long) System.currentTimeMillis()-Main.start));
    }
} 

class Runner implements Runnable {

    private int number;
    private Thread thread;
    private Race race;

    Runner(int number){
        this.number = number;
    }

    public Runner joinRace(Race race){
        if(this.race == null){
            this.race = race;
            thread = new Thread(this);
            race.numberOfRunner++;
            thread.setName("Runner-" + number);
        }
        return this;
    }

    public void start(){
        if(thread != null && race.started){
            thread.start();
        }
        else if(thread == null){
            System.out.println(thread.getName() + " have not entered any race");
        }
        else if(!race.started){
            System.out.println("Hey " + thread.getName() + ", the race hasn't started yet");
        }
    }

    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName() + " running . . .");

        try{
            Thread.sleep(race.numberOfRunner * 1000);
        } 
        catch (InterruptedException e){
            e.printStackTrace();
        }

        synchronized(race.participants){
            race.participants.add(Thread.currentThread().getName());
        }
    }
} 

public class Main {
    static long start;
    public static void main(String[] args) {
        start = System.currentTimeMillis();
        Integer number = 0;
        Race race = new Race();
        Runner[] runners = new Runner[15];

        for (int i = 0; i < runners.length; i++) {
           runners[i] = new Runner(++number);
           runners[i].joinRace(race);
        }
        race.start();

        for (Runner runner : runners) {
            runner.start();
        }
        race.result();
    }
} 
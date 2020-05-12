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
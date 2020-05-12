public class Runner implements Runnable {
    private Integer number;
    private Thread thread;
    private Race race;

    public Runner(Integer number) {
        this.number = number;
    }
    //method join race berfungsi untuk mendaftarkan runner ke race
    public Runner joinRace(Race race) {
        thread = new Thread(this);
        this.race = race;
        this.race.peserta.add(number);
        return this;
    }
    public void start() {
        //jika race belum dimulai
        if (!race.isStart) {
            System.out.printf("Hey Runner-%d, the race hasn't started yet!\n", number);
        }
        //jika peserta belum terdaftar 
        else if(!race.peserta.contains(number)){
            System.out.printf("Runner-%d have not entered any race",number);
        } 
        //memanggil run
        else{
            thread.start();
        }
    }

    @Override
    public void run() {
        System.out.printf("Runner %d is running . . .\n", number);
        //akan thread selama jumlah peserta detik
        try {
            Thread.sleep(race.peserta.size()*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //apabila threadnya selesai maka akan masuk ke finish
        race.finish.add(number);
    }
}
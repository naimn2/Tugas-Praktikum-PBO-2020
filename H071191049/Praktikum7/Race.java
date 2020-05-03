import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Race {
    public boolean isStart = false;
    public List<Integer> peserta = new ArrayList<>();
    //synchronizedList berfungsi agar peserta yang finish masuk secara teratur ke list finish
    public List<Integer> finish = Collections.synchronizedList(new ArrayList<Integer>());

    public void start() {
        //jika jumlah peserta >= 3 maka race dimulai
        if (peserta.size() >= 3) {
            System.out.println("The race starts . . .");
            isStart = true;
        } else {
            System.out.println("The race cannot be started, runners are not enough");
        }
    }
    public void result() {
        //while result akan terus dipanggil sampai race selesai
        while (isStart) {
            if(finish.size() == peserta.size()){
                System.out.println("The race is over.\n");
                System.out.printf("1st : Runner-%d\n",finish.get(0));
                System.out.printf("2st : Runner-%d\n",finish.get(1));
                System.out.printf("3st : Runner-%d\n\n",finish.get(2));
                for(int i=3;i<finish.size();i++){
                    System.out.printf("Runner %d-Loses\n",finish.get(i));
                }
                return;
            }

        }

    }

}
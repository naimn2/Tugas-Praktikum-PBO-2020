import java.io.*;
import java.util.ArrayList;

public class Input {
    // ARRAYLIST HERO
    public ArrayList<ArrayList<String>> Barrack() throws Exception {
        String heroN[] = inputFile("Barrack.txt").split("#");
        ArrayList<ArrayList<String>> heroStock = new ArrayList<>();
        for (int i = 0; i < heroN.length; i++) {
            ArrayList<String> x = new ArrayList<>();
            String heroM[] = heroN[i].split(";");
            for (int j = 0; j < 2; j++) {
                x.add(heroM[j]);
            }
            heroStock.add(x);
        }
        return heroStock;
    }

    // INPUT FILE BARRACK
    private String inputFile(String inputan) throws Exception {
        String input = "";
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(inputan));
            String str;
            while ((str = br.readLine()) != null) {
                input += str;
            }
        } finally {
            if (br != null) {
                br.close();
            }
        }
        return input;
    }
}
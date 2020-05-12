import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class DataSource {
    private String baca (String namaFile) {
        Path path  = Paths.get("src/"+namaFile);
        String fileContent = null;
        try {
            fileContent = new String(Files.readAllBytes(path), StandardCharsets.ISO_8859_1);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return  fileContent;
    }
    public ArrayList<RencanaKegiatan> getRencanaKegiatan(){
        String input = baca("DaftarKegiatan.txt");
        String[] kegiatanContent = input.split("\\r?\\n");
        if(kegiatanContent[0].equals("")){
            return new ArrayList<>();
        }
        ArrayList<RencanaKegiatan> kegiatans = new ArrayList<>();
        for(int i=0;i<kegiatanContent.length;i++){
            ArrayList<String> pelaksanaList = new ArrayList<>();
            String[] kegiatanPart = kegiatanContent[i].split(";");
            kegiatans.add(new RencanaKegiatan(kegiatanPart[0], kegiatanPart[1], kegiatanPart[2]));
            kegiatans.get(i).setBiaya(Integer.valueOf(kegiatanPart[3]));
            if(kegiatanPart.length>4){
                String[] pelaksana = kegiatanPart[4].split("-");
                for (String string : pelaksana) {
                    pelaksanaList.add(string);
                }
            }
            kegiatans.get(i).setPelaksana(pelaksanaList);
        } 
        return kegiatans;
    }
    public void saveData(ArrayList<RencanaKegiatan> rencanaKegiatans){
        Path kegiatanPath = Paths.get("src/DaftarKegiatan.txt");
        String[] kegiatan = new String[rencanaKegiatans.size()];
        for(int i=0;i<rencanaKegiatans.size();i++){
            if(rencanaKegiatans.get(i)==null){
                kegiatan[i]="";
            }else{
                kegiatan[i] = rencanaKegiatans.get(i).getName()+";";
                kegiatan[i] += rencanaKegiatans.get(i).getWaktu()+";";
                kegiatan[i] += rencanaKegiatans.get(i).getTempat()+";";
                kegiatan[i] += rencanaKegiatans.get(i).getBiaya()+";";
                for (String string : rencanaKegiatans.get(i).getPelaksana()) {
                    kegiatan[i] += string+"-";
                }
                kegiatan[i]+=";";
            }
        }
        try {
            write(kegiatan, kegiatanPath);;
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }
    private void write(String[] input, Path pathIn) throws IOException {
        String in = "";
        for(int i=0;i<input.length;i++){
            if(input[i].equals(null)||input[i].equals("")){
                continue;
            }
            in+=input[i]+"\n";
        }
        Files.write(pathIn,in.getBytes(StandardCharsets.ISO_8859_1));
        assert(Files.exists(pathIn));
    }
}
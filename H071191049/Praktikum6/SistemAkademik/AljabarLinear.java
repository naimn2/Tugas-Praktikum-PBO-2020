
public class AljabarLinear extends MataKuliah{
    AljabarLinear(){
        name = "Aljabar Linear";
        sks = 3;
    }
    @Override
    public void dosenKelas(char i) {
        super.dosenKelas(i);
        switch (i) {
            case 'A':
                dosen = "Budi";
                break;
            case 'B':
                dosen = "Muhammad Zakir";
            default:

                break;
        }
    }
}
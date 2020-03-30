public class Persegi{
  int panjang;
  int lebar;
  int luas;

  public void setPanjang(int panjang){
    this.panjang = panjang;
  }

  public void setLebar(int lebar){
    this.lebar = lebar;
  }

  int getPanjang(){
    return panjang;
  }

  int getLebar(){
    return lebar;
  }

  int getLuas(){
    int luas = panjang*lebar;
    return luas;
  }


}

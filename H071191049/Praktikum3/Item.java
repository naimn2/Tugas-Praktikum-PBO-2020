public class Item {
    private String name;
    private int price;
    private String info;

    // KONSTRUKTOR ITEM KOSONG AGAR BISA DIPANGGIL PADA MARKET PLACE
    public Item() {
    }

    // SETTER
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    // KONSTRUKTOR UNTUK MENYIMPAN ITEM MILIK PLAYER
    public Item(String name, int price, String info) {
        this.name = name;
        this.price = price;
        this.info = info;
    }

    // GETTER
    public String getName() {
        return name;
    }

    public String getInfo() {
        return info;
    }

    public int getPrice() {
        return price;
    }
}

import java.util.Scanner;

public class Player {
    private String name;
    private String role;
    private int level;
    private double hp = 100;
    private double demage;
    private double energy;
    private int money;
    private Item[] items = { new Item(), new Item(), new Item() };
    private Item[] itemP = { new Item(), new Item(), new Item() };
    private Scanner san = new Scanner(System.in);
    private Skill skill = new Skill();

    // NILAI DEFAULT TIAP PLAYER
    public Player() {
        level = 1;
        demage = 5;
        hp = 100;
        energy = 100;
        money = 10000;
    }

    // SETTER
    public void setName(String name) {
        this.name = name;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getName() {
        return this.name;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void setDemage() {
        demage += level * 5;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    // GETTER
    public double getDemage() {
        return demage;
    }

    public double getHp() {
        return hp;
    }

    public double getEnergy() {
        return energy;
    }

    public int getLevel() {
        return level;
    }

    public int getMoney() {
        return money;
    }

    // SHOW PLAYER STATUS
    public void showStatus() {
        System.out.printf("Nama Hero : %s", name);
        System.out.printf("\nRole      : %s", role);
        System.out.printf("\nLevel     : %d", level);
        System.out.printf("\nDemage    : %.2f", demage);
        System.out.printf("\nHP        : +%.2f", hp);
        System.out.printf("\nEnergy    : %.2f", energy);
        System.out.printf("\nMoney     : Rp.%d", money);
    }

    // SHOW ITEM MILIK PLAYER
    public void showItems() {
        boolean kosong = false;
        for (int i = 0; i < items.length; i++) {
            if (items[i].getName() != null) {
                kosong = true;
            }
        }
        if (kosong == false) {
            System.out.println("Tidak ada item");
            return;
        } else {
            int j = 0;
            for (int i = 0; i < items.length; i++) {
                if (items[i].getName() == null) {
                    continue;
                }
                System.out.println((j + 1) + ". " + items[i].getName());
                System.out.println(" " + items[i].getInfo());
                j++;
            }
            System.out.print("> ");
            int inp = san.nextInt();
            if (items[inp].equals(null)) {
                inp++;
            }
            System.out.println("> " + items[inp - 1].getName() + " Item <");
            System.out.println(">[1] Use\n>[2] Sell\n>[3] Destroy");
            System.out.print(" > ");
            int inp2 = san.nextInt();
            switch (inp2) {
                case 1:
                    use(items[inp - 1]);
                    System.out.println("Pemakaian Item Berhasil");
                    remove(items[inp - 1]);
                    break;
                case 2:
                    System.out.println(">[1] Jual Ditoko (Setengah Harga)\n>[2] Tawarkan Ke Pemain Lain");
                    System.out.print("> ");
                    int inp3 = san.nextInt();
                    if (inp3 == 1) {
                        sell(items[inp - 1]);
                        System.out.println("> Item Berhasil Dijual");
                        remove(items[inp - 1]);
                    } else {
                        itemP[inp - 1] = items[inp - 1];
                        System.out.print("> Harga Yang Ditawarkan = ");
                        int inp4 = san.nextInt();
                        itemP[inp - 1].setPrice(inp4);
                        System.out.println("> Silahkan Tunggu ada Pemain yang membeli");
                        remove(items[inp - 1]);
                    }
                    break;
                case 3:
                    remove(items[inp - 1]);
                    System.out.println("Item Berhasil dihancurkan");
                    break;
                default:
                    System.out.println("Input salah");
                    showItems();
            }
        }
        System.out.println();
    }

    private void use(Item item) {
        if (item.getName().equals("SPRITE")) {
            energy += 20;
        } else if (item.getName().equals("JAMU")) {
            level += 1;
            setDemage();
        } else if (item.getName().equals("POISON")) {
            demage *= 20 / 100;
        }
    }

    private void sell(Item item) {
        money += item.getPrice() * 50 / 100;
    }

    private void remove(Item item) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].equals(item)) {
                items[i] = null;
                items[i] = new Item();
            }
        }
    }

    // ATTACK INSTRUKSI
    public boolean attack(Player target) {
        if (energy < 10) {
            System.out.println("Energi anda terlalu kurang");
            return false;
        }
        System.out.println(">>> Attack to ");
        System.out.println("> [1] Normal Attack [2] " + skill.getSpecialSkill(role));
        System.out.print("> ");
        int inp = san.nextInt();
        switch (inp) {
            case 1:
                target.setHp(target.getHp() - demage);
                level += demage / 5;
                energy -= 5;
                money += demage * 50;
                setDemage();
                break;
            case 2:
                target.setHp(target.getHp() - (skill.getSpecialAttack(role) + demage));
                level += skill.getSpecialAttack(role) / 5;
                energy -= skill.getSpecialAttack(role);
                money += skill.getSpecialAttack(role) * 50;
                setDemage();
                break;
            default:
                System.out.println("Input salah masukkan ulang");
                attack(target);
        }
        return true;
    }

    // HEALING
    public boolean healing() {
        if (energy < 10) {
            return false;
        }
        if (hp == 100) {
            return false;
        }
        energy -= (100 - hp) / 2;
        hp = 100;
        return true;
    }

    // BUY ITEM
    public boolean buy(Item item) throws Exception {
        if (item.getPrice() > money) {
            System.out.println("Uang Anda Tidak Cukup");
            return false;
        }
        for (int i = 0; i < items.length; i++) {
            if (items[i].getName() == item.getName()) {
                System.out.println("Anda hanya boleh memiliki satu tiap item");
                return false;
            }
        }
        money -= item.getPrice();
        for (int i = 0; i < items.length; i++) {
            if (items[i].getName() == null) {
                items[i] = item;
                return true;
            }
        }
        return false;
    }

    public Item[] getItemP() {
        for (int i = 0; i < itemP.length; i++) {
            if (itemP[i].getName() == null) {
                continue;
            }
            return itemP;
        }
        return null;
    }

    public Item getItems(int i) {
        return items[i];
    }

    public void setItems(Item itemL) {
        for (int i = 0; i < items.length; i++) {
            if (items[i].getName() == null) {
                items[i] = itemL;
            }
        }
    }

    // ITEM PENAWARAN
    public void penawaran(Player playerLain) {
        int num = 1;
        boolean sekali = true;
        for (int i = 0; i < itemP.length; i++) {
            if (itemP[i].getName() == null) {
                continue;
            }
            if (sekali == true) {
                System.out.println(">> Penawaran " + getName());
                sekali = false;
            }
            System.out.println("> [" + num + "]. " + itemP[i].getName() + "\n\tHarga Tawaran : " + itemP[i].getPrice());
        }
        System.out.println("> Silahkan Pilih");
        System.out.println("> Tekan [0] Bila tidak tertarik");
        System.out.print("> ");
        int inp5 = san.nextInt();
        if (itemP[inp5 - 1].getPrice() > playerLain.getMoney()) {
            System.out.println("> Uang Anda Tidak Cukup");
            return;
        }
        for (int i = 0; i < items.length; i++) {
            if (itemP[inp5 - 1].getName() == playerLain.getItems(i).getName()) {
                System.out.println("> Anda hanya boleh memiliki satu tiap item");
                return;
            }
        }
        int moneyPlayerL = playerLain.getMoney();
        playerLain.setMoney(moneyPlayerL -= itemP[inp5 - 1].getPrice());
        playerLain.setItems(itemP[inp5 - 1]);
        itemP[inp5 - 1] = new Item();
        System.out.println("Pembelian Berhasil");
    }
}
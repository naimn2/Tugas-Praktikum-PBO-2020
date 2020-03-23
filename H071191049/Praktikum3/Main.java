import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner san = new Scanner(System.in);
    public static int numberOfPlayer = 0;
    public static ArrayList<Player> playerStock = new ArrayList<>();
    public static Item[] itemsStock = new Item[3];
    public static int check[] = { 0, 0, 0, 0, 0 };
    public static Input barrackInput = new Input();
    public static int sameNameB = 0;

    public static void main(String[] args) {
        System.out.println("\n-------------------------------");
        System.out.println(">>>     BATTLE  ROYAL     <<<");
        System.out.println("-------------------------------");
        System.out.println(">> Pilih Jumlah Player : MAX 5");
        System.out.print("> ");
        int inp1 = san.nextInt();
        numberOfPlayer = inp1;
        if (inp1 > 5 || inp1 < 2) {
            System.out.println(">> Jumlah Player antara 2-5");
            main(args);
        }
        for (int i = 0; i < inp1; i++) {
            playerStock.add(new Player());
        }
        MarketPlace();
        menuGame();
    }

    // MENU UTAMA GAME
    public static void menuGame() {
        System.out.println("\n-----------------------------");
        System.out.println(">>       PLAYER MENU       <<");
        System.out.println("-----------------------------");
        for (int i = 0; i < numberOfPlayer; i++) {
            System.out.printf(
                    check[i] == 0 ? "\n>>[" + (i + 1) + "] Select Player" + (i + 1) : "\n>>[%d] Player%d (%s)", i + 1,
                    i + 1, playerStock.get(i).getName());
        }
        System.out.printf("\n>>[%d] Start Game \n>>[%d] Exit \n", numberOfPlayer + 1, numberOfPlayer + 2);
        System.out.print(">> ");
        int inp1 = san.nextInt();
        if (inp1 <= numberOfPlayer) {
            for (int i = 0; i < numberOfPlayer; i++) {
                if (inp1 == i + 1) {
                    ;
                    Player(i);
                }
            }
        } else {
            if (inp1 == numberOfPlayer + 1) {
                int semuaTerisi = 0;
                for (int i = 0; i < numberOfPlayer; i++) {
                    semuaTerisi += check[i];
                }
                if (semuaTerisi == numberOfPlayer) {
                    // MarketPlace();
                    Game();
                } else {
                    System.out.println(">>  Pilih semua player!!  <<");
                    menuGame();
                }

            } else if (inp1 == numberOfPlayer + 2) {
                return;
            } else {
                System.out.println("Input Salah");
            }
        }
    }

    // MENU PEMILIHAN PLAYER
    public static void Player(int ke) {
        System.out.println("\n>> PLAYER " + (ke + 1) + "<<\n>>[1] Create Player\n>>[2] Take From Barrack\n>>[3] Back");
        System.out.print("> ");
        int inp1 = san.nextInt();
        switch (inp1) {
            case 1:
                check[ke] = 1;
                attribut(playerStock.get(ke));
                break;
            case 2:
                try {
                    check[ke] = 1;
                    barrack(playerStock.get(ke));
                } catch (Exception e) {
                }
                break;
            case 3:
                menuGame();
                return;
            default:
                System.out.println("input salah");
                menuGame();
                break;
        }
    }

    // MENU MEMBUAT PLAYER SENDIRI
    public static void attribut(Player player) {
        System.out.println("\n>>  CREATE PLAYER  <<");
        System.out.print("> Name      : ");
        san.nextLine();
        String name = san.nextLine();
        for (int i = 0; i < playerStock.size(); i++) {
            if (name.equals(playerStock.get(i).getName())) {
                sameNameB++;
            }
        }
        if (sameNameB > 0) {
            player.setName(name + "" + sameNameB);
        } else {
            player.setName(name);
            sameNameB = 0;
        }
        System.out.println("> Role      : ");
        String[] type = { "Berseker", "Programmer", "Necromamancer", "Shinobi", "Angle", "Guardian" };
        for (int i = 0; i < type.length; i++) {
            System.out.println(">>[" + (i + 1) + "] " + type[i]);
        }
        System.out.print("> ");
        int role = san.nextInt();
        player.setRole(type[role - 1]);
        menuGame();
    }

    // MENU MENGAMBIL PLAYER DARI BARRACK
    public static void barrack(Player player) throws Exception {
        // METHOD INI AKAN MEMANGGIL OBJECT INPUT
        System.out.println("\n>> BARRACK <<");
        for (int i = 0; i < barrackInput.Barrack().size(); i++) {
            System.out.println("[" + (i + 1) + "] " + barrackInput.Barrack().get(i).get(0));
        }
        System.out.print(">");
        try {
            int inp1 = san.nextInt();
            for (int k = 0; k < playerStock.size(); k++) {
                if (inp1 - 1 == k) {
                    continue;
                }
                if (barrackInput.Barrack().get(inp1 - 1).get(0).equals(playerStock.get(k).getName())) {
                    sameNameB++;

                }
            }
            if (sameNameB > 0) {
                player.setName(barrackInput.Barrack().get(inp1 - 1).get(0) + "" + sameNameB);
            } else {
                player.setName(barrackInput.Barrack().get(inp1 - 1).get(0));
            }
            player.setRole(barrackInput.Barrack().get(inp1 - 1).get(1));
            System.out.println();
        } catch (Exception io) {
            System.out.println(io.getMessage());
        } finally {
            sameNameB = 0;
            menuGame();
        }
    }

    // GAME PLAY
    public static void Game() {
        System.out.println("\n------------------\n>>  GAME PLAY  <<\n------------------");
        for (int i = 0; i < playerStock.size(); i++) {
            System.out.printf("\n>>P" + (i + 1) + ". " + playerStock.get(i).getName() + "\n[" + (i + 1) + 1
                    + "] Show Status\n[" + (i + 1) + 2 + "] Show Items\n[" + (i + 1) + 3 + "] Attack\n[" + (i + 1) + 4
                    + "] Healing\n[" + (i + 1) + 5 + "] Buy Item\n------------------\n");
        }
        System.out.print("> ");
        int inp1 = san.nextInt();
        for (int i = 0; i < playerStock.size(); i++) {
            // STATUS PLAYER CHECK
            if (inp1 == ((i + 1) * 10) + 1) {
                System.out.println("\n>> STATUS PLAYER" + (i + 1) + " <<");
                playerStock.get((inp1 / 10) - 1).showStatus();
                Game();
            }
            // ITEM PLAYER CHECK
            else if (inp1 == ((i + 1) * 10) + 2) {
                System.out.println("\n>> ITEM PLAYER " + (i + 1) + " <<");
                try {
                    playerStock.get((inp1 / 10) - 1).showItems();
                } finally {
                    Game();
                }
            }
            // ATTACK
            else if (inp1 == ((i + 1) * 10) + 3) {
                System.out.println("\n>>   ATTACK P" + (i + 1) + "  <<");
                System.out.println("Select A Player To Attack ");
                for (int j = 0; j < playerStock.size(); j++) {
                    if ((inp1 / 10 - 1) == j) {
                        continue;
                    }
                    System.out.println(">[" + (j + 1) + "] Attack Player " + (j + 1));
                }
                try {
                    System.out.print("> ");
                    int inp2 = san.nextInt();
                    boolean x = playerStock.get((inp1 / 10) - 1).attack(playerStock.get(inp2 - 1));
                    if (x) {
                        System.out.println(">> Player " + inp2 + " Berhasil diserang");

                    } else {
                        System.out.println(">> Penyerangan Gagal");
                    }
                } catch (Exception m) {
                    System.out.println(m.getMessage());
                } finally {
                    if (check() == false) {
                        Game();
                    }
                }

            }
            // HEALING
            else if (inp1 == ((i + 1) * 10) + 4) {
                try {
                    boolean x = playerStock.get((inp1 / 10) - 1).healing();
                    if (x) {
                        System.out.println(">> Penyembuhan Berhasil");
                    } else {
                        System.out.println(">> HP anda Penuh, Penyembuhan Gagal");
                    }
                } catch (Exception io) {
                    System.out.println(">> Ada dengan Penyembuhan");
                } finally {
                    Game();
                }
            }
            // BUY ITEM
            else if (inp1 == ((i + 1) * 10) + 5) {
                System.out.println("[1] Beli Dari Toko\n[2] Beli Penawaran Pemain Lain");
                System.out.print("> ");
                int inp3 = san.nextInt();
                if (inp3 == 1) {

                    System.out.println("\n>> TOKO ITEM <<");
                    try {
                        for (int j = 0; j < itemsStock.length; j++) {
                            System.out.printf("[" + (j + 1) + "] " + itemsStock[j].getName());
                            System.out.printf("\n\tHarga: Rp." + itemsStock[j].getPrice());
                            System.out.printf("\n\tInfo : " + itemsStock[j].getInfo());
                            System.out.println();
                        }
                        System.out.print("> ");
                        int inp2 = san.nextInt();
                        boolean x = playerStock.get((inp1 / 10) - 1).buy(itemsStock[inp2 - 1]);
                        if (x) {
                            System.out.println(">> Pembelian berhasil");
                        } else {
                            System.out.println(">> Pembelian gagal");
                        }
                    } catch (Exception io) {
                        System.out.println(io.getMessage());
                        System.out.println(">> Ada Masalah Pembelian");
                    } finally {
                        Game();
                    }
                } else if (inp3 == 2) {
                    System.out.println(">> TAWARAN ITEM PEMAIN LAIN <<");
                    boolean syarat = false;
                    boolean syarat2 = false;
                    for (int k = 0; k < playerStock.size(); k++) {
                        if (k == inp1 / 10 - 1) {
                            continue;
                        }
                        syarat = playerStock.get(k).getItemP() != null;
                        if (syarat == true) {
                            System.out.println("Tekan [" + (k + 1) + "] untuk melihat penawaran player " + (k + 1));
                            syarat2 = true;
                        }

                    }
                    if (syarat2 == true) {
                        System.out.print("> ");
                        int inp4 = san.nextInt();
                        playerStock.get(inp4 - 1).penawaran(playerStock.get((inp1 / 10) - 1));
                    }
                    if (syarat2 == false) {
                        System.out.println(">> Penawaran Kosong");
                    }
                    Game();
                }
            }
        }
    }

    // CHECK APAKAH ADA PEMAIN YANG MATI DAN PERMAINAN BERKHIR
    public static boolean check() {
        for (int i = 0; i < playerStock.size(); i++) {
            if (playerStock.get(i).getHp() <= 0) {
                System.out.println("---------------------");
                System.out.println(">> " + playerStock.get(i).getName() + " Telah Kalah <<");
                System.out.println("---------------------");
                playerStock.remove(i);
            }
        }
        if (playerStock.size() == 1) {
            System.out.println("---------------------");
            System.out.println(">> SELAMAT !!! PEMENANGNYA ADALAH " + playerStock.get(0).getName());
            return true;
        }
        return false;
    }

    // MARKET PLACE PENJUAL ITEM
    public static void MarketPlace() {
        String itemName[] = { "SPRITE", "JAMU", "POISON" };
        int itemPrice[] = { 5000, 4000, 3500 };
        String itemInfo[] = { "Menambah 20 Energy", "Meningkatkan 1 Level", "Meningkatkan Demage 5 persen" };

        for (int i = 0; i < itemsStock.length; i++) {
            itemsStock[i] = new Item();
            itemsStock[i].setName(itemName[i]);
            itemsStock[i].setPrice(itemPrice[i]);
            itemsStock[i].setInfo(itemInfo[i]);
        }
    }
}
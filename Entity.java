import java.util.Random;

public class Entity{
    Random num_Picker = new Random();

    public String name;
    public int health_Point;
    public int attack_Power; 
    public int armor;

    public Entity(String name, int health, int bonus_Health, int attack, int defense){
        this.name = name;
        this.health_Point = health;
        this.attack_Power = attack;
        this.armor = defense;
    }

    void run() {
        System.out.println();
        System.out.printf("%s berlari...\n", this.name);
    }

    void attack(Entity Enemy) {
        System.out.println();
        System.out.printf("%1$s menyerang %2$s !\n", this.name, Enemy.name);
        Enemy.health_Point -= (this.attack_Power - Enemy.armor);
        System.out.printf("sisa darah %s adalah %d\n", Enemy.name, Enemy.health_Point);
    }

    void defend() {
        System.out.println();
        System.out.printf("%s bertahan....\n", this.name);
        if (num_Picker.nextInt(10) == 0) {
            this.health_Point += 5;
            System.out.println("Menambah 5 health point");
        }
    }

    void is_Dead() {
        if (this.health_Point <= 0) {
            System.out.println();
            System.out.printf("%s kehabisan darah...", this.name);
        } else {
            System.out.printf("%s masih bisa bertarung", this.name);
        }
    }
}

class Senjata {
    String nama_Senjata;
    int jumlah_Peluru_Senjata, damage_Senjata;

    Senjata(String nama, int jumlah_Peluru, int damage) {
        nama_Senjata = nama;
        jumlah_Peluru_Senjata = jumlah_Peluru;
        damage_Senjata = damage;
    }

    void tembak(Entity penembak, Entity target_Tembak){
        System.out.println();
        if (jumlah_Peluru_Senjata > 0) {
            System.out.printf("%s menembak %s menggunakan %s\n",penembak.name, target_Tembak.name, nama_Senjata);
            target_Tembak.health_Point -= damage_Senjata;
            jumlah_Peluru_Senjata--;
            System.out.printf("darah %s sekarang adalah %d\n", target_Tembak.name, target_Tembak.health_Point);
        } else {
            System.out.println("peluru abiez");
        }
    }

    void reload() {
        System.out.println();
        System.out.println("mengisi kembali peluru.....");
        jumlah_Peluru_Senjata = 20;
    }
}

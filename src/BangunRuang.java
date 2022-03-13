import java.util.Scanner;

public class BangunRuang {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        int pilihan;
        int ulangi;

        while(true){

            System.out.println("==========\nMenu Utama\n==========\n1. Hitung Balok\n2. Hitung Tabung\n0. Exit");
            System.out.print("Pilihan : ");
            pilihan = scanner.nextInt();
            switch (pilihan){
                case 1:
                    double p, l, t, luasPersegiPanjang, kelilingPersegiPanjang, volumeBalok, luasPermukaanBalok;

                    System.out.print("Input Panjang : "); p = scanner.nextDouble();
                    System.out.print("Input Lebar : "); l = scanner.nextDouble();
                    System.out.print("Input Tinggi : "); t = scanner.nextDouble();

                    PersegiPanjang persegiPanjang = new PersegiPanjang();
                    Balok balok = new Balok();

                    luasPersegiPanjang = persegiPanjang.luasPP(p, l);
                    kelilingPersegiPanjang = persegiPanjang.kelilingPP(p, l);
                    volumeBalok = balok.volBalok(p, l, t);
                    luasPermukaanBalok = balok.luasPermukaanBalok(p, l, t);

                    System.out.println("Luas Persegi Panjang : " + luasPersegiPanjang);
                    System.out.println("Keliling Persegi Panjang : " + kelilingPersegiPanjang);
                    System.out.println("Volume Balok : " + volumeBalok);
                    System.out.println("Luas Permukaan Balok : " + luasPermukaanBalok);

                    System.out.print("Ulangi ? (Ya : 1 || Tidak : 0)");
                    ulangi = scanner.nextInt();
                    if(ulangi == 1){
                        System.out.println("==========\nMenu Utama\n==========\n1. Hitung Balok\n2. Hitung Tabung\n0. Exit");
                        System.out.print("Pilihan : ");
                        pilihan = scanner.nextInt();
                    }
                    else{
                        System.exit(3);
                    }
                case 2:
                    double tTab, r, luasLingkaran, kelilingLingkaran, volumeTabung, luasPermukaanTabung;
                    System.out.print("Input Tinggi : "); tTab = scanner.nextDouble();
                    System.out.print("Input Jari - jari : "); r = scanner.nextDouble();

                    Lingkaran lingkaran = new Lingkaran();
                    Tabung tabung = new Tabung();

                    luasLingkaran = lingkaran.luasLingkaran(r);
                    kelilingLingkaran = lingkaran.kelilingLingkaran(r);
                    volumeTabung = tabung.volumeTabung(r, tTab);
                    luasPermukaanTabung = tabung.luasPermukaanTabung(r, tTab);

                    System.out.println("Luas Lingkaran : " + luasLingkaran);
                    System.out.println("Keliling Lingkaran : " + kelilingLingkaran);
                    System.out.println("Volume Tabung : " + volumeTabung);
                    System.out.println("Luas Permukaan Tabung : " + luasPermukaanTabung);
                    System.out.print("Ulangi ? (Ya : 1 || Tidak : 0)");
                    ulangi = scanner.nextInt();
                    if(ulangi == 1){
                        System.out.println("==========\nMenu Utama\n==========\n1. Hitung Balok\n2. Hitung Tabung\n0. Exit");
                        System.out.print("Pilihan : ");
                        pilihan = scanner.nextInt();
                    }
                    else{
                        System.exit(3);
                    }
                case 0:
                    System.exit(3);
            }
        }
    }
}

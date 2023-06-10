package POSTTEST.Tugas_Akhir_Pertemuan;

import java.util.Scanner;

public class App {

    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        clearScreen();
        System.out.print("================================================\n");
        System.out.print("+++           Tugas Akhir Pertemuan          +++\n");
        System.out.print("+++                                          +++\n");
        System.out.print("+++        Nama   : Ananta Yusra P.A         +++\n");
        System.out.print("+++        NIM    : 2109106024               +++\n");
        System.out.print("+++        Kelas  : Informatika A 2021       +++\n");
        System.out.print("================================================\n");
        boolean isLnajutkan = true;

        while (isLnajutkan) {
            System.out.println("Menu:");
            System.out.println("1. String Awal ");
            System.out.println("2. Konversi Nilai");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    String awal = "JavaScript adalah bahasa pemrograman tingkat tinggi dan dinamis";
                    Tampilkan(awal);
                    break;
                case 2:
                    NilaiAkhir();
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    break;
            }
            System.out.println();
            isLnajutkan = getYesorNo("apakah anda ingin melanjutkan");
            clearScreen();
        }

        scanner.close();
    }

    private static boolean getYesorNo(String message){
        Scanner terminalInput = new Scanner(System.in);
        System.out.print("\n"+message+" (y/n)? ");
        String pilihanUser = terminalInput.next();

        while(!pilihanUser.equalsIgnoreCase("y") && !pilihanUser.equalsIgnoreCase("n")) {
            System.err.println("Pilihan anda bukan y atau n");
            System.out.print("\n"+message+" (y/n)? ");
            pilihanUser = terminalInput.next();
        }
        return pilihanUser.equalsIgnoreCase("y");
    }


    public static void Tampilkan(String teks) {
        System.out.println("\n\t\t\tPILIHAN MENU :");
        
        System.out.println ("JavaScript adalah bahasa pemrograman tingkat tinggi dan dinamis");
        System.out.println("1." + teks.substring(0, 37)); // JavaScript adalah bahasa pemrograman
        System.out.println("2." + teks.toLowerCase()); // javascript adalah bahasa pemrograman
        System.out.println("3." + teks.toUpperCase()); // JAVASCRIPT ADALAH BAHASA PEMROGRAMAN
        System.out.println("4." + teks.substring(25, 36)); // pemrograman
        System.out.println("5." + teks.substring(37)); // tingkat tinggi dan dinamis


        System.out.print("\n\n Masukan Pilihan:");
        int pilih = scanner.nextInt();
        if (pilih == 1){
            System.out.println(teks.substring(0, 37)); // JavaScript adalah bahasa pemrograman
        }
        else if (pilih == 2){
            System.out.println(teks.toLowerCase()); // javascript adalah bahasa pemrograman
        }
        else if (pilih == 3){
            System.out.println(teks.toUpperCase()); // JAVASCRIPT ADALAH BAHASA PEMROGRAMAN
        }
        else if (pilih == 4){
            System.out.println(teks.substring(25, 36)); // pemrograman
        }
        else if (pilih == 5){
            System.out.println(teks.substring(37)); // tingkat tinggi dan dinamis
        }
        
    }

    public static double NilaiKehadiran(int kehadiran) {
        if (kehadiran < 3) {
            return 0;
        } else if (kehadiran >= 3 && kehadiran <= 4) {
            return 60;
        } else if (kehadiran >= 5 && kehadiran <= 6) {
            return 80;
        } else {
            return 100;
        }
    }

    public static String KonversiGrade(double skorAkhir) {
        if (skorAkhir >= 85 && skorAkhir <= 100) {
            return "A";
        } else if (skorAkhir >= 70 && skorAkhir <= 84) {
            return "B";
        } else if (skorAkhir >= 60 && skorAkhir <= 69) {
            return "C";
        } else if (skorAkhir >= 50 && skorAkhir <= 59) {
            return "D";
        } else {
            return "E";
        }
    }

    public static void NilaiAkhir() {

        System.out.print("================================================\n");
        System.out.print("+++         Program Kebijakan Akademik       +++\n");
        System.out.print("================================================\n");

        System.out.print("Masukkan Mata Kuliah      : ");
        String matkul = scanner.next();

        System.out.print("Masukkan jumlah kehadiran : ");
        int kehadiran = scanner.nextInt();

        System.out.print("Masukkan nilai UTS        : ");
        double UTS = scanner.nextDouble();

        System.out.print("Masukkan nilai UAS        : ");
        double UAS = scanner.nextDouble();

        double SkorKehadiran = NilaiKehadiran(kehadiran);
        double SkorAkhir = (SkorKehadiran * 0.2) + (UTS * 0.3) + (UAS * 0.5);
        String grade = KonversiGrade(SkorAkhir);
        
        System.out.println("Skor Akhir  : " + matkul);
        System.out.println("Skor Akhir  : " + SkorAkhir);
        System.out.println("Grade       : " + grade);

        scanner.nextLine();
    }

    private static void clearScreen(){
        try{
            if (System.getProperty("os.name").contains("windows")){
                new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
            }else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        }catch (Exception ex){
            System.err.println("tidak bisa clear screen");
        }
    }
}
package POSTTEST.posttest6;

// import semua utilitas java menggunakan *
import java.util.*;
import java.io.*;

import POSTTEST.posttest6.objek.*;
import POSTTEST.posttest6.ClassAkun.Login;

public final class main {

    static final BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
    static ArrayList<Login> login = new ArrayList<Login>();
    
    // Fungsi Main
    public static void main(String[] args) throws Exception {

        Bendacair bendacair = new Bendacair(null, null, 0, null, null, null, null);
        Bendapadat bendapadat = new Bendapadat(null, null, 0, null, null, null);

        while (true){

            Boolean stop = false;
            Login admin = new Login("ananta","123");
            System.out.println("|                Login Akun              |");
            System.out.println("------------------------------------------");
            System.out.print("- Username     : ");
            String username = input.readLine();
            System.out.print("- Password     : ");
            String password = input.readLine();
            
            while (stop == false){
    
                if (username.equals(admin.getUsername()) && password.equals(admin.getPassword())) {
    
                    System.out.println("------------------------------------------");
                    System.out.println(">>>>>>>>>>> PENDATAAN INFORMASI <<<<<<<<<<");
                    System.out.println(">>>>>>>>>>>>>> SERVICE LAPTOP <<<<<<<<<<<<");
                    System.out.println("------------------------------------------");
                    System.out.println("Admin : " + admin.getUsername());
                    System.out.println("\n1. Kelola Data Barang Cair");
                    System.out.println("2. Kelola Data Barang Padat");
                    System.out.println("3. Logout");
                    System.out.print("Masukkan Pilihan : ");
                    int pilihan = Integer.parseInt(input.readLine());
        
                    switch (pilihan){
                        case 1:
                            bendacair.menubendacair1();
                            break;
                        case 2:
                            bendapadat.menubendapdt();
                            break;
                        case 3:
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Pilihan Tidak Ada");
                            break;
                    }
                }else{
                    System.out.println(">>>> WARNING: USERNAME/PASSWORD SALAH <<<<");
                    stop = true;
                }
            }
        }
    }
}

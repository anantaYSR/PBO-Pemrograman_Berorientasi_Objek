package Tugas_Kuliah.Account_Connetions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author ZEUS
 */
public class Akun {
    protected String NamaLengkap;
    protected String Username;
    protected String Email;
    protected String Password;
    
    public Akun(String NamaLengkap, String Username, String Email, String Password) {
        this.NamaLengkap = NamaLengkap;
        this.Username = Username;
        this.Email = Email;
        this.Password = Password;
    }

    public String getNamaLengkap() {
        return NamaLengkap;
    }

    public void setNamaLengkap(String NamaLengkap) {
        this.NamaLengkap = NamaLengkap;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }
   
    
}

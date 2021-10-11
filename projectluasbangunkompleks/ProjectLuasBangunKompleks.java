/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectluasbangunkompleks;

/**
 *
 * @author ASUS
 */
public class ProjectLuasBangunKompleks {

    /**
     * @param args the command line arguments
     */
    // PROJECT 1
    public static void main(String[] args) {
    Lingkaran L = new Lingkaran();
    
    
    Persegi P = new Persegi();
    double LuasTotalLingkaran = 2 * (L.hitungLuas(42)* 22/7);
    double luasTotal = LuasTotalLingkaran + P.hitungLuas(42);
    System.out.println("Luas bangun datar project 1: " + luasTotal);
    
    
    //project 2
    Persegi K = new Persegi();
    Lingkaran B = new Lingkaran();
    Lingkaran Z = new Lingkaran();
    
    double LuasTotalPersegi2 = K.hitungLuas(14)* 2;
    double LuasTotalLingkaran2 = B.hitungLuas(14) * 22/7;
    double LuasLingkaranBesar2 = 0.5 * (Z.hitungLuas(28)* 22/7);
    double luasTotal2= LuasTotalPersegi2 + LuasTotalLingkaran2 - LuasLingkaranBesar2;
    System.out.println("luas daerah yang berwarna abu-abu pada project 2 adalah : " + luasTotal2);
    }
}

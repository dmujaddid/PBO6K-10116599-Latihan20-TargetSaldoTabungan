/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo6k.pkg10116599.latihan20.targetsaldotabungan;

/**
 *
 * @author 
 * NAMA     : Robby Eka Purnama
 * KELAS    : PBO6K
 * NIM      : 10116599
 * Deskripsi Program : Program perhitungan lama tabungan sampai mencapai saldo target.
 * 
 */
public class PBO6K10116599Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        // Variabel
        float saldoAwal;
        saldoAwal=3500000;
        double bunga= 0.8;
        float saldoTarget=6000000;
        
        for (int i = 0; i < 6; i++) {
                    System.out.println("Saldo di bulan ke-" +(i+1)+ " Rp " +(saldoAwal+(saldoAwal*bunga)));
        
    }
    }   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universitas;

/**
 *
 * @author ahmad
 */
public class MahasiswaBeraksi {
    public static void main(String[] args) {   
        Mahasiswa mhs = new Mahasiswa("2110010480", "Ahmad Habibie", "Informatika");
        String detail = mhs.getDetail();
        System.out.println(detail);
    }
}
 

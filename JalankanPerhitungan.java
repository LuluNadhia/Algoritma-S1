import model.Perhitungan;

public class JalankanPerhitungan {
    public void main(String[] args) {
        
        Perhitungan p = new Perhitungan(8,2,10);
        p.PrintJudul();

        int HasilTambah = p.HasilPenambahan(8,2);
        System.out.println("Hasil Tambah = " + HasilTambah);

        int HasilKali = p.Hasilperkalian(8,2);
        System.out.println(" Hasil Kali = " + HasilKali);


        //Tugas /TM
        // Tampilkan hasil perhitungan dengan memanggil method yg ada pada perhitungan.java
        // method yg dibut, menerima parameter dan mengembalikan nilai(method with return)
        // dikumpulkan hari sabutu tgl 23
        // hasil dikumpulkan berupa github repo masing2 siswa
        //Subjek email : TM_NAMALENGKAP_KELAS dikirim ke aherijanto@mimoapps.xyz
        // e.g TM_21090066_LULU NADHAITUN ANISAH_2C


    }

}

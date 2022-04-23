package model;

import Interfaces.ContohInterface;

public class Perhitungan implements ContohInterface {
    private int a;
    private int b;
    private int hasil;

    public Perhitungan(int _a,int _b,int _hasil){
        this.a = _a;
        this.b = _b;
        _hasil = 0;
        this.hasil = _hasil;
        printJudulClass("Print judul dalam class Perhitungan ");
    }

    private void printJudulClass(String jdl){
        System.out.println(jdl);
    }

    @Override
    public void PrintJudul() {
        System.out.println("Judul Dalaam Interface");
    }

    @Override
    public void HitungTambah() {
        this.hasil = this.a + this.b;


    }

    @Override
    public void HitungKali() {
        this.hasil = this.a * this.b;

    }

    public int HasilPenambahan(int a1, int b1){
        this.a = a1;
        this.b = b1;
        HitungTambah();
        return this.hasil;
    }

    public int Hasilperkalian(int a2, int b2){
        this.a = a2;
        this.b = b2;
        HitungKali();
        return this.hasil;
    }
}

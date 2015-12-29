/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tryfp;

/**
 *
 * @author Ahmad
 */
public class Pertanyaan {
    String matkul,pokbas,pertanyaan,jawabanA,jawabanB,jawabanC,jawabanD,jawabanE;
    boolean a,b,c,d,e;

    public Pertanyaan(String matkul, String pokbas, String pertanyaan, 
            String jawabanA, boolean a,
            String jawabanB, boolean b,
            String jawabanC, boolean c,
            String jawabanD, boolean d,
            String jawabanE, boolean e) {
        this.matkul = matkul;
        this.pokbas = pokbas;
        this.pertanyaan = pertanyaan;
        this.jawabanA = jawabanA;
        this.jawabanB = jawabanB;
        this.jawabanC = jawabanC;
        this.jawabanD = jawabanD;
        this.jawabanE = jawabanE;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }

    public String getPertanyaan() {
        return pertanyaan;
    }

    public String getMatkul() {
        return matkul;
    }

    public String getPokbas() {
        return pokbas;
    }

    public String getJawabanA() {
        return jawabanA;
    }

    public String getJawabanB() {
        return jawabanB;
    }

    public String getJawabanC() {
        return jawabanC;
    }

    public String getJawabanD() {
        return jawabanD;
    }

    public String getJawabanE() {
        return jawabanE;
    }
    
    public boolean isA() {
        return a;
    }

    public boolean isB() {
        return b;
    }

    public boolean isC() {
        return c;
    }

    public boolean isD() {
        return d;
    }

    public boolean isE() {
        return e;
    }

    
    
    
}

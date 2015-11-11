package com.company;

/**
 * Created by Stanislovas on 2015-11-11.
 */
public class Darbuotojas {
    private String vardas, pavarde;
    private int gimimoMetai;
    private long asmensKodas;
    private int laikas;

    public Darbuotojas(String v) {
        vardas = v;
    }
    public Darbuotojas(String v, String p, int gm, long ak, int l) {
        vardas = v;
        pavarde = p;
        gimimoMetai = gm;
        asmensKodas = ak;
        laikas = l;
    }

    public String getVardas() {
        return vardas;
    }

    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public int getGimimoMetai() {
        return gimimoMetai;
    }

    public void setGimimoMetai(int gimimoMetai) {
        this.gimimoMetai = gimimoMetai;
    }

    public long getAsmensKodas() {
        return asmensKodas;
    }

    public void setAsmensKodas(long asmensKodas) {
        this.asmensKodas = asmensKodas;
    }

    public int getLaikas() {
        return laikas;
    }

    public void setLaikas(int laikas) {
        this.laikas = laikas;
    }
}

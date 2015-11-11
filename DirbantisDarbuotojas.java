package com.company;

/**
 * Created by Stanislovas on 2015-11-11.
 */
public class DirbantisDarbuotojas extends Darbuotojas {
    private int pareigos, valandinis;

    public DirbantisDarbuotojas(String v, String p, int gm, long ak, int l, int pareigos, int valandinis) {
        super(v, p, gm, ak, l);

        this.pareigos = pareigos;
        this.valandinis = valandinis;
    }

    public int getPareigos() {
        return pareigos;
    }

    public void setPareigos(int pareigos) {
        this.pareigos = pareigos;
    }

    public int getValandinis() {
        return valandinis;
    }

    public void setValandinis(int valandinis) {
        this.valandinis = valandinis;
    }
}

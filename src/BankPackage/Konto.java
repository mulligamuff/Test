package BankPackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Konto implements Serializable {
    private String kontoNamn;
    private double saldo;
    private List<String> TransaktionsHistorik;

    public Konto(String kontoNamn) {
        this.kontoNamn = kontoNamn;
        this.saldo = 0.0;
        this.TransaktionsHistorik = new ArrayList<>();
    }

    public double getSaldo() {
        return saldo;
    }

    public List<String> getTransaktionsHistorik() {
        return TransaktionsHistorik;
    }

    public void deposit(double belopp) {
        if (belopp > 0) {
            saldo += belopp;
            TransaktionsHistorik.add("Insättning: " + belopp + " SEK");
        }
    }

    public boolean withdraw(double belopp) {
        if (belopp > 0 && saldo >= belopp) {
            saldo -= belopp;
            TransaktionsHistorik.add("Uttag: " + belopp + " SEK");
            return true;
        } else {
            return false;
        }
    }
}

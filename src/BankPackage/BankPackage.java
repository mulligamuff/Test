package BankPackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankPackage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Konto> konton = new HashMap<>();
        ArrayList<String> TransaktionsHistorik = new ArrayList<>();
        String nuvarandeKonto = null;

        while (true) {
            if (nuvarandeKonto == null) {
                System.out.println("Välkommen till din bank!");
                System.out.println("Välj ett befintligt konto att logga in på eller skapa ett nytt:");
                System.out.println("1. Logga In");
                System.out.println("2. Skapa nytt konto");
                System.out.println("3. Visa befintliga konton");
                System.out.println("4. Avsluta");

                int val = scanner.nextInt();

                switch (val) {
                    case 1:
                        System.out.print("Ange konto att logga in på: ");
                        String inloggningsKonto = scanner.next();
                        if (konton.containsKey(inloggningsKonto)) {
                            nuvarandeKonto = inloggningsKonto;
                        } else {
                            System.out.println("Kontot finns inte. Försök igen.");
                        }
                        break;

                    case 2:
                        System.out.print("Ange konto namn: ");
                        String nyttKontoNamn = scanner.next();
                        System.out.print("Ange initial insättning (minst 500 SEK): ");
                        double initialDeposit = scanner.nextDouble();

                        if (initialDeposit < 500) {
                            System.out.println("Minsta insättning är 500 SEK. Försök igen.");
                        } else {
                            Konto nyttKonto = new Konto(nyttKontoNamn);
                            nyttKonto.deposit(initialDeposit);
                            konton.put(nyttKontoNamn, nyttKonto);
                            nuvarandeKonto = nyttKontoNamn;
                        }
                        break;

                    case 3:
                        System.out.println("Befintliga konton:");
                        for (String konto : konton.keySet()) {
                            System.out.println(konto);
                        }
                        break;

                    case 4:
                        System.out.println("Tack för besöket! Programmet avslutas.");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Ogiltigt val. Försök igen.");
                        break;
                }
            } else {
                System.out.println("\nNuvarande konto: " + nuvarandeKonto);
                System.out.println("Ditt saldo är: " + konton.get(nuvarandeKonto).getSaldo() + " SEK");
                System.out.println("Välj en åtgärd:");
                System.out.println("1. Sätt in pengar");
                System.out.println("2. Ta ut pengar");
                System.out.println("3. Visa transaktionshistorik");
                System.out.println("4. Logga ut");

                int value = scanner.nextInt();
                Konto aktuelltKonto = konton.get(nuvarandeKonto);

                switch (value) {
                    case 1:
                        System.out.print("Ange belopp att sätta in: ");
                        double valuta = scanner.nextDouble();
                        aktuelltKonto.deposit(valuta);
                        TransaktionsHistorik.add(nuvarandeKonto + ": Insättning: " + valuta + " SEK");
                        break;

                    case 2:
                        System.out.print("Ange belopp att ta ut: ");
                        double uttag = scanner.nextDouble();
                        if (aktuelltKonto.withdraw(uttag)) {
                            TransaktionsHistorik.add(nuvarandeKonto + ": Uttag: " + uttag + " SEK");
                        }
                        break;

                    case 3:
                        System.out.println("Transaktionshistorik:");
                        for (String transaktion : aktuelltKonto.getTransaktionsHistorik()) {
                            System.out.println(transaktion);
                        }
                        break;

                    case 4:
                        System.out.println("Loggar ut...");
                        int countdown = 3;
                        while (countdown > 0) {
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                            countdown--;
                        }
                        nuvarandeKonto = null;
                        break;

                    default:
                        System.out.println("Ogiltigt val. Försök igen.");
                        break;
                }
            }
        }
    }
}

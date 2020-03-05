import java.util.Scanner;

public class calculator {

    public static void add() {
        Scanner in = new Scanner(System.in);
        System.out.println("Bitte geben sie ihre erste Zahl ein: ");
        int getnum1 = in.nextInt();
        System.out.println("Bitte geben sie ihre zweite Zahl ein: ");
        int getnum2 = in.nextInt();
        System.out.println("Das ergebniss ist: " + (getnum1 + getnum2));
    }
    public static void sub() {
        Scanner in = new Scanner(System.in);
        System.out.println("Bitte geben sie ihre erste Zahl ein: ");
        int getnum1 = in.nextInt();
        System.out.println("Bitte geben sie ihre zweite Zahl ein: ");
        int getnum2 = in.nextInt();
        System.out.println("Das ergebniss ist: " + (getnum1 - getnum2));
    }

    public static void div() {
        Scanner in = new Scanner(System.in);
        System.out.println("Bitte geben sie ihre erste Zahl ein: ");
        int getnum1 = in.nextInt();
        System.out.println("Bitte geben sie ihre zweite Zahl ein: ");
        int getnum2 = in.nextInt();
        System.out.println("Das ergebniss ist: " + (getnum1 / getnum2));
    }
    public static void multi(){
        Scanner in = new Scanner(System.in);
        System.out.println("Bitte geben sie ihre erste Zahl ein: ");
        int getnum1 = in.nextInt();
        System.out.println("Bitte geben sie ihre zweite Zahl ein: ");
        int getnum2 = in.nextInt();
        System.out.println("Das ergebniss ist: "+ (getnum1 * getnum2));
    }

    public static void main(String[] args) {
        boolean abb = true;
        while(abb) {
            Scanner in = new Scanner(System.in);
            System.out.println("Wählen Sie Ihre gewünschte Rechenmethode :\n" +
                    "[1] fuer addition\n" +
                    "[2] fuer subtraktion\n" +
                    "[3] fuer division\n" +
                    "[4] fuer mutliplikation");
            int firstIn = in.nextInt();

            if (firstIn == 1) {
                add();
            } else if (firstIn == 2) {
                sub();
            } else if (firstIn == 3) {
                div();
            } else if (firstIn == 4) {
                multi();
            }
            System.out.println("1 fuer abbruch!");
            int secoundIn = in.nextInt();
            if(secoundIn == 1){
                abb = false;

            }
        }
    }

}
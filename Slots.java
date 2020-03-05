import java.util.Scanner;


class Slots {
    public static int charge() {
        Scanner in = new Scanner(System.in);
        System.out.println("please enter the amount you wanna pay in: ");
        return in.nextInt();
    }

    public static int bet() {
        Scanner in = new Scanner(System.in);
        System.out.println("please give me your bet: ");
        return in.nextInt();
    }

    public static int rngnumber() {
        return (int)(Math.random()*((3-1)+1))+1;
    }

    public static void main(String[] args) {
        int win = 0;
        int lose = 0;
        int first_balance;
        while (true) {
            try {
                first_balance = charge();
                break;
            } catch (Exception e) {
                System.out.println("please enter only numbers!");
            }
        }
        int balance = first_balance;
        System.out.println("your current balance is: " + balance + " euro");

        boolean running = true;
        while (running) {
            if(balance == 0){
                balance = charge();
            }
            int bet;
            while (true) {
                try {
                    bet = bet();
                    if(bet <= balance) {
                        break;
                    }
                    else{
                        System.out.println("your bet cant be higher than your balance..");
                    }
                } catch (Exception e) {
                    System.out.println("please enter only numbers!");
                }
            }
            int[] rngz = {rngnumber(), rngnumber(), rngnumber(), rngnumber(), rngnumber(), rngnumber(), rngnumber(), rngnumber(), rngnumber()};
            String[] values = new String[9];
            for (int i = 0; i < 9; i++) {
                if (rngz[i] == 1) {
                    values[i] = " Ace ";
                } else if (rngz[i] == 2) {
                    values[i] = " Pik ";
                } else {
                    values[i] = "Heart";
                }
            }

            System.out.println(values[0] + " | " + values[1] + " | " + values[2] + "\n"
                    + values[3] + " | " + values[4] + " | " + values[5] + "\n"
                    + values[6] + " | " + values[7] + " | " + values[8]);

            // Horizontal wins
            if (values[0].equals(values[1]) && values[0].equals(values[2])) {
                System.out.println("win");
                balance = bet  + balance;
                win = win +1;
            } else if (values[3].equals(values[4]) && values[3].equals(values[5])) {
                System.out.println("win");
                balance = bet  + balance;
                win = win +1;
            } else if (values[6].equals(values[7]) && values[6].equals(values[8])) {
                System.out.println("win");
                balance = bet  + balance;
                win = win +1;
            }
            // Vertikal wins
            else if (values[0].equals(values[4]) && values[0].equals(values[8])) {
                System.out.println("win");
                balance = bet  + balance;
                win = win +1;
            } else if (values[6].equals(values[4]) && values[6].equals(values[2])) {
                System.out.println("win");
                balance = bet  + balance;
                win = win +1;
            } else {
                System.out.println("\nSorry, you lose");
                balance = balance - bet;
                lose = lose +1;
            }


            System.out.println("your balance is currently: " + balance + " euro\n------------------");

            while (true) {
                Scanner in = new Scanner(System.in);
                System.out.println("write end to exit and c to continue");
                String exit = in.next();
                if (exit.equals("c")) {
                    break;
                } else if (exit.equals("end")) {
                    if(balance >= first_balance) {
                        System.out.println("congratulations you won "+(balance-first_balance)+" euro | wins: " +win+" loses: "+lose);
                    }
                    else if(balance <= first_balance){
                        System.out.println("you cashed out "+balance+" euro | wins: " +win+" loses: "+lose);
                    }
                    running = false;
                    break;
                } else {
                    System.out.println("please enter only 'c' or 'end'");
                }
            }
        }
    }
}

class Fibonacci {
    public static void main(String[] args) {
        int i = 0;

        int fib1 = 0;
        int fib2 = 1;

        while(i < 15){
            int erg = fib1 + fib2;
            System.out.println(erg);
            fib1 = fib2;
            fib2 = erg;

            i++;
        }
    }

}
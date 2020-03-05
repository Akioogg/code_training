import java.util.Scanner;

class Rueckgeld{
    public static void main(String[] args){
        System.out.println("geben Sie Ihren gewuenschten betrag ein zum aufteilen!: ");
        Scanner in = new Scanner(System.in);
        double rueckgeld = in.nextDouble();
        rueckgeld = rueckgeld *100;
        while(rueckgeld != 0){
            if(rueckgeld >=5000) {
                System.out.println("1x 50 euroschein");
                rueckgeld = rueckgeld - 5000;
            }
            if(rueckgeld >=4000){
                System.out.println("2x 20 euroscheine");
                rueckgeld = rueckgeld -4000;
            }
            if(rueckgeld >=2000){
                System.out.println("1x 20 euroschein");
                rueckgeld = rueckgeld -2000;
            }

            if(rueckgeld >=1000){
                System.out.println("1x 10 euroschein");
                rueckgeld = rueckgeld -1000;
            }
            if(rueckgeld >=500){
                System.out.println("1x 5 euroschein");
                rueckgeld = rueckgeld -500;
            }
            if(rueckgeld >=400){
                System.out.println("2x 2 euromuenzen");
                rueckgeld = rueckgeld -400;
            }
            if(rueckgeld >=200){
                System.out.println("1x 2 euromuenze");
                rueckgeld = rueckgeld -200;
            }
            if(rueckgeld >=100){
                System.out.println("1x 1 euromuenze");
                rueckgeld = rueckgeld -100;
            }
            if(rueckgeld >=50){
                System.out.println("1x 50 centmuenze");
                rueckgeld = rueckgeld -50;
            }
            if(rueckgeld >=40){
                System.out.println("2x 20 centmuenzen");
                rueckgeld = rueckgeld -40;
            }
            if(rueckgeld >=20){
                System.out.println("1x 20 centmuenze");
                rueckgeld = rueckgeld -20;
            }
            if(rueckgeld >=10){
                System.out.println("1x 10 centmuenze");
                rueckgeld = rueckgeld -10;
            }
            if(rueckgeld >=5) {
                System.out.println("1x 5 centmuenze");
                rueckgeld = rueckgeld - 5;
            }
            if(rueckgeld >=4){
                System.out.println("2x 2 centmuenzen");
                rueckgeld = rueckgeld -4;
            }

            if(rueckgeld >=2){
                System.out.println("1x 2 centmuenze");
                rueckgeld = rueckgeld -2;
            }
            if(rueckgeld >=1){
                System.out.println("1x 1 centmuenze");
                rueckgeld = rueckgeld -1;
            }
        }
    }
}

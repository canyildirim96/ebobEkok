import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number1, number2;
        int i = 1;

        Scanner inp = new Scanner(System.in);

        /*System.out.print("İlk Değeri Giriniz: ");
        number1 = inp.nextInt();

        System.out.print("İkinci Değeri Giriniz: ");
        number2 = inp.nextInt();

         */
        int ebob = 1;

                do {
                    System.out.print("İlk Değeri Giriniz: ");
                    number1 = inp.nextInt();

                    System.out.print("İkinci Değeri Giriniz: ");
                    number2 = inp.nextInt();
                    if (number2 < number1){
                    System.out.println("Hatalı Giriş Yaptınız. Lütfen Tekrar Deneyiniz.");
                    }else {
                        while (i <= number1) {
                            if (number1 % i == 0 && number2 % i == 0) {
                                ebob = i;
                            }
                            i++;
                        }
                        System.out.println("Ebob: " + ebob);

                        while (i <= (number1 * number2)) {
                            if (number1 % i == 0 && number2 % i == 0) {
                            }
                            break;
                        }
                        System.out.println("Ekok: " + (number1 * number2) / ebob);
                    }
                } while (number2 < number1);



    }
}

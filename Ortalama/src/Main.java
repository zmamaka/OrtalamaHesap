import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        int mat, fizik, tr, kimya, muz, x = 0;
        float average = 0;

        System.out.print("Matematik notunu giriniz => ");
        mat = scn.nextInt();

        System.out.print("Fizik notunu giriniz => ");
        fizik = scn.nextInt();

        System.out.print("Türkçe notunu giriniz => ");
        tr = scn.nextInt();

        System.out.print("Kimya notunu giriniz => ");
        kimya = scn.nextInt();

        System.out.print("Müzik notunu giriniz => ");
        muz = scn.nextInt();

        if (!(mat < 0 || mat > 100)){
            average += mat;
            x++;
        }

        if (!(fizik < 0 || fizik > 100)){
            average += fizik;
            x++;
        }

        if (!(tr < 0 || tr > 100)){
            average += tr;
            x++;
        }

        if (!(kimya < 0 || kimya > 100)){
            average += kimya;
            x++;
        }

        if (!(muz < 0 || muz > 100)){
            average += muz;
            x++;
        }

        average /= x;

        if (average <= 55){
            System.out.println("Sınıfta kaldınız");
        }else {
            System.out.println("Sınıfı geçtiniz");
        }

        System.out.println("Ortalamanız " + average);

    }
}

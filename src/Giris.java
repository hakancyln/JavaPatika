import java.util.Scanner;

public class Giris {
    public static void main(String[] args) {
        int mat, kimya, fizik, muzik, turkce, tarih;
        Scanner value = new Scanner(System.in);

        System.out.print("Matematik Notu:");
        mat = value.nextInt();

        System.out.print("Kimya Notu:");
        kimya = value.nextInt();

        System.out.print("Fizik Notu:");
        fizik = value.nextInt();

        System.out.print("Müzik Notu:");
        muzik = value.nextInt();

        System.out.print("Tarih Notu:");
        tarih = value.nextInt();

        System.out.print("Türkçe Notu:");
        turkce = value.nextInt();

        double ort = (mat + muzik + kimya + fizik + turkce + tarih) / 6;
        String sonuc;
        System.out.print(ort > 60 ? "Ortalama " + ort + " Geçti" : "Ortalama " + ort + " Kaldı");
    }
}
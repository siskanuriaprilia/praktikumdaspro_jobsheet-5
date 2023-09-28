import java.util.Scanner;

public class PemilihanPercobaan227 {
   public static void main(String[] args ){

    Scanner input27 = new Scanner (System.in);

    System.out.print(" Nilai uas     : ");
    float uas = input27.nextFloat();
    System.out.print (" Nilai uts     : ");
    float uts = input27.nextFloat();
    System.out.print(" Nilai kuis    : ");
    float kuis = input27.nextFloat();
    System.out.print(" Nilai tugas   : ");
    float tugas = input27.nextFloat();

    float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

    if (80 < total && total <= 100){
      System.out.println("Nilai Huruf Anda = A \nNilai Setara Anda = 4 \nKualifikasi = Sangat Baik");
    }
    else if (73 < total && total <= 80){
      System.out.println("Nilai Huruf Anda = B+ \nNilai Setara Anda = 3,5 \nKualifikasi = Lebih dari Baik");
    }
    else if (65 < total && total <= 73){
      System.out.println("Nilai Huruf Anda = B \nNilai Setara Anda = 3 \nKualifikasi = Baik");
    }
    else if (60 < total && total <= 65){
      System.out.println("Nilai Huruf Anda = C+ \nNilai Setara Anda = 2,5 \nKualifikasi = Lebih dari Cukup");
    }
    else if (50 < total && total <= 60){
      System.out.println("Nilai Huruf Anda = C \nNilai Setara Anda = 2 \nKualifikasi = Cukup");
    }
    else if (39 < total && total <= 50){
      System.out.println("Nilai Huruf Anda = D \nNilai Setara Anda = 1 \nKualifikasi = Kurang ");
    }
    else if (0 < total && total <= 39){
      System.out.println("Nilai Huruf Anda = E \nNilai Setara Anda =0 \nKualifikasi = Gagal");
    }
    else {
      System.out.println("Terjadi Kesalahan");
    }

    String message = + total <65 ? "Remidi" : "Tidak remidi";

    System.out.println("Nilai akhir = " + total + " sehingga " + message );

   } 
}

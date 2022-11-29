import java.text.DecimalFormat;
import java.util.Random;
import java.util.Scanner;

public class LovePrediction {
  public static void main(String[] args) {
    Scanner myInput = new Scanner(System.in);  
    DecimalFormat formatNumber = new DecimalFormat("####0.00");
    Random random = new Random();
    int low = 50;
    int high = 100;
    int result = random.nextInt(high-low) + low;
    

    System.out.println("Data Anda : ");
    System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥");
    
    // your name
    System.out.print("Masukan Nama Anda : ");
    String yourName = myInput.nextLine();

    // your age
    System.out.print("Masukan Umur Anda : ");
    Integer yourAge = myInput.nextInt();
    myInput.nextLine();  // Consume newline left-over
    // input name 
    System.out.println("Data Pasangan Anda : ");
    System.out.println("♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥♥");

    // your name
    System.out.print("Masukan Nama Pasangan Anda : ");
    String yourPartnerName = myInput.nextLine();

    // your age
    System.out.print("Masukan Umur Pasangan Anda : ");
    Integer yourPartnerAge = myInput.nextInt();

    System.out.println("\n");
    System.out.println(yourName + " [" + yourAge + "] " + "tahun");
    System.out.println("\n");
    System.out.println("  ♥♥♥♥   ♥♥♥♥");
    System.out.println(" ♥♥♥♥♥♥_♥♥♥♥♥♥");
    System.out.println(" ♥♥♥♥♥♥♥♥♥♥♥♥♥♥");
    System.out.println("  ♥♥♥♥♥♥♥♥♥♥♥♥");
    System.out.println("    ♥♥♥♥♥♥♥♥");
    System.out.println("      ♥♥♥♥");
    System.out.println("       ♥♥");
    System.out.println("\n");
    System.out.println(yourPartnerName + " [" + yourPartnerAge + "] " + "tahun");
    System.out.println("\n");
    System.out.println("\n");

    System.out.println("Tekan ENTER untuk melihat hasil ramalan...");
    myInput.nextLine();

    System.out.println("\n");
    System.out.println("Kecocokan anda dengan pasangan anda adalah : " + formatNumber.format(result/1.1) + "%");
    System.out.println("\n");
    System.out.println("Terima Kasih karena anda telah menggunakan jasa Ramalan kami... ^^v");

  }
}
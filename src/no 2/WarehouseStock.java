import java.text.DecimalFormat;
import java.util.Scanner;

public class WarehouseStock {
  public static void main(String[] args) {
    Scanner myInout = new Scanner(System.in);  
    DecimalFormat formatNumber = new DecimalFormat("####0.00");
    String divider = "#########################";
    // input name 
    System.out.print("Masukan nama anda: ");
    String name = myInout.nextLine();

    // print label 
    System.out.println("Stok Gudang Input Barang");
    // print divider
    System.out.println(divider);

    //print name input user
    System.out.println("Selamat Datang " + name);

    // input name of goods
    System.out.print("Masukan nama barang yang mau ditambah: ");
    String goodsName = myInout.nextLine();

    // input total stock
    System.out.print("Masukan jumlah barang yang mau ditambahkan: ");
    Integer currentStock = myInout.nextInt();

    //input purchase price
    System.out.print("Masukan harga beli untuk barang tersebut: ");
    Float buyPrice = myInout.nextFloat();

    //input selling price
    System.out.print("Masukan harga jual untuk barang tersebut: ");
    Float sellingPrice = myInout.nextFloat();
    // print label
    System.out.println("Stok Gudang Rincian Barang");
    // print divider
    System.out.println(divider);

    // output
    
    System.out.println("Nama Barang   : " + goodsName);
    System.out.println("Jumlah Barang : " + currentStock);
    System.out.println("Harga Beli    : " + formatNumber.format(buyPrice));
    System.out.println("Harga Jual    : " + formatNumber.format(sellingPrice));
  }
}

package diler;


public class Honda extends Mobil{
public void tampilkan(){
     double besarsilinder=5.5;
     String bahanbakar="Pertamax";
     String kategori="Sport";

     Mobil m = new Mobil();

     m.inputData("CRV", "Hitam", "Mewah", 4);
     m.tampilkandata();

      System.out.println("silinder :"+besarsilinder);
      System.out.println("jenis bahan bakar :"+bahanbakar);
      System.out.println("jenis kategori :"+kategori);
    
}    
}
    

package tugasperulangan;

import java.util.Scanner;

public class Nomor_2 {

    public static void main(String[] args) {
        int awal, akhir, total=0;
        Scanner in = new Scanner(System.in);
        
        awal = in.nextInt();
        akhir = in.nextInt();
        
        for(int i=awal;awal<akhir;awal++){
            if(i%2==0){
                total+=1;
            }
        }
        
        System.out.println("Jumlah deret bilangan genap dari " + awal +" - "+akhir+" adalah "+ total);
    }
    
}

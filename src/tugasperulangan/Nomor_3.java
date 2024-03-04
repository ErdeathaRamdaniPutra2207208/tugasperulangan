package tugasperulangan;

import java.util.Scanner;

public class Nomor_3 {

    public static void main(String[] args) {
        int a, b, hasil, besar;
        Scanner in = new Scanner(System.in);
        
        a = in.nextInt();
        b = in.nextInt();
        
        if(a<b){
            besar = b;
        }else{
            besar = a;
        }
        for(int i=a;i<b;i++){
            hasil = i/besar;
            System.out.println(hasil);
        }
    }
    
}

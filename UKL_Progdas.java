/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Arjuna
 */
public class UKL {
    public static void main(String[] args) {
        System.out.println("Soal mudah ke 3");
        System.out.println(" ");
        for ( int l = 50; l > 1; l--){
            if(l % 2 == 0){
                  if(l % 3==0){
                System.out.println(l+ ". Saya angkatan 33");
          
            }else {
                System.out.println(l+ ". Saya anak moklet");
            }
                  
                
            }else if (l % 2==1){
                if (l % 3==0){
                System.out.println(l+ ". Saya angkatan 33");
                }else{
                System.out.println(l+". Saya anak wikusama");
                }
                
                }
            
        }
        System.out.println("1. Saya senang");
        
        
        
        System.out.println("===================================================");
        System.out.println(" Soal sedang ke 1");
        System.out.println(" ");
        int tabungan = 100000;
        int bulanan = 50000;
        int total=0;
        for(int b = 1; b<=12 ; b++){
            System.out.println("Tabungan bulan ke "+b+" adalah : "+tabungan);
            
            tabungan += bulanan;
            if(b>=2){
                total+=bulanan;
            
        }
        }
        System.out.println("Total bulanan masuk "+total);       
        System.out.println("===================================================");
        System.out.println(" Soal susah ke 1");
        System.out.println(" ");
        
        Scanner scan = new Scanner(System.in);
        int s;
        double rata2=0;
        int totalhadir=0;
        System.out.print("Masukkan jumlah siswa : ");
        s = scan.nextInt();
        int []H = new int [s];
        
        for(int h = 0; h < s; h++){
            System.out.print("Masukkan jumlah hadir siswa "+(h+1)+" : ");
             H[h]= scan.nextInt();
             totalhadir += H[h];
        }
        
        rata2 = totalhadir / s;
        System.out.println(" ");
        
        System.out.println("Rekap kehadiran Siswa selama 1 bulan ");        
    for (int i = 0; i < s; i++) {
            System.out.println("Siswa ke " +(i+1)+ ": " +H[i] + " hari hadir");
        }
    System.out.print("Rata-rata kehadiran siswa: "+rata2+" hari");
        System.out.println(" ");
        System.out.println("Kesimpulan");
        System.out.println(" ");
        System.out.println("Siswa yang kehadirannya di atas rata-rata");
       for(int i = 0; i<s;i++){
        if(H[i] > rata2 ){
            System.out.println("Siswa ke "+(i+1)+ "("+H[i]+" hari)");
        }   
      
       }
        System.out.println(" ");
       System.out.println("Siswa yang kehadirannya di bawah rata-rata");
       for(int i = 0; i<s;i++){
        if(H[i] < rata2 ){
            System.out.println("Siswa ke "+(i+1)+ "("+H[i]+" hari)");
        }
      
       }
       
       
    }
}

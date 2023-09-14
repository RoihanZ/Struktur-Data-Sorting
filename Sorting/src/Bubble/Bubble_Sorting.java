package Bubble;

public class Bubble_Sorting {

    static void BubbleSort(int[]angka){
        /* Ini perulangan seluruh program yang ada di dalam kurung kurawal berdasarkan jumlah array */
        for(int i = 0; i < angka.length; i++){ 
            /* angka.length perlu dikurangi 1 jika tidak errornya nanti ada di if(angka[j]>angka[j+1])
            Karena misal disini arraynya panjangnya 7 (int []angka)
            Dibaca jika angka j nya udah berada di 7 jadi if(angka[7]>angka[7+1] atau angka[8]) maka error
            Kenapa error karena panjang dari arraynya sudah lebih dari 7 */
            for(int j = 0; j < angka.length-1; j++){ // Ini perulangan di dalam arraynya
                //Mencek apakah nilai array [0] lebih besar dari nilai array [1] jika tidak lebih dari 0 maka dilewati akan ditukar
                if(angka[j]>angka[j+1]){ 
                int temp = angka[j]; //Nilai array saat ini ditampung sementara di variabel temp
                angka[j]=angka[j+1]; //Nilai saat ini diganti dengan nilai selanjutnya
                angka[j+1]=temp; //Nilai selanjutnya diganti variabel temp yang menampung nilai array saat ini
            }
        }
    }
}
    public static void main(String[] args){
        int []angka = {7,12,8,6,9,11,10}; // Variabel array untuk menampung nilai
        
        System.out.println("Nilai sebelum di sortir");
        for(int i = 0; i < angka.length; i++){ // Perulangan untuk menampilkan nilai arraynya
            System.out.print(angka[i]+ " "); 
        }
        System.out.println("\n------------------");
        BubbleSort(angka); //Memanggil method yang sudah dibuat jadi variabel angka ini sudah disortir jadi 
        System.out.println("Nilai setelah di sortir");
        for(int i = 0; i < angka.length; i++){ // Perulangan untuk menampilkan nilai array yang sudah di sortir
            System.out.print(angka[i]+ " ");
        }
    }
}
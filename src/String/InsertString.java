package String;
//Seperti Library
import java.util.Scanner;

public class InsertString {
    public static void main(String[] args) {
        //Menungu user untuk memasukkan input
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();

        //Menampilkan jumlah huruf dari kata a dan kata b
        System.out.println(A.length() + B.length());

        //Menentukan apakah huruf huruf awal yang membentuk kata B memiliki urutan alfabet
        //Sebelum huruf huruf awal yang membentuk kata A atau tidak
        int i = A.compareTo(B);
        if (i > 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        //Merubah huruf pertama masing-masing menjadi kapital
        //fungsi substring yaitu untuk mengambil indeks angka
        String aTempt = A.substring(0,1).toUpperCase()+A.substring(1);
        String bTempt = B.substring(0,1).toUpperCase()+B.substring(1);

        //Menggabungkan kata A dan kata B kemudian dipisahkan oleh seorang spasi
        System.out.println(aTempt + " " + bTempt);
    }
}

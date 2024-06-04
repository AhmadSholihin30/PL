import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String namaFile = "Src/Data.txt";
        Scanner sc = new Scanner(System.in);
        int angka = sc.nextInt();

        try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))){
            String line;
            int index = 0;
            boolean ditemukan = false;

            while ((line = reader.readLine()) != null) {
                index++;
                int value = Integer.parseInt(line);

                if (angka == value) {
                    ditemukan = true;
                    break;
                }
            }
             if (ditemukan) {
                 System.out.println("Nilai " + angka + " Di index ke- " + index);
             }
        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}

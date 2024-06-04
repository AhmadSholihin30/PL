package Belajar;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        String namaFile = "src/sisi.txt";
        String outputFile = "src/output.txt";
        List<PersegiPanjang> b = new ArrayList<>();
        try(BufferedReader br = new BufferedReader(new FileReader(namaFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] row = line.split(" ");
                PersegiPanjang p = new PersegiPanjang();
                p.panjang = Integer.parseInt(row[0]);
                p.lebar = Integer.parseInt(row[1]);
                b.add(p);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

        b.sort(Comparator.comparingInt(PersegiPanjang::hitungLuas));

        for(PersegiPanjang p : b){
            System.out.println(p.hitungLuas());
        }
        try{
            FileWriter fw = new FileWriter(outputFile);
            for(PersegiPanjang p : b){
                fw.write(p.panjang + " " + p.lebar + "\n");
            }
            fw.close();

        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}

import java.io.FileWriter;
import java.io.IOException;

public class Write {
    public static void main(String[] args) {
        String namaFile = "Src/output.txt";
        String text = " Hello world";
        try{
            FileWriter fw = new FileWriter(namaFile);
            for (int i = 0; i < 10; i++) {
                fw.write(text + "\n");
            }
            fw.close();

        }catch (IOException e){
            System.err.println(e.getMessage());
        }
    }
}

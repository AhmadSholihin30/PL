import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FindIndex {
    public static void main(String[] args) {
        String fileName = "Src/Data.txt";
        List<Integer> data = new ArrayList<>();
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String line;
                int index = 0;
                while ((line = reader.readLine()) != null) {
                    int value = Integer.parseInt(line);
                    data.add(value);
                    for (int i = 0; i < data.size(); i++) {
                        if (data.get(i) == value) {
                            index = i;
                        }
                    }
                }
            } catch (IOException e) {
                System.err.println("Error: " + e.getMessage());
            }
        }
    }
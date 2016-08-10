package day8.Concordance;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.io.IOException;

public class Concordance {
    public static void main(String[] args) throws IOException {

        FileReader in = new FileReader("source/Pride and Prejudice.txt");
        BufferedReader br = new BufferedReader(in);
        String line;
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            sb.append(line);
            sb.append(System.lineSeparator());
        }
        String[] split = sb.toString().split("\\W+");
        HashMap<String, Integer> map = new HashMap<>();
        for (String i : split) {
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            }
            else{
                map.put(i, 1);
            }
        }
        for (Object a : map.keySet()){
            System.out.println("Word "+a +" occurs "+ map.get(a) + " times");
        }
        in.close();
    }
}

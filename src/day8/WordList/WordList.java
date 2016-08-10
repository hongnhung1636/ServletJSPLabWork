package day8.WordList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class WordList {
    public static void main(String[] args) throws IOException {
        FileReader in = new FileReader("source/Pride and Prejudice.txt");
        BufferedReader br = new BufferedReader(in);
        String line;
        Collection<String> stringCollection;
        StringBuilder sb = new StringBuilder();
        while ((line = br.readLine()) != null) {
            sb.append(line);
            sb.append(System.lineSeparator());
        }
        String[] b = sb.toString().split("\\W+");
        List<String> stringList = Arrays.asList(b);
        stringCollection = stringList.stream().collect(Collectors.toSet());
        System.out.println(stringCollection);
        in.close();

    }
}

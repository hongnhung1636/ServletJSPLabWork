package day8.WordList;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class WordList {
    public static void main(String[] args) throws IOException {
        FileReader in = new FileReader("source/Pride and Prejudice.txt");
        BufferedReader br = new BufferedReader(in);
        String line;
        Collection<String> stringCollection;
        HashSet<String> wordList = new HashSet<>();
        while ((line = br.readLine()) != null) {
            String[] wordArray = line.split("\\W+");
            for(String w : wordArray){
                wordList.add(w.toLowerCase());
            }
        }
        stringCollection = wordList.stream().collect(Collectors.toSet());
        System.out.println(stringCollection);
        in.close();

    }
}

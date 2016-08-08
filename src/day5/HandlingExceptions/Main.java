package day5.HandlingExceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        System.out.print("Enter name of 1st file name: ");
        Scanner sc1 = new Scanner(System.in);
        String line1 = sc1.nextLine();
        System.out.print("Enter name of 2nd file name: ");
        Scanner sc2 = new Scanner(System.in);
        String line2 = sc2.nextLine();
        File first = new File(line1);
        File second = new File(line2);
        //check if 1st exit or not
        do {
            try {
                if (!first.exists()) {
                    System.out.println("1st File Doest Not Exist.Re-Enter the 1st file name:");
                    first = new File(sc1.nextLine());
                }
                else {
                    inputStream = new FileInputStream(first);
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } while (!first.exists());

        //check if 2nd exist or not then copy the content
        do {
            try {
                if (!second.exists()) {
                    System.out.println("2nd File Doest Not Exist.Re-Enter the 2nd file name:");
                    second = new File(sc2.nextLine());
                }else {
                    outputStream = new FileOutputStream(second);
                    byte[] bytes = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = inputStream.read(bytes)) > 0) {
                        outputStream.write(bytes, 0, bytesRead);
                    }
                    System.out.println("Copied");
                }
            } catch (FileNotFoundException e1) {
                e1.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (!second.exists());
    }
    }

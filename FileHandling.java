 // package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileHandling {

    public static void main(String[] args) {

        //code to create  a new file
//        File myFile = new File("raushan.txt");
//        try {
//            myFile.createNewFile(); // creation of file
//        } catch (IOException e) {
//            System.out.println("Unable to create ");
//            e.printStackTrace();
//        }


        //code to write to a file
//        try {
//            FileWriter fileWriter = new FileWriter("raushan.txt");
//            fileWriter.write("This is a 1st file !");
//            fileWriter.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        //Reading a file
//        File myFile = new File("raushan.txt");
//        try {
//            Scanner sc = new Scanner(myFile); // Reading myfile i.e. raushan.txt
//            while (sc.hasNextLine())
//            {
//                String line = sc.nextLine();
//                System.out.println(line);
//            }
//            sc.close();
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }

        // Code to delete the file
        File myfile = new File("raushan.txt");
        if(myfile.delete())
        {
            System.out.println("File deleted successfully : " + myfile);
        }
        else
        {
            System.out.println("Problem !! ");
        }


    }
}

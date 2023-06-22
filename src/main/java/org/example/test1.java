package org.example;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Paths;
import java.nio.file.Files;

public class test1 {
    public static void main(String[] args) throws IOException {
        //BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader restroReader = Files.newBufferedReader(Paths.get("C:\\Users\\ujjaw\\IdeaProjects\\shardaswiggy\\data\\restaurantname.csv"));
        System.out.println(restroReader.readLine());
        //String line = input.readLine();
        //System.out.println(line);
        //String[] partsOfLine = line.split(",");
        //for(String part : partsOfLine){
         //   System.out.println(part+"\n");
        //}
    }
}

package org.example;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    Dish[] dishList = new Dish[50];

    public static void main(String[] args) {
        System.out.printf("welcome to Swiggy App");

        }
        void parseRestroData() throws IOException{
        BufferedReader restroReader = Files.newBufferedReader(Paths.get("C:\\Users\\ujjaw\\IdeaProjects\\shardaswiggy\\data\\restaurantname.csv"));
        String line;

        for(int restroCntr = 0;(line = restroReader.readLine())!= null; restroCntr++);
            {
                String[]  restroData = line.split(",");
                restroList.add(restroCntr, new Restro(restroData[0],restroData[1]));

                List<Dish> tempMenu = new ArrayList<>();

                tempMenu = Arrays.stream(dishList).filter(dish -> dish.getRestroId().equals(restroData[0])).collect(Collectors.toList());

                restroList.get(restroCntr).setMenu(tempMenu);
            }
        }
        void parseDishData() throws IOException
        {
            BufferedReader dishReader = Files.newBufferedReader(Paths.get("C:\\Users\\ujjaw\\IdeaProjects\\shardaswiggy\\data\\dish.csv"));
            String line;
            for(int dishCntr = 0; (line = dishReader.readLine()) != null; dishCntr++){
                String[] dishData = line.split(",");
                dishList[dishCntr] = new Dish(dishData[0],dishData[1],dishData[2],Integer.valueOf(dishData[3]));
            }

        }
    }

package TestJava;

import java.util.*;

public class MapExample1 {


    public static void main(String[] args) {

        Map<String, Integer> batting_score = new HashMap<>();
        batting_score.put("Rohit Sharma", 27);
        batting_score.put("Virat Kholi", 84);
        batting_score.put("Shreyas Iyear", 175);
        batting_score.put("Hardik Pandaya", 25);


        System.out.println(" Virat Kholi has scored "+ batting_score.get("Virat Kholi") );

        for(Map.Entry<String,Integer> entry : batting_score.entrySet()){
            System.out.println(entry.getKey() + " has scored "+ entry.getValue() + " runs.");
        }

    }

}

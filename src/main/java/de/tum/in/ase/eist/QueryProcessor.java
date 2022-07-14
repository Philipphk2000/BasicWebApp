package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("plus")) {

            String[] string= query.split(" ");

            int number = Integer.parseInt(string[3]) + Integer.parseInt(string[5]);

           return number + "";
        }
        else if (query.contains("largest")) {


            String substring = query.split(":")[1];

            String[] string= substring.split(",");

            int number = 0;

            for (int i = 0; i < string.length; i++) {

                if (Integer.parseInt(string[i]) > number) {
                    number = Integer.parseInt(string[i]);
                }
            }

            return number + "";
        }




        else {
            return "";
        }
    }
}

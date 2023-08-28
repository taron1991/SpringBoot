package com.example.bootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class BootProjectApplication {


    /*  web:
    build: .
    container_name: web
    restart: always
    ports:
      - 8080:8080
    environment:
     url: jdbc:postgresql://database:5432/postgres
     username: postgres
     password: westside

    depends_on:
     - database

     spring:
 datasource:
  url: jdbc:postgresql://database:5432/postgres
  username: postgres
  password: westside
  driver-class-name: org.postgresql.Driver


 jpa:
  show-sql: true
  properties:
   hibernate:
    dialect: org.hibernate.dialect.PostgreSQL14Dialect

     */

    public static void main(String[] args) {
        SpringApplication.run(BootProjectApplication.class, args);



       /* System.out.println(minLength);
        System.out.println(word);*/


        /*Scanner scanner = new Scanner(System.in);
        String[] str = new String[3];

        int x = 0;
        while (x < 3) {
            str[x] = scanner.nextLine();
            x++;
        }

        for (int i = str.length-1; i >=0 ; i--) {
          //  System.out.println(str[i]);
        }*/



        String stroka = "terrrible";
        char[] chars = stroka.toCharArray();

        Map<Character,Integer> map = new LinkedHashMap<>();


        int counter=0;

        for (int i = 0; i <chars.length ; i++) {
            int counter1=0;
            for (int j = 0; j < chars.length; j++) {
                if(chars[i]==chars[j]){
                    counter1++;
                }
            }
            if(counter1>counter){
                counter=counter1;
            }
            map.put(chars[i],counter1);
        }


       // System.out.println(map.entrySet().stream().max((a,b)->a.getValue()-b.getValue()).get());


        String der = "Korova";

        char c = der.charAt(der.length() - 1);
        String substring = der.substring(0,5);
        String s2 = String.valueOf(c).toUpperCase();
        String newWord = substring + s2;

       // System.out.println(newWord);



        char symbol='p';

        String word1 = "airport";
        String i = word1.replace('i', symbol);
        //System.out.println(i);



        char symbolExists = 'd';

        String ser = "yellow";

        char[] chars1 = ser.toCharArray();
        for (int q = 0; q <chars1.length ; q++) {
            if(chars1[q]==symbolExists){
                System.out.println("exists");
                break;
            }
            if(q==chars1.length-1){
                System.out.println("not exists");
            }
        }

    }

}

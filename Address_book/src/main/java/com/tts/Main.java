package com.tts;

import java.util.*;

public class Main<Int> {


    public static void main(String[] args) {

        Entry entry = new Entry();
        Scanner sc = new Scanner(System.in);
        System.out.println("1) Add an entry\n" +
                "2) Remove an entry\n" +
                "3) Search for a specific entry\n" +
                "4) Print Address Book\n" +
                "5) Delete Book\n" +
                "6) Quit\n" +
                "Please choose what you'd like to do with the database:\n");
        int entryInput = sc.nextInt();

        do {


            if (entryInput == 1) {
                System.out.println("Please enter your first name: \n");
                entry.setfName (sc.nextLine());
                System.out.println("Please enter your last name: \n");
                entry.setlName (sc.nextLine());
                System.out.println("Please enter your email: \n");
                entry.setEmail (sc.nextLine());
                System.out.println("Please enter your phone number: \n");
                entry.setPhoneNum(sc.nextLine());
                System.exit(0);


            } else if (entryInput == 2) {


            } else if (entryInput == 3) {

            } else if (entryInput == 4) {

            } else if (entryInput == 5) {

            } else if (entryInput < 6 | entryInput > 6){
                System.out.println("Invalid entry!!");

            }
            return;

        }
        while (entryInput != 6);
        System.out.println("Good Bye!");
    }

    }


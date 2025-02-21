package com.CollectionsProject;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class PutRoomDetails {
    String Rname;
    int Rprice;

    public PutRoomDetails(String rname, int rprice) {
        Rname = rname;
        Rprice = rprice;
    }

    @Override
    public String toString() {
        return "PutRoomDetails [Rname=" + Rname + ", Rprice=" + Rprice + "]";
    }
}

public class RuntimeMap {
    Map<Integer, PutRoomDetails> rmd = new HashMap<>();

    public void addRoom(int roomId, PutRoomDetails prd) {
        rmd.put(roomId, prd);
    }

    public void displayRooms() {
        for (Map.Entry<Integer, PutRoomDetails> entry : rmd.entrySet()) {
            System.out.println("Room ID: " + entry.getKey() + ", Room Details: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        RuntimeMap obj = new RuntimeMap();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("Enter room id to display on menu:");
            int id = scan.nextInt();
            System.out.println("Enter the hotel name:");
            String name = scan.next();
            System.out.println("Enter the room price:");
            int price = scan.nextInt();

            obj.addRoom(id, new PutRoomDetails(name, price));

            System.out.println("Enter 1 to continue or 2 to exit:");
            int choice = scan.nextInt();
            if (choice == 2) {
                break;
            }
        }

        System.out.println("Rooms added to menu list:");
        obj.displayRooms();
    }
}

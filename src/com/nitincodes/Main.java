package com.nitincodes;
import java.util.*;
public class Main {

    public static void main(String[] args) {
	// java program to create an arraylist and add elements to it:
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        // creation of list:
    for(int i=0;i<3;i++){
        list.add(new ArrayList<>());
    }

    // Add elements:
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                list.get(i).add(sc.nextInt());
            }
        }
        System.out.println(list);
    }
}

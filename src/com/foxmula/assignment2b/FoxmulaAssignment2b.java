package com.foxmula.assignment2b;

import java.util.*;

public class FoxmulaAssignment2b {


    public static void main(String[] args) {
        // TODO code application logic here
        HashSet<Integer> hs= new HashSet<>();
        Scanner s=new Scanner(System.in);
        String temp;
        String[] str;
        System.out.println("Enter numbers to insert");

        temp=s.nextLine();
        str=temp.split(" ");
        for(int i=0;i<str.length;i++)
        {
            int tem=Integer.parseInt(str[i]);
            hs.add(tem);
        }
        System.out.println("ArrayList=  "+hs);
        System.out.println("Enter number to search");
        int num=s.nextInt();
        System.out.println(hs.contains(num)+"(contains "+num+")");


    }

}

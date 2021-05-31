package com.foxmula.assignment2e;
import java.util.*;

public class FoxmulaAssignment2e {

    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> al= new ArrayList<>();
        Scanner s=new Scanner(System.in);
        String temp;
        String[] str;
        System.out.println("Enter numbers to insert");

        temp=s.nextLine();
        str=temp.split(" ");
        for(int i=0;i<str.length;i++)
        {
            int tem=Integer.parseInt(str[i]);
            al.add(tem);
        }

        System.out.println("ArrayList=  "+al);
        HashSet<Integer> hs= new HashSet<>(al);
        for(Iterator hsI=hs.iterator();hsI.hasNext();)
        {
            int count=0;
            var num=hsI.next();

            for(Iterator alI=al.iterator();alI.hasNext();)
            {
                if(num.equals(alI.next()))
                {
                    count++;
                }

            }
            System.out.println("No of occurences of "+ num+" = "+count);
        }

    }


}
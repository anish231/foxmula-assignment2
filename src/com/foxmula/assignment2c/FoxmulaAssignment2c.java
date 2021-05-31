package com.foxmula.assignment2c;
import java.util.*;


public class FoxmulaAssignment2c {

    /**
     * @param args the command line arguments
     */
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

        System.out.println(hs);
        System.out.println("Traverssing the HashSet: ");
        for(Iterator i= hs.iterator();i.hasNext();)
        {
            System.out.print(i.next()+" ");
        }
    }

}

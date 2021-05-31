package com.foxmula.assignment2f;
import java.util.*;


public class FoxmulaAssignment2f {


    public static void main(String[] args) {

        int k;
        Scanner s1= new Scanner(System.in);

        ArrayList<Integer> al=new ArrayList<>();
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

        System.out.println("ArrayList= "+al);
        System.out.println("Enter the value of k: ");
        k=s1.nextInt();

        int flag=0;
        for(Iterator i1=al.iterator();i1.hasNext();)
        {

            Integer num=0;
            { num=(Integer)i1.next();}

            if((int)num<k)
            {
                int index=al.indexOf(num);
                al.set(index, 0);
                var searchNo=k-(int)num;
                for(Iterator i2=al.iterator();i2.hasNext();)
                {
                    if(i2.next().equals(searchNo))
                    {
                        System.out.println(num+" "+searchNo);
                        flag=1;
                    }


                }
            }

        }
        if(flag==0)
        {
            System.out.println("Numbers not found");
        }

    }

}
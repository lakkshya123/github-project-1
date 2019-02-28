
package collectionex3;

import java.util.ArrayList;
import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) 
    {
        ArrayList<String> fruits = new ArrayList<>();
        Scanner kb = new Scanner(System.in);
        System.out.println("enter fruits");
        for(int i=1;i<=6;i++)
        {String s = kb.next();
       fruits.add(s);
        }
        System.out.println("remove a fruit");
        String l = kb.next();
        fruits.remove(fruits.indexOf(l));
        System.out.println("remaining fruits are:" +fruits.size());
        for(String fruit : fruits)
        {
            System.out.println(fruit);
        }
        {
            System.out.println("absent fruit is "+l);
        }
        }
    }
   

package Demo;

import java.util.ArrayList;
import java.util.BitSet;

public class Demo7 {


    public static void main(String args[])

    {

        ArrayList obj1 = new ArrayList();

        ArrayList obj2 = new ArrayList();

        obj1.add("A");

        obj1.add("B");

        obj2.add("A");

        obj2.add(1, "B");

        System.out.println(obj1.equals(obj2));

    }
   /* public static void main(String args[])

    {

        BitSet obj = new BitSet(5);

        for (int i = 0; i < 5; ++i)
            obj.set(i);

        System.out.print(obj.get(3));

    }*/
    /*public static void main(String args[])   {

        BitSet obj = new BitSet(5);

        for (int i = 0; i < 5; ++i)

            obj.set(i);

        obj.clear(2);

        System.out.print(obj.length() + " " + obj.size());

    }*/
    /*public static void main(String args[])

    {

        String str = "false ";

        boolean x = Boolean.valueOf(str);

        System.out.print(x);

    }*/
    /*public static void main(String args[]) {
        Double y = new Double(257.57812);
        Double i = new Double(257.578123456789);
        try {
            int x = i.compareTo(y);
            System.out.print(x);
        }
        catch (ClassCastException e) {
            System.out.print("Exception");
        }
    }*/
    /*public static void main(String args[])

    {

        byte a[] = { 65, 66, 67, 68, 69, 70 };

        byte b[] = { 71, 72, 73, 74, 75, 76 };

        System.arraycopy(a , 0, b, 0, a.length);

        System.out.print(new String(a) + " " + new String(b));

    }*/
}

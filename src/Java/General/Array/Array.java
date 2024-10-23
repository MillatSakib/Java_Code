package Java.General.Array;
import java.util.Vector;

public class Array{
    public static void main(String[] args){
        //Declaring Array and Define size
        int[] Arr = new int[5]; //This is one Dimentional Array.
        Arr[0] = 0;
        System.out.println(Arr[0]);

        int [][] MulArray = new int [2][3];
        MulArray[0][0] = 0;
        MulArray[0][1] = 1;
        MulArray[0][2] = 2;
        MulArray[1][0] = 3;
        MulArray[1][1] = 4;
        MulArray[1][2] = 5;

        for(int x : Arr){   //Usage of for each loop
            System.out.println(x);
        }


        //Here all code of verctor 

        Vector<Integer> V = new Vector<>(3);

        V.add(10);
        V.add(20);
        V.add(30);
        System.out.println(V);

        /**
         * v.add(0) = Adds Object o to Vector v(Here object means any value)
         * v.add(i, o) = Inserts Object to at index i, shifting element up as necessary
         * v.clear() = removes all elements from Vector v
         * v.contains(0) = Returns true if Vector v contains Object o
         * v.firstElement(i) = Returns the first element.
         * v.get(i) = Returns the last element
         * v.lastElelment(i) = Returns the last element
         * v.listIterator() = Returns a ListIterator that can be used to go over the Vector. this is useful alternatinve to the for loop
         * v.remove(i) = Reemoves the element at position i, and shifts all following elemnts down.
         * v.set(i, o) = Sets the element at index i to o.
         * v.size() = Returns the number of elemets in Vector v.
         * v.toArray(Object[]) = The array parament can be  any Object subclass (eg. String). This returns the vector values in that array (or a larger array if necessary). this is useful when you need the generality of a vecttor for input, but need the speed of arrays when processing the data.
         */
    }
}
package edu.miu.cs.cs425.lab11;


import edu.miu.cs.cs425.lab11.question1_utils.ArrayFlattener;
import edu.miu.cs.cs425.lab11.question2_utils.ArrayReverser;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
        ArrayFlattener arrayFlattener=new ArrayFlattener();
        ArrayReverser arrayReversor=new ArrayReverser();
        int[][] a = {{1, 2, 3}, {4, 5, 6, 7}};
        int[] b=arrayFlattener.flattenedArray(a);

        int[] reversed=arrayReversor.reverseArraySample(b);
        Integer[] expected={1,2,3,4,5,6,7};

            System.out.print(Arrays.toString(reversed));
    }
}

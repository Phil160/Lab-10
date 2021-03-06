package edu.miu.cs.cs425.lab10.quest2_utils;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import edu.miu.cs.cs425.lab10.quest2_utils.ArrayReverser;
import edu.miu.cs.cs425.lab10.quest2_utils.IArrayFlattenerService;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class ArrayReverserNullTest {
    private ArrayReverser arrayReversor;
    private IArrayFlattenerService arrayFlattenerService= mock(IArrayFlattenerService.class);


    @Before
    public void setUp() throws Exception{
        this.arrayReversor=new ArrayReverser(arrayFlattenerService);
    }

    @After
    public void tearDown() throws Exception{
        this.arrayReversor=null;
    }

    @Test
    public void testNullFlattenedArray(){
        int[][] input = null;
        when(arrayFlattenerService.flattenArray(input)).thenReturn(null);
        int[] expected=null;
        int[] actual=this.arrayReversor.reverseArray(input);
        assertArrayEquals(expected,actual);
        verify(arrayFlattenerService).flattenArray(input);
    }
}

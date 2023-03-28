package org.example.arrays;
import org.example.ArraysToTest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class ArrayUtilTest {
    ArrayUtil ar  = new ArrayUtil();

    @Test
    public void zeroOne(){
        int a = 101101;
        int b = 45;
        assertTrue(b==ar.zeroOne(a));

    }
    @Test
    public void zerOut(){
        int arr[] = {1,0,2,4,6,7,8,7};
        int [] array = {1,2,4,6,7,8,7};

        assertArrayEquals(array ,ar.zerOut(arr));


    }
    @Test
    public void divideArr(){
      int arr[] = {4,6,8,12,1,5,71};
      int vis = 0;
      assertFalse(vis == ar.divideArr(arr));
    }
    @Test
    public void noF3(){
        int arrays[] = {45,78,54,4,68,73};
        int arr[] = {100,99,45,4,3,1};
        int arr1[] = {78,73,68,54,45,4};



        assertFalse(arr == ar.noF3(arrays));
        assertArrayEquals(arr1,ar.noF3(arrays));
    }

}

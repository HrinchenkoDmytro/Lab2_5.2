package epam.com;

import java.util.Arrays;

/**
 * Created by m18 on 22.02.2016.
 */

public class MyInitTast {

    private int[] arr = new int[10];

    {

        for (int i = 0; i<arr.length; i++)
            arr[i]=(int)(100*Math.random());
    }

    public  void printArray(){
        System.out.println(Arrays.toString(arr));
    }



}


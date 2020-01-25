package com.day3;


public class day3discussion {
    public static void main(String[] args) {

  /*      int a[];
        int []b;
        int c[] = new int[5];
        c[0] = 10;
        c[1] = 20;
        c[2] = 30;


        a = new int[2];
        a[0] = 100;
        a[1] = 200;

        int d[] = new int[]{1,2,3,4,5,6,7,8,9,10};
        System.out.println(d.length);
        for(int i = 0; i < d.length; i++){
            System.out.println(d[i]);
        }

        int[] x1,y1; // Both are array
        int x2,y2[]; // 1 integer 2 array
        int x3[], y3; //1 - array, 2 integer
        int[] x4, y4[]; // x4 - 1D array and y4 is 2D array

        y4 = new int[3][3];

        System.out.println("Using Compact for(:)");
        for (int p:d)
        {
            System.out.println(p);
        }
*/
        String a[] = {"hello"};
        String b = "Hi";
        day3discussion calculation = new day3discussion();
        //calculation.stringArrayHandling(a);
        calculation.stringArrayHandling(a);

    }
    // Create an array of n integer element and find the sum, average, min and max

    public void arrayCalculation(int[] arr) {

        int i = 0;
        int max = arr[i];
        int min = arr[i];
        float avg = 0;
        int sum = 0;

        int index = 0;
        for (i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            } else {
                min = arr[i];
            }
            sum = sum + arr[i];
            avg = sum / arr.length;
        }
        System.out.println("MAX = " + max);
        System.out.println("MIN = " + min);
        System.out.println("SUM = " + sum);
        System.out.println("AVG = " + avg);

    }

    public void reverseArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }

    public void stringArrayHandling(String[] str) {
        str = new String[10];
        str[0] = "Canada";
        str[1] = "India";
        str[2] = "Nepal";
        str[3] = "Toronto";
        str[4] = "New York";
        str[5] = "PATEL";
        str[6] = "Ramandeep Singh";
        str[7] = "Inshant";
        str[8] = "Scarborough";
        str[9] = "North York";

       /* for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        } */

        day3discussion obj2 = new day3discussion();

        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " <--> ");
   //         obj2.reverseString(str[i]);
            obj2.weirdReverse(str[i]);
        }

    }

    public void reverseString(String rev) {
        String result = "";
        for (int i = rev.length() - 1; i >= 0; i--) {
            result = result + rev.charAt(i);
        }
        System.out.print(result + " <--> ");
    }

    public void weirdReverse(String weird) {
        String result2 = "";
        String result3 = "";

            for(int i= 0 ; i < weird.length() ; i+=4){
                if (weird.length() % 2 == 0 && i % 2 != 0) {
                    result2 = result2 + weird.charAt(i) + weird.charAt(i+1);
                    result3 = reverseString(result2);
                }
            }
            System.out.println(result3));
    }
}






import java.lang.String;
import java.lang.System;

class ArrayNames {
    public static void main(String[] args) {
        // declares an array of integers
        String[] NameArray1;
        String[] NameArray2;

        // allocates memory for 10 integers
        NameArray1 = new String[5];
        NameArray2 = new String[10];

        NameArray1[0] = "Hellzel";
        NameArray1[1] =  "Ahmiracle";
        NameArray1[2] = "Baby Girl";
        NameArray1[3] = "Elizabreth";
        NameArray1[4] = "Kaizyle";

        System.arraycopy(NameArray1,0,NameArray2, 0,5);
        System.arraycopy(NameArray1,0,NameArray2, 5,5);
        System.out.println("NameArray2: "+ NameArray2[0]);
        System.out.println("NameArray2: "+ NameArray2[1]);
        System.out.println("NameArray2: "+ NameArray2[2]);
        System.out.println("NameArray2: "+ NameArray2[3]);
        System.out.println("NameArray2: "+ NameArray2[4]);
        System.out.println("NameArray2: "+ NameArray2[5]);
        System.out.println("NameArray2: "+ NameArray2[6]);
        System.out.println("NameArray2: "+ NameArray2[7]);
        System.out.println("NameArray2: "+ NameArray2[8]);
        System.out.println("NameArray2: "+ NameArray2[9]);
    }
} 
package exercises.Chapter7;

import java.util.Arrays;
import java.util.Scanner;

public class exercise7_32 {
    /** Partition of a list */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter list: ");
        int length = input.nextInt();
        int[] list = new int[length];
        for (int i = 0; i < length; i++) {
            list[i] = input.nextInt();
        }
        int index = partition(list);
        System.out.println("After the partition, the list is " + Arrays.toString(list));
        System.out.println(index);
    }

    public static int partition(int[] list) {
        int partition = list[0];
        int partitionLocation = 0;
        int hi = list.length-1;

        while(partitionLocation < hi) {

            if(partition>list[partitionLocation+1]) {
                //swap partition and the next item
                list[partitionLocation] = list[partitionLocation+1];
                list[partitionLocation+1] = partition;
                partitionLocation++;
            } else {
                //move the item to the end of the list
                int temp = list[hi];
                list[hi]=list[partitionLocation+1];
                list[partitionLocation+1] = temp;
                hi--;

            }
        }
        return partitionLocation;
    }
}
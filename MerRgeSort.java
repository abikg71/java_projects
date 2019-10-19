/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package akenoreexpandsortingalgo;

/**
 *
 * @author Abinet
 */
public class MerRgeSort
{
    private final int[] list;

    public MerRgeSort(int[] list)
    {
        this.list = list;
        mergeSort(list);
    }

    public void mergeSort(int [] list)
    {
        if(list.length-1 > 1)     // base case
        {
            // merge sort the first half
            int[] firstHalf = new int [list.length/2];
            System.arraycopy(list,0, firstHalf, 0, list.length/2);
            mergeSort(firstHalf);
            // merge sort the second half
            int secondHalfLength = list.length-list.length/2;
            int []secondHalf = new int [list.length/2];
            System.arraycopy(list,list.length/2,secondHalf,0,secondHalfLength);
            mergeSort(secondHalf);
            // merge second half with the first half
            int[] temp = merge(firstHalf, secondHalf);
            System.arraycopy(temp, 0, list, 0,temp.length);
        }
    }
    // merge the two sorted list
    private int[] merge(int[] list1, int[] list2)
    {
        int [] temp = new int[list1.length + list2.length];
                int crt1= 0;  // current index in list1
                int crt2= 0;   // current index in list2
                int crt3= 0;  // current index in temp
                while(crt1 < list1.length && crt2 <list2.length)
                {
                    if(list1[crt1] < list2[crt2])
                        temp[crt3++] = list1[crt1++];
                    else
                        temp[crt3++] = list1[crt2++];
                }
                while(crt1 < list1.length)
                    temp[crt3++] = list1[crt1++];
                while(crt2 < list2.length)
                    temp[crt3++] = list2[crt2++];
                return temp;
    }
    public int[] getSortedList()
    {
        return list;
    }
}

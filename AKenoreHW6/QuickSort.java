package akenorehw6;

/**
 *
 * @author Abinet
 */

public class QuickSort
{
    private final int[] list;
    public QuickSort(int[] list)
    {
        this.list = list;
        quickSort(list,0, list.length-1);
    }

private void quickSort(int[] list, int start, int end)
    {
        if(end > start)
        {
            int pivotIndex = partition(list, start, end);
            quickSort(list, start, pivotIndex-1); // Sort smaller
            quickSort(list, pivotIndex+1, end); // Sort larger     
        }
    }
    // Partition the Array list[start, ... end]
private int partition(int[] list, int start, int end)
{
    int pivot = list[(start)]; //choose the start element as a pivot
    int indexFromLeft = start+1; // index for forward search
    int indexFromRight = end; // index for backward search
    while(indexFromRight > indexFromLeft)
    {
            // search forward from left
        while(indexFromLeft <= indexFromRight && list[indexFromLeft] <= pivot)
                indexFromLeft++;
            // search backward from right
          while(indexFromLeft <= indexFromRight && list[indexFromRight] > pivot)
                indexFromRight--;
            // Swap two elements in the list
            if(indexFromRight > indexFromLeft)
            {
                int temp =list[indexFromRight];
                list[indexFromRight] = list[indexFromLeft];
                list[indexFromLeft] = temp;
            }
        }
        while(indexFromRight > start && list[indexFromRight] >= pivot)
            indexFromRight--;
        // Swap pivot with list[indexFromRight]
        if(pivot > list[indexFromRight])
        {
            list[start] = list[indexFromRight];
            list[indexFromRight] = pivot;
            return indexFromRight;
        } 
        else
        {
            return start;
        }
    }
    public int[] getSortedList(){
        return list;
    }
}

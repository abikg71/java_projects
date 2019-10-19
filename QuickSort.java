package akenoreexpandsortingalgo;

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
        quickSort(list, 0, list.length -1);
    }
    private void quickSort(int[] list, int first, int last)
    {
        if(last > first)
        {
            int pivotIndex = partition(list, first, last);
            quickSort(list, first, pivotIndex-1); // Sort smaller
            quickSort(list, pivotIndex + 1, last); // Sort larger
        }
    }
    // Partition the Array list[first, ... last]
    private int partition(int[] list, int first, int last)
    {
        int pivot = list[(first + last)/2]; //choose the first element as a pivot
        int indexFromLeft = first+1; // index for forward search
        int indexFromRight = last; // index for backward search
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
        while(indexFromRight > first && list[indexFromRight] >= pivot)
            indexFromRight--;
        // Swap pivot with list[indexFromRight]
        if(pivot > list[indexFromRight])
        {
            list[first] = list[indexFromRight];
            list[indexFromRight] = pivot;
            return indexFromRight;
        }
        else
        {
            return first;
        }
    }
    public int[] getSortedList(){
        return list;
    }
}// End of class

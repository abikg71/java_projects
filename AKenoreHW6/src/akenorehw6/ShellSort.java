package akenorehw6;

/**
 *
 * @author Abinet
 */

public class ShellSort
{
    private final int[] list;
    public ShellSort(int [] list) 
    {
        this.list = list;
        sort(list);  
    }
    
    public  void sort(int[] list)
    {
        int start, end,temp;
        int interval = 1;
        while (interval <= list.length / 3) 
        // The gap may differ depending on the data you process
        {
            interval = interval * 3 + 1;
         }
        while (interval > 0)
        {
            for (end = interval; end < list.length; end++)
            {
                temp = list[end];
                 start = end;
                 while (start > interval - 1 && list[start - interval] >= temp)
                 {
                     list[start] = list[start - interval];
                     start -= interval;
                 }
                 list[start] = temp;
            }
            interval = (interval - 1) / 3;
         }
    }
    public int[] getShellSort()
    {
        return list ;
    }

}
 
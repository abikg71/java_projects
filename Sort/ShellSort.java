package akenoreexpandsortingalgo;

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
        int inner, outer,temp;
        int interval = 1;
        while (interval <= list.length / 3)
        {
            interval = interval * 3 + 1;
         }
        while (interval > 0)
        {
            for (outer = interval; outer < list.length; outer++)
            {
                temp = list[outer];
                 inner = outer;
                 while (inner > interval - 1 && list[inner - interval] >= temp)
                 {
                     list[inner] = list[inner - interval];
                     inner -= interval;
                 }
                 list[inner] = temp;
            }
            interval = (interval - 1) / 3;
         }
    }
    public int[] getShellSort()
    {
        return list ;
    }

} // End of class

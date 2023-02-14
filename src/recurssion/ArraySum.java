package recurssion;

public class ArraySum {
    public int sumOfArray(Integer[] a, int index) {
        if(index == 0)
        {
            return a[0];
        }
        return sumOfArray(a, index - 1 ) + a[index];
    }
}

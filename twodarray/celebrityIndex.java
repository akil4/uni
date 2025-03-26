package uni.twodarray;

public class celebrityIndex
{
    public static int celebrity(int[][] mat)
    {
        int n = mat.length;
        int candidate = 0;
        for (int i = 1; i < n; i++)
        {
            if (mat[candidate][i] == 1)
            {
                candidate = i;
            }
        }
        for (int i = 0; i < n; i++)
        {
            if (i != candidate)
            {
                if (mat[candidate][i] == 1 || mat[i][candidate] == 0)
                {
                    return -1;
                }
            }
        }

        return candidate;
    }

    public static void main(String[] args) {
        int[][] a = {
            {0, 1, 0}, 
            {0, 0, 1}, 
            {0, 1, 0}
        };
        System.out.println(celebrity(a));
    }
}

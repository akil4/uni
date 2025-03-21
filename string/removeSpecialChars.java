public class removeSpecialChars
{
    public static String removeChars(String s)
    {
        var arr = s.toCharArray();
        var l = 0;
        for (var r = 0; r < arr.length; r++)
        {
            if (arr[r] == '*')
            {
                l--;
            }
            else
            {
                arr[l] = arr[r];
                l++;
            }
        }

        return new String(arr, 0, l);
    }

    public static void main(String[] args)
    {
        System.out.println(removeChars("hello*"));
    }
}

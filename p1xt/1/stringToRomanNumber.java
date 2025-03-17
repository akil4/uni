public class stringToRomanNumber
{
    public static int toRoman(String s)
    {
        String Roman = "IVXLCDM";
        int[] value = {1,5,10,50,100,500,1000};
        int N = s.length();
        int result = 0;
        for (int i = 0; i < N; i++)
        {
            int val = value[Roman.indexOf(s.charAt(i))];
            if (i < N - 1 && val < value[Roman.indexOf(s.charAt(i + 1))])
            {
                result -= val;
            }
            else
            {
                result += val;
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        String s = "M";
        System.out.println(toRoman(s));
    }    
}

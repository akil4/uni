class largestodd
{
    public static String maxOdd(String s)
    {
        int n=s.length();
        for(int i=n-1;i>=0;i--)
        {
            char ch=s.charAt(i);
            if((ch-'0')%2!=0)
            {
                return s.substring(0,i+1);
            }
        }
          return "";
    }
    public static void main(String[]args)
    {
        String s1="9274";
        System.out.println(maxOdd(s1));
    }
}
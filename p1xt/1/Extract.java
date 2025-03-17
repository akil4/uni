class Extract
{
    public static long extractNumber(String s)
    { 
        String[] words= s.split(" ");
        long maxNum=-1;
        for(String i: words)
        {
            if(i.matches("\\d+"))
            {
                if(!i.contains("9"))
                {
                    long num=Long.parseLong(i);
                    maxNum=Math.max(maxNum,num);
                }
            }
        }
        return maxNum;
}
public static void main(String[]args)
{
    String s1="welcome 139 brd 128";
    System.out.println(extractNumber(s1));

}
}

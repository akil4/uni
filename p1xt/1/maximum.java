class maximum
{
    public static int maxChar(String s)
    {
        int maxdist=-1;
        int[] findex=new int[256];
        boolean [] b=new boolean[256];
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(!b[ch])
            {
                b[ch]=true;
                findex[ch]=i;
            }
            else{
                maxdist=Math.max(maxdist,i-findex[ch]-1);
            }
        }
        return maxdist;
     
    }
    public static void main(String[]args)
    {
        String s1="abcdefaghia";
        System.out.println(maxChar(s1));
    }
}
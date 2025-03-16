public class springSeason
{
    public static void main(String[] args)
    {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        System.out.println("Spring Season: " + isSpringSeason(m, d));
    }    
    
    public static boolean isSpringSeason(int m, int d)
    {
        return m == 3 && (d >= 20 && d <= 31) || m == 4 && (d >= 1 && d <= 30) || m == 5 && (d >= 1 && d <= 31) || m == 6 && (d >= 1 && d <= 20);
    }
}

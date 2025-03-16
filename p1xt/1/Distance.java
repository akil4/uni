public class Distance
{
    public static void main(String[] args)
    {
        int x = Integer.parseInt(args[0]);
        int y = Integer.parseInt(args[1]);
        System.out.println("Distance = " + calculateDistance(x, y));
    }
    
    public static double calculateDistance(int x, int y)
    {
        return Math.sqrt((x * x) + (y * y));
    }
}
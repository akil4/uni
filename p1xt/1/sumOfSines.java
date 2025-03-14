public class sumOfSines
{
    public static double sum(double t)
    {
        t = Math.toRadians(t);
        return Math.sin(2 * t) + Math.sin(3 * t);
    }
    public static void main(String[] args)
    {
        double t = Double.parseDouble(args[0]);
        System.out.println("Sum of sines = " + sum(t));
    }    
}

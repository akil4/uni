import java.util.*;

public class kLengthSubstringWithNoRepeatingCharacters
{
    public static List<String> findKLengthSubstring(String s, int k)
    {
        List<String> l = new ArrayList<>();
        if (s.length() < k)
            return l;
        
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        for (int i = 0; i < s.length(); i++)
        {
            while (set.contains(s.charAt(i)))
            {
                set.remove(s.charAt(left));
                left++;
            }

            set.add(s.charAt(i));
            if (i - left == k)
            {
                String sub = s.substring(left, i + 1);
                if(!l.contains(sub))
                {
                    l.add(sub);
                }
                set.remove(s.charAt(left));
                left++;
            }
        }
        return l;
    }

    public static void main(String[] args)
    {
        System.out.println(findKLengthSubstring("abcabcbb", 2));
    }
}

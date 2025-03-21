import java.util.HashSet;
public class longestSubstringWithNoRepeatingCharacters
{
    public static int lengthOfLongestSubstring(String s)
    {
        int n = s.length(), l = 0, maxLength = 0;
        HashSet<Character> set = new HashSet<>();

        for (int r = 0; r < n; r++)
        {
            while (set.contains(s.charAt(r)))
            {
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            maxLength = Math.max(maxLength, r - l + 1);
        }

        System.out.println(set);

        return maxLength;
    }

    public static void main(String[] args)
    {
        System.out.println(lengthOfLongestSubstring("abcabcbb"));
        System.out.println(lengthOfLongestSubstring("abcabde"));
        System.out.println(lengthOfLongestSubstring("abdcbcd"));
    }
}

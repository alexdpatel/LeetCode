import java.util.HashMap;

// O(n) Roman Numeral to int

// LeatCode Run Time 99 ms

public class Problem013 {
    public static void main(String[] args) {
        System.out.println(romanToInt("XI"));
    }

    public static int romanToInt(String s)
    {
        int length = s.length() - 1;

        HashMap<String, Integer> indexes = new HashMap<String, Integer>();
        indexes.put("M", 1000);
        indexes.put("D", 500);
        indexes.put("C", 100);
        indexes.put("L", 50);
        indexes.put("X", 10);
        indexes.put("V", 5);
        indexes.put("I", 1);

        int sum = 0;

        for(int i = 0; i < length; i++)
        {
            int currentIndex = indexes.get(s.substring(i, i + 1));
            int nextIndex = indexes.get(s.substring(i + 1, i + 2 ));

            if(currentIndex < nextIndex)
                sum -= currentIndex;
            else
                sum += currentIndex;
        }

        sum += indexes.get(s.substring(length));

        return sum;
    }
}

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
        intializeHashMap(indexes);

        int[] vals = new int[] {1000, 500, 100, 50, 10, 5, 1};
        int sum = 0;

        for(int i = 0; i < length; i++)
        {
            String currentIndex = s.substring(i, i + 1);
            String nextIndex = s.substring(i + 1, i + 2 );

            int temp = indexes.get(currentIndex);
            if(temp > indexes.get(nextIndex))
                sum -= vals[temp];
            else
                sum += vals[temp];
        }

        sum += vals[indexes.get(s.substring(length))];

        return sum;
    }

    public static void intializeHashMap(HashMap<String, Integer> map)
    {
        map.put("M", 0);
        map.put("D", 1);
        map.put("C", 2);
        map.put("L", 3);
        map.put("X", 4);
        map.put("V", 5);
        map.put("I", 6);
    }
}

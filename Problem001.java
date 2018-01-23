import java.util.HashMap;

public class Problem001 {
    // LeetCode Run Time 8ms
    // O(n)

    public static int[] twoSum(int[] arr, int target)
    {
        if (arr == null || arr.length <= 1)
            return null;

        HashMap<Integer, Integer> solutions = new HashMap<Integer, Integer>(); // key is num,  val is index

        for (int i = 0; i < arr.length; i++ )
        {
            if(solutions.containsKey(arr[i]))
                return new int[] {solutions.get(arr[i]), i};
            else
                solutions.put(target - arr[i], i);
        }

        return null;
    }
}

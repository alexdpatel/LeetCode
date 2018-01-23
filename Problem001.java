import java.util.HashMap;

public class Problem001 {
    public static void main(String[] args) {
        System.out.println(twoSum(new int[] {1, 2, 3, 4, 5, 6}, 5));
    }

    public static int[] twoSum(int[] arr, int target)
    {
        if(arr.length < 1)
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

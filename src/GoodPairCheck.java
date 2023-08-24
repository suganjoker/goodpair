import java.util.HashSet;

public class GoodPairCheck {
    public static void main(String[] args) {
        int[] A1 = {1, 2, 3, 4};
        int B1 = 7;
        System.out.println(hasGoodPair(A1, B1));

        int[] A2 = {1, 2, 4};
        int B2 = 4;
        System.out.println(hasGoodPair(A2, B2));

        int[] A3 = {1, 2, 2};
        int B3 = 4;
        System.out.println(hasGoodPair(A3, B3));
    }

    public static int hasGoodPair(int[] A, int B) {
        HashSet<Integer> seen = new HashSet<>();

        for (int num : A) {
            int complement = B - num;
            if (seen.contains(complement)) {
                return 1;
            }
            seen.add(num);
        }

        return 0;
    }
}

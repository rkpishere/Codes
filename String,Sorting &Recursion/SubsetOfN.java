import java.util.ArrayList;

public class SubsetOfN {
    public static void Printsubset(ArrayList<Integer> subset) {
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i) + " ");
        }
        System.out.println();
    }

    public static void findSub(int n, ArrayList<Integer> subset) {
        if (n == 0) {
            Printsubset(subset);
            return;
        }
        // add
        subset.add(n);
        findSub(n - 1, subset);
        // add nhi hoga
        subset.remove(subset.size() - 1);
        findSub(n - 1, subset);
    }

    public static void main(String[] args) {
        int n = 3;
        ArrayList<Integer> subset = new ArrayList<>();
        findSub(n, subset);
    }
}

package y2025;
import java.util.ArrayList;
import java.util.List;

public class d23 {
    public static  List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);

            for (int j = 1; j < i; j++) {
                row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
            }
            if (i > 0) {
                row.add(1);
            }
            triangle.add(row);
        }
        return triangle;
    }
    public static void main(String[] args) {
        int numRows = 5;
        List<List<Integer>> result = generate(numRows);

        for (List<Integer> row : result) {
            System.out.println(row);
        }
    }
}

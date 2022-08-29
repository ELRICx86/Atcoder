package beg243;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;


public class C {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int x[] = new int[n];
        int y[] = new int[n];
        for (int i=0; i<n; i++) {
            x[i] = scan.nextInt();
            y[i] = scan.nextInt();
        }
        String s = scan.next();
        Map<Integer, Integer> right_min = new HashMap<>(), left_max = new HashMap<>();
        for (int i=0; i<n; i++) {
            if (s.charAt(i) == 'R') {
                if (!right_min.containsKey(y[i])) {
                    right_min.put(y[i], x[i]);
                }
                else if (right_min.get(y[i]) > x[i]) {
                    right_min.put(y[i], x[i]);
                }
            }
            if (s.charAt(i) == 'L') {
                if (!left_max.containsKey(y[i])) {
                    left_max.put(y[i], x[i]);
                }
                else if (left_max.get(y[i]) < x[i]) {
                    left_max.put(y[i], x[i]);
                }
            }
        }
        for (int i=0; i<n; i++) {
            int val = y[i];
            if (!right_min.containsKey(val)  || !left_max.containsKey(val)) {
                continue;
            }
            else if (right_min.get(val) < left_max.get(val)) {
                System.out.print("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}

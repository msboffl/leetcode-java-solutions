package Solutions_301_to_400.Solution_386;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Brute Force
class Approach1 {
    public List<Integer> lexicalOrder(int n) {
        // Rough Code - Checking purpose
        List<String> ans2 = new ArrayList<>();
        ans2.add(1 + "");
        ans2.add(13 + "");
        ans2.add("24");
        ans2.add(0 + "");
        ans2.add("c");
        ans2.add("a");
//        System.out.println(ans2);
        Collections.sort(ans2);
//        System.out.println(ans2);

        /// ========== Main Code =========
        List<String> ans = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            ans.add(i + "");
        }

        Collections.sort(ans);
        System.out.println(ans);

        List<Integer> out = new ArrayList<>();

        for(int i = 0; i < ans.size(); i++) {
            out.add(Integer.valueOf(ans.get(i)));
        }
        return out;
    }
}

// Time Complexity ->
// Space Complexity ->
public class Solution_386_Lexicographical {
    public static void main(String[] args) {
        int n1 = 13;

        Approach1 approach1 = new Approach1();

        System.out.println(approach1.lexicalOrder(n1));


    }
}

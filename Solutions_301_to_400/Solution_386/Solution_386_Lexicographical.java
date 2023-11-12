package Solutions_301_to_400.Solution_386;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Brute Force
class Approach1 {
    public List<Integer> lexicalOrder(int n) {
        List<String> ans = new ArrayList<>();

        for(int i = 1; i <= n; i++){
            ans.add(i + "");
        }
        Collections.sort(ans);
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

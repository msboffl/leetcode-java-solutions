package Solutions_301_to_400.Solution_387;

// Brute Force
class Approach1 {
    public int firstUniqueChar(String s) {
        int n = s.length();
        for(int i = 0; i < n; i++) {
            boolean check = false;
            for(int j = 0; j < n; j++) {
                if((i != j) && (s.charAt(i) == s.charAt(j))) {
                    check = true;
                    break;
                }
            }
            if(check == false) {
                return i;
            }
        }
        return -1;
    }

}

public class Solution_387_FirstUnique {
    public static void main(String[] args) {
        String s1 = "loveleetcode";

        Approach1 approach1 = new Approach1();

        System.out.println(approach1.firstUniqueChar(s1));
    }
}

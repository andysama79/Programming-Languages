import java.util.ArrayList;
import java.util.List;

class Universal {
    public List<String> wordSubsets(String[] A, String[] B) {
        int[] bmax = count("");
        for (String b : B) {
            int[] bcount = count(b);
            for (int i = 0; i < 26; i++) {
                bmax[i] = Math.max(bmax[i], bcount[i]);
            }
        }

        List<String> ans = new ArrayList<>();
        search: for (String a: A) {
            int[] acount = count(a);
            for (int i = 0; i < 26; i++) {
                if (acount[i] < bmax[i]) {
                    continue search;
                }
            }
            ans.add(a);
        }
        return ans;
    }
    /* count function: returns an array of values corresponding to the number of 
    repetitions of each letter in the string */
    public int[] count (String s) {
        int[] ans = new int[26];
        for (char c: s.toCharArray()) {
            ans[c - 'a']++;
        }
        return ans;
    }

    public static void main(String[] args) {
        Universal u = new Universal();
        String[] A = {"amazon","apple","facebook","google","microsoft","tesla","twitter","uber"};
        String[] B = {"e","o","x","b","m","t","w","u"};
        System.out.println(u.wordSubsets(A, B));
    }
}
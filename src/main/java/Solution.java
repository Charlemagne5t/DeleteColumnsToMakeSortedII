import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int minDeletionSize(String[] strs) {
        int m = strs[0].length();

        List<Integer> validColumns = new ArrayList<>();//can be starting points
        for(int i = 0; i < m; i++){
            int j = 1;
            for(; j < strs.length; j++){
                if(strs[j].charAt(i) < strs[j - 1].charAt(i)){
                    j = 0;
                    break;
                }
            }
            if(j == strs.length){
                validColumns.add(i);
            }
        }
        if(validColumns.isEmpty()){
            return m;
        }
        int min = m;
        for(int i = 0; i < validColumns.size(); i++){
            if(validColumns.get(i) > min){
                break;
            }
            int cur = countDeletions(strs, validColumns.get(i), m);
            min = Math.min(min, validColumns.get(i) + cur );
        }

        return min;
    }
    private int countDeletions(String[] strs, int start, int m){
        int count = 0;
        for(int i = start; i < m - 1; i++){
            for(int j = 1; j < strs.length; j++){
                if(strs[j - 1].charAt(i) == strs[j].charAt(i)){
                    count++;
                    break;
                }
            }
        }

        return count;
    }
}

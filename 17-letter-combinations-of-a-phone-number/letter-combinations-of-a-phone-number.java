import java.util.ArrayList;
import java.util.List;

class Solution {
    private static final String[] KEYPAD = {
        "",     // 0
        "",     // 1
        "abc",  // 2
        "def",  // 3
        "ghi",  // 4
        "jkl",  // 5
        "mno",  // 6
        "pqrs", // 7
        "tuv",  // 8
        "wxyz"  // 9
    };

    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.isEmpty()) {
            return result;
        }
        
        result.add("");
        
        for (char digit : digits.toCharArray()) {
            String letters = KEYPAD[digit - '0'];
            List<String> newResult = new ArrayList<>();
            for (String combination : result) {
                for (char letter : letters.toCharArray()) {
                    newResult.add(combination + letter);
                }
            }
            result = newResult;
        }
        
        return result;
    }
}
class Solution {
    public String kthDistinct(String[] arr, int k) {
        List<String> distinctStrings = new ArrayList<>();
        
        for (int i = 0; i < arr.length; i++) {
            boolean isDistinct = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i].equals(arr[j])) {
                    isDistinct = false;
                    break;
                }
            }
            if (isDistinct) {
                distinctStrings.add(arr[i]);
            }
        }
        
        // Step 2: Return the kth distinct string if it exists
        if (k <= distinctStrings.size()) {
            return distinctStrings.get(k - 1);
        } else {
            return "";
        }
    }
}
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count = 0;
        for (List<String> item : items) {
            // Get the index based on the ruleKey
            int index = getIndex(ruleKey);
            // Check if the value at the index matches the ruleValue
            if (item.get(index).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }
    
    // Helper method to get the index based on the ruleKey
    private int getIndex(String ruleKey) {
        switch(ruleKey) {
            case "type":
                return 0;
            case "color":
                return 1;
            case "name":
                return 2;
            default:
                // Invalid ruleKey, return -1 or throw an exception based on requirements
                return -1;
        }
    }
}

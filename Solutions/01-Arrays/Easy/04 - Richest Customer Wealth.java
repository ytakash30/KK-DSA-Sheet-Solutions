#1st approach...

class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth=0;

        for(int i=0;i<accounts.length;i++){
            int Wealth=0;
            for(int j=0;j<accounts[i].length;j++){
               Wealth +=accounts[i][j];
            }
            maxWealth=Math.max(maxWealth,Wealth);
        }
        return maxWealth;
        
    }
}

#2nd approach
class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth=0;

       for(int[] customeraccount : accounts){
        int wealth=0;
        for(int sum : customeraccount){
            wealth += sum;
        }
        maxWealth=Math.max(maxWealth,wealth);
       }

       return maxWealth;
        
        
    }
}

#1st approach ->

class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        //find max no
        int n =candies.length;
        int max=0;
        for(int i=0;i<n;i++){
            if(max<candies[i]){
                max=candies[i];
            }
        }
       // Check if each child can have the greatest number of candies
        List<Boolean> result = new ArrayList<>();
        for(int i=0;i<n ;i++){
            if(candies[i]+extraCandies<max){
                result.add(false);
            }else{
                result.add(true);
            }
        }
        return result;
    }
}

#2nd way

class Solution {
    public List<Boolean> kidsWithCandies(final int[] candies, final int extraCandies) {
        int max = 0;

        for(int candy : candies)
            max = Math.max(max, candy);

        final List<Boolean> result = new ArrayList<>();

        for(int candy : candies)
            result.add(max <= candy + extraCandies);

        return result;
    }
}


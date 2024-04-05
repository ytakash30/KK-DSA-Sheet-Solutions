class Solution {
    public boolean checkIfPangram(String sentence) {
        HashMap<Character,Integer> hm=new HashMap<>();
        int n=sentence.length();
        for(int i=0;i<n;i++)
        {
            char ch=sentence.charAt(i);
                hm.put(ch,1);
        }

        System.out.println(hm);

        for(int i=0;i<26;i++)
        {
            char ch=(char)('a'+i);
            if(!(hm.containsKey(ch)))
                return false;
        }

        return true;
    }
}

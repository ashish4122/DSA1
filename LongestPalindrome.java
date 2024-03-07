class Solution {
    public int longestPalindrome(String s) {
        char st[]=s.toCharArray();
        int temp=0,n=0,max=0;
        HashMap<Character,Integer>hm= new HashMap<>();
        for(int i=0;i<st.length;i++)
        {
            if(hm.containsKey(st[i]))
            {
                temp=hm.get(st[i]);
                hm.put(st[i],temp+1);
            }
            else 
            hm.put(st[i],1);
        }
        for(int i=0;i<st.length;i++)
        {
            if(hm.containsKey(st[i]))
            {
            temp=hm.get(st[i]);
            if(temp%2==0)
             {max=max+temp;
             }
             else 
             {
             max=max+(temp-1);
             n=1;
             }
            }
             hm.remove(st[i]);

        }
        if(n==1)
        return max+1;
        else
        return max;
        
    }
}
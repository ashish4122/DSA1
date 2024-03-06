class Solution {
    public char findTheDifference(String s, String t) {
        char st[]= s.toCharArray();
        char[] tt=t.toCharArray();
        int temp=0;

        HashMap<Character,Integer>hm= new HashMap<>();
        for(int i=0;i<st.length;i++)
        {
            if(hm.containsKey(st[i]))
            {
                temp=hm.get(st[i]);
                hm.put(st[i],temp+1);
            }
            else 
            {
                hm.put(st[i],1);
            }
        }
        for(int i=0;i<tt.length;i++)
        {
            if(hm.containsKey(tt[i]))
            {
                temp=hm.get(tt[i]);
                if(temp>1)
                hm.put(tt[i],temp-1);
                else 
                hm.remove(tt[i]);
            }
            else if(!hm.containsKey(tt[i]))
            { return tt[i];

            }
        }
        return 'a';   //Returning any character because the program will not reach till here

        
}
};

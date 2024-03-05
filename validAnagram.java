class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch1 = new char[s.length()];
 
       
        for (int i = 0; i < s.length(); i++) {
            ch1[i] = s.charAt(i);
        }

        char[] ch2 = new char[t.length()];
 
       
        for (int i = 0; i < t.length(); i++) {
            ch2[i] = t.charAt(i);
        }
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if(s.length()!=t.length())
              return false;

        for(int i=0;i<t.length();i++)

        {
            

             if(ch1[i]!=ch2[i])
            return false;
        }
        return true;
    }
}
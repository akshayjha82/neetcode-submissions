class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        HashMap<Character,Integer> map=new HashMap<>();
        HashMap<Character,Integer> hap=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        for(int i=0;i<t.length();i++){
            if(hap.containsKey(t.charAt(i))){
                hap.put(t.charAt(i),hap.get(t.charAt(i))+1);
            }
            else{
                hap.put(t.charAt(i),1);
            }
        }
        
        return map.equals(hap);
    }
}

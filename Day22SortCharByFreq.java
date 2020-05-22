class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        Character[] a=new Character[s.length()];
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            a[i]=c;
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        Arrays.sort(a,(x,y)->{ 
        int r=hm.get(y).compareTo(hm.get(x));
        if(r!=0)
            return r;
            return x.compareTo(y);
        });
        StringBuilder b=new StringBuilder();
        for(char c:a){
            b.append(c);
        }
        return b.toString();
    }
}
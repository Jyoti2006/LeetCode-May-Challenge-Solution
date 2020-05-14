class TrieNode{
    boolean wordEnd;
    char c;
    TrieNode[] childrens;
    TrieNode(char c){
        this.c=c;
        this.childrens=new TrieNode[26];
    }
}

class Trie {

     TrieNode root;
    /** Initialize your data structure here. */
    public Trie() {
            root= new TrieNode('\0');
    }
    
    /** Inserts a word into the trie. */
    public void insert(String word) {
        TrieNode ptr=root;
        for(int i=0;i<word.length();i++){
            int index=word.charAt(i)-'a';
            TrieNode temp=ptr.childrens[index];
            if(temp==null){
                temp=new TrieNode(word.charAt(i));
                ptr.childrens[index]=temp;
            }
            ptr=temp;
        }
        ptr.wordEnd=true;
    }
    
    /** Returns if the word is in the trie. */
    public boolean search(String word) {
        TrieNode ptr=root;
        for(int i=0;i<word.length();i++){
            int index=word.charAt(i)-'a';
            if(ptr.childrens[index]==null)
                return false;
            ptr=ptr.childrens[index];
        }
        return ptr.wordEnd;
    }
    
    /** Returns if there is any word in the trie that starts with the given prefix. */
    public boolean startsWith(String prefix) {
        TrieNode ptr=root;
        for(int i=0;i<prefix.length();i++){
            int index=prefix.charAt(i)-'a';
            if(ptr.childrens[index]==null)
                return false;
            ptr=ptr.childrens[index];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */
package Trie;

public class PS01 {
    public static void main(String[] args) {
        String words[] = {"a", "banana", "app", "apple", "appl", "app", "apply"};
        for(int i = 0; i<words.length; i++){
           insert(words[i]);
        }
        longestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }

    static class Node{
        Node[] children;
        boolean endOfWord;

        public Node(){
            children = new Node[26];
            for(int i = 0; i < 26; i++){
                children[i] = null;
            }
            endOfWord = false;
        }
    }
    
    static Node root = new Node();

    public static void insert(String word){
        Node curr = root;
        for(int i = 0; i < word.length(); i++){
            int idx = word.charAt(i) - 'a';
            if(curr.children[idx] == null){
                curr.children[idx] = new Node();
            }
            if(i == word.length() - 1){
                curr.children[idx].endOfWord = true;
            }
            curr = curr.children[idx];
        }
    }

    public static boolean search(String key){
        Node curr = root;
        for(int i = 0; i < key.length(); i++){
            int idx = key.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            if(i == key.length()-1 && curr.children[idx].endOfWord == false){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }

    public static boolean wordBreak(String key){
        if(key.length() == 0){
            return true;
        }
        for(int i = 1; i<=key.length(); i++){
            String firstPart = key.substring(0, i);
            String secPart  = key.substring(i);
            if(search(firstPart) && wordBreak(secPart)){
                return true;
            }
        }
        return false;
    }
    public boolean startsWith(String prefix) {
        Node curr = root;
        for(int i = 0; i<prefix.length(); i++){
            int idx = prefix.charAt(i) - 'a';
            if(curr.children[idx] == null){
                return false;
            }
            curr = curr.children[idx];
        }
        return true;
    }
    public static int countNode(Node root){
        if(root == null){
            return 0;
        }
        int count = 0;
        for(int i = 0; i<26; i++){
            if(root.children[i] != null){
                count += countNode(root.children[i]);
            }
        }
        return count +1;
    }
    public static String ans = "";
    public static void longestWord(Node root, StringBuilder temp){
        if(root == null){
            return;
        }
        for(int i = 0; i<26; i++){
            if(root.children[i] != null && root.children[i].endOfWord == true){
                temp.append((char) (i+'a'));
                if(temp.length() > ans.length()){
                    ans = temp.toString();
                }
                longestWord(root.children[i], temp);
                temp.deleteCharAt(temp.length() - 1);
            }
        }
    }
}




// class Solution {
//     class Node {
//         Node[] children;
//         boolean endOfWord;

//         public Node() {
//             children = new Node[26];
//             for (int i = 0; i < children.length; i++) {
//                 children[i] = null;
//             }
//             endOfWord = false;
//         }
//     }

//     Node root = new Node();

//     public void insert(String word) {
//         Node curr = root;
//         for (int i = 0; i < word.length(); i++) {
//             int idx = word.charAt(i) - 'a';

//             if (curr.children[idx] == null) {
//                 // add new node
//                 curr.children[idx] = new Node();
//             }

//             if (i == word.length() - 1) {
//                 curr.children[idx].endOfWord = true;
//             }

//             curr = curr.children[idx];
//         }
//     }

//     public boolean search(String key) {
//         Node curr = root;
//         for (int i = 0; i < key.length(); i++) {
//             int idx = key.charAt(i) - 'a';

//             if (curr.children[idx] == null) {
//                 return false;
//             }

//             if (i == key.length() - 1 && curr.children[idx].endOfWord == false) {
//                 return false;
//             }

//             curr = curr.children[idx];
//         }

//         return true;
//     }

//     public boolean wordBreakHelper(String key) {
//         if (key.length() == 0) {
//             return true;
//         }

//         for (int i = 1; i <= key.length(); i++) {
//             String firstPart = key.substring(0, i);
//             String secPart = key.substring(i);

//             if (search(firstPart) && wordBreakHelper(secPart)) {
//                 return true;
//             }
//         }

//         return false;
//     }

//     public boolean wordBreak(String s, List<String> wordDict) {
//         for (int i = 0; i < wordDict.size(); i++) {
//             insert(wordDict.get(i));
//         }

//         return wordBreakHelper(s);
//     }
// }
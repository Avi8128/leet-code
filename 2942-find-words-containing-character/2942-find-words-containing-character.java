class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        int n = words.length;
        List<Integer> res = new ArrayList<>();

        for(int i = 0; i < n; i++){
            for(int j = 0; j < words[i].length(); j++){
                char ch = words[i].charAt(j);
                if(ch == x){
                    res.add(i);
                    break;
                }
            }
        }

        return res;
    }
}
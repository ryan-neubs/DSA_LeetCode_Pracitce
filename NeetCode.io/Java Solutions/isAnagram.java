public class isAnagram {

        public boolean isAnagram(String s, String t) {
            s = s.toLowerCase();
            t = t.toLowerCase();

            if(s.length() != t.length()){
                return false;
            }


            int[] count = new int[26];
            for(int i = 0; i < s.length(); i++){
                count[t.charAt(i) - 'a']++;
                count[s.charAt(i) - 'a']--;
            }

            for(int val : count){
                if(val != 0){
                    return false;
                }
            }
            return true;


        }
    }

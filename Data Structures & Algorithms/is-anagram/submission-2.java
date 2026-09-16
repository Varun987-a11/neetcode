class Solution {
    public boolean isAnagram(String s, String t) {
        // racecar
        // carrace

        // jar
        // jam

        // HashMap<Character, Integer> smap = new HashMap<>();
        // HashMap<Character, Integer> tmap = new HashMap<>();
        
        char [] sc = s.toCharArray();
        char [] tc = t.toCharArray();
        
        Arrays.sort(sc);
        Arrays.sort(tc);

        return Arrays.equals(sc,tc);



    }
}

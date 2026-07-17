class Solution {
    public String removeOccurrences(String s, String part) {
        while(s.contains(part)){
            // Search part inside
            int index = s.indexOf(part);
            // create a new string by merging left and right part of substribg inside strinf

            s = s.substring(0,index) + s.substring(index + part.length());
        }
        return s;
    }
}
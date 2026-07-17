class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int count = 1;

        // k is the index where we write the compressed result
        int k = 0;
        for (int i = 0; i < n; i++) {
            // If the next character is the same, increase the count
            if (i < n - 1 && chars[i] == chars[i + 1]) {
                count++;
            }
            // Current group of same characters has ended
            else {
                // Store the current character in the compressed array
                chars[k++] = chars[i];
                // If the character appeared more than once
                if (count > 1) {

                    // Convert count to string
                    // Example: 12 -> "12"
                    // Convert string to char array -> {'1','2'}
                    // Store each digit separately
                    for (char c : String.valueOf(count).toCharArray()) {
                        chars[k++] = c;
                    }
                }

                // Reset count for the next character
                count = 1;
            }
        }
        return k;
    }
}
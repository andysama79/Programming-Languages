class Palindrome { // leetcode actual solution
    public:
    bool isPalindrome(int x) {
        // Special cases:
        // when c < 0, x is not a palindrome.
        // Also if the last digit of the number is 0, in order to be a palindrome, the first digit of the nubmer also needs to be 0.
        // Only 0 satisfy this poerperty.

        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int revertedNumber = 0;
        while (x > revertedNumber) {
            revertedNumber = revertedNumber * 10 + x % 10;
            x /= 10;
        }

        // when the length is an odd number, we can get rid of the middle digit by revertedNumber/10
        // for example when the input is 12321, at last we get x = 12 and revertedNumber = 123
        // since the middle digit doesn't matter in palidrome(e.g. 121, 123, 1221, etc), we can simply get rid of it.
        return x == revertedNumber || x == revertedNumber / 10;
    }
};
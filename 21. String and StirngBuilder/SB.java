class SB {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    public static boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();

        for(int i = 0 ; i < s.length() ; i++){
            char c = s.charAt(i);
            if(Character.isLetterOrDigit(c) && Character.isWhitespace(c)){
                builder.append(s.charAt(i));
            }
        }
        s = builder.toString();
        System.out.println(s);
        String revs = builder.reverse().toString();
        if(s.equals(revs)){
            return true;
        }
        return false;
    }
}
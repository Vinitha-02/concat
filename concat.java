class concat {
    public static void main(String[] args) {
        String s = "market";
        String str = "simplified";
        String str2 = s.concat(str);
        System.out.println(str2);
        int l = s.length();
        int len = str.length();
        System.out.println(l);
        System.out.println(len);
        if (l == len) {
            System.out.println("Length are  equal");
            System.out.println(s + str);

        }
        if (l > len) {
            int a = l - len;
            System.out.println(s.substring(a, s.length()) + str);
        } else if (l < len) {
            int b = len - l;
            System.out.println(str.substring(b, str.length()) + s);

        }
    }
}

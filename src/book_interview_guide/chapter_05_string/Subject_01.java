package book_interview_guide.chapter_05_string;

/**
 * 判断两个字符串是否互为变形词
 * <p>
 * 给定两个字符串str1和str2，如果str1和str2中出现的字符种类一样且每种字符出现的次数也一样，那么str1和str2互为变形词。
 * <p>
 * 例：str2 = "123" str2  = "231"  返回true
 * str2 = "123" str2  = "2311"  返回false
 */
public class Subject_01 {

    public static void main(String[] args) {
        System.out.println(isDeformation("123", "231"));
        System.out.println(isDeformation("123", "2311"));
    }

    public static boolean isDeformation(String str1, String str2) {
        char[] str1s = str1.toCharArray();
        char[] str2s = str2.toCharArray();
        int[] map = new int[256];
        for (char c : str1s) {
            map[c]++;
        }
        for (char c : str2s) {
            if (map[c]-- == 0) {
                return false;
            }
        }
        return true;
    }
}

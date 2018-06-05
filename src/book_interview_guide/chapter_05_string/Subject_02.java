package book_interview_guide.chapter_05_string;

/**
 * 阅读数：1292
 * 字符串中数字子串的求和
 * <p>
 * 【题目】
 * <p>
 * 　　给定一个字符串str，求其中全部数字串所代表的数字之和。
 * <p>
 * 【要求】
 * <p>
 * 　　1、忽略小数点字符，例如＂A1.3＂,其中包含两个数字1和3。
 * <p>
 * 　　2、如果紧贴数字子串的左侧出现字符'-'，当连续出现的数量为奇数时，则数字为负数，连续出现的数量为偶数时，则数字为正数。例如，"A-1BC--12"，其中包含数字是-1和12。
 * <p>
 * 【举例】
 * <p>
 * 　　str="",返回36；
 * <p>
 * 　　str="a-1b--2c--d6e",返回7；
 */
public class Subject_02 {
    public static void main(String[] args) {
        System.out.println(numSum("a-1b--222c--d0=--6e"));
    }

    public static int numSum(String str) {
        char[] chars = str.toCharArray();
        int p = 0;
        int q = 0;
        boolean positive = true;
        int result = 0;
        int num = 0;
        for (int i = 0; i < chars.length; i++) {
            p = chars[i] - '0';
            if (p < 0 || p > 9) {
                result = result + num;
                num = 0;
                if (chars[i] == '-') {
                    positive = !positive;
                } else {
                    positive = true;
                }
            } else {
                num = num * 10 + (positive ? p : -p);
            }
        }
        result = result + num;
        return result;
    }
}

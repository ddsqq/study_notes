public class ArrayTest7 {
    public static void main(String[] args) {
        char letters [] = new char[26];
        System.out.println("数组的长度:"+letters.length);
        System.out.println("数据存储到letter之前:");
        for (int i = 0; i < letters.length; i++) {
            if (i == 0) {
                System.out.println(letters[i]);
            }else {
                System.out.println(","+letters[i]);
            }
        }
        System.out.println(']');

        String[] names = new String[5];
        System.out.println("names数组的长度:"+names.length);
        System.out.println("存储姓名到names数组之前:[");
        for (int i = 0; i < names.length; i++) {
            if (i == 0) {
                System.out.println(letters[i]);
            }else {
                System.out.println(","+letters[i]);
            }
        }
        System.out.println("]");
    }
}

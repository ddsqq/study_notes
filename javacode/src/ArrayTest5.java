public class ArrayTest5 {
    public static void main(String[] args) {
        int arr [] = new int[5];
        System.out.println("数组的长度:"+arr.length);
        System.out.println("存储到arr数组之间:[");
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.println(arr[i]);
            }else {
                System.out.println(","+arr[i]);
            }/**/
        }
        System.out.println("]");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i+1) * 2;
        }
        System.out.println("存储数据到arr之后:[");

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.println(arr[i]);
            }else {
                System.out.println(","+arr[i]);
            }

        }
        System.out.println("]");
    }
}

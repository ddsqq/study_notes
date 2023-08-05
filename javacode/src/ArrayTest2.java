/*
打印出数组的地址
 */
public class ArrayTest2 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int nums[];
        nums = new int[]{10, 20, 30, 40, 50};
        char word[] = {'h', 'e', 'l', 'l', 'o'};
        String heros [] = {"袁隆平","邓家先","芊雪深"};

        System.out.println("arr数组:"+arr);
        System.out.println(nums);
        System.out.println(word);
        System.out.println(heros);

    }
}

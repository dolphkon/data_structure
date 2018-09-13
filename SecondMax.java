package paixu;
import java.util.Arrays;

/*
*    方法一：调用 Arrays.sort()方法将数组排序并输出倒数第二个数
*    方法二：调用findSecondMax（）
*
* */
public class SecondMax {
    public  static void main (String [] args){
        int [] array={3,8,5,2,9,110};
        Arrays.sort(array);
        System.out.println(array[array.length-2]);
        System.out.print(findSecondMax(array));
    }
    public static int findSecondMax(int data []){
        int count=data.length;
        int maxnumber=data[0];
        int sec_max=Integer.MIN_VALUE;
        for (int i=1;i<count;i++){
            if (data[i]>maxnumber){
                sec_max=maxnumber;
                maxnumber=data[i];
            }else {
                if (data[i]>sec_max){
                    sec_max=data[i];
                }
            }
        }
        return sec_max;
    }
}

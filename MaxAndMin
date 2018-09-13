package paixu;

import java.util.Arrays;
import java.util.Comparator;
/*
*   数组升序以及降序排列的两种方法
* */
public class MaxAndMin {
    public static void main(String [] args){
    int [] inta={2,4,3,1,5,9,6};
//    对一个数组进行升序处理
    up(inta);
//    对一个数组进行降序处理
    Integer[] integers=new Integer[]{2,324,4,4,6,1};
    down(integers);
//   通过Arrays.stream 获取数组的额最大值和最小值
        int min =Arrays.stream(inta).min().getAsInt();
        int max=Arrays.stream(inta).max().getAsInt();
        System.out.print("数组 inta的最大值为："+max+" "+"最小值为"+min);

    }
    public static void up(int [] a){
        Arrays.sort(a);
       for (int i=0;i<a.length;i++){
           System.out.println(a[i]+" ");
       }
    }
    public static void down(Integer [] b){
     Arrays.sort(b,new Comparator<Integer>(){

         @Override
         public int compare(Integer o1, Integer o2) {
             return o2-o1;
         }

         @Override
         public boolean equals(Object obj) {
             return false;
         }
     });
        for (Integer integer:b)
        {
            System.out.print(integer+" ");
        }
    }
}

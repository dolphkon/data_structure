
/*
*    解题思路：利用 Map 映射表记录每一个元素出现的次数，然后判断次数的大小
*    进而找出重复次数最多的元素。key表示数组的元素，value表示这个元素在数组中出现的次数。最后对map进行遍历。
*
*  */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
public class FindMostFrequentArray {
    public static void main(String[] args) {
   int array []={2,2,3,3,3,6,8,4,3,4,9,2};
        System.out.print("重复元素最多的是:"+findMostFrequentArray(array));
    }
    public static  int findMostFrequentArray(int [] a){
        if (a.length==0){
            return Integer.MAX_VALUE;
        }
        //   先记录每个元素出现的次数
        Map<Integer,Integer>map=new HashMap<Integer,Integer>();
        for (int i=0;i<a.length;i++){
            if (map.containsKey(a[i])){
                map.put(a[i],map.get(a[i])+1);
            }else {
                map.put(a[i], 1);
            }
        }
        //找出次数最多的那一个元素
          int index=0;//数组中重复元素最多的数
        int val = 0;  //最多的次数
        Iterator iterator=map.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry entry=(Map.Entry)iterator.next();
            int key =(Integer)entry.getKey();
            int value=(Integer)entry.getValue();
            if(value > val){
                index = key;
                val = value;
            }
        }
        return index;
    }
}

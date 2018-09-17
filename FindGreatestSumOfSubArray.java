/*
    解题思路：判断数组中连续子数组是否大于0 ，如果小于0则不用与后面的元素相加，保存当前元素即可，如果大于0则将连续子数组与当前元素相加
    例如：输入的数组为{1，-2，3，10，-4，7，2，-5}，和最大的子数组为{3，10，-4，7，2}，输出连续子数组的最大和是8。
    
（1）.我们定义两个变量，sum(保存连续累加的和)，max(连续子数组的最大值),都赋值为数组的第一个元素。然后从第二个元素开始依次遍历整个数组，
   sum开始为1，加上-2变成-1，小于0，再加上3后和为2，比3本身还小，也就是说从第一个数字开始的子数组的和会小于从第三个数字开始的子数组的和，
   因此不需要考虑第一个数字开始的子数组，之前的累计也被抛弃。
   
（2）.从数字3开始累加，sum等于数字3，加上10，和为13，加上-4和为9，比13小，我们要把13保存起来即max = 13，它有可能是最大和，继续循环，
     加上7后和为16，更新max，加上2后最大和为18，更新max，加上-5后和小于max，max的值不变。循环结束，最大和为18。
*/
public class FindGreatestSumOfSubArray {
    public static int FindGreatestSumOfSubArray(int[] array) {
        if (array.length==0 || array==null) {
            return 0;
        }
        int currentSum = 0;     //存储当前连续n项的和
        int max = 0;            //存储连续子元素和的最大值
        for (int i = 0; i < array.length; i++) {
            //核心部分，好好理解.
            if(currentSum<=0){      //如果当前连续n项的和小于等于0,则没必要与后面的元素相加
                currentSum = array[i];      //currentSum重新赋值
            }else{
                currentSum += array[i];     //如果currentSum的值大于0,则继续与后面的元素相加,
            }
            if(currentSum>max){         //每次改变currentSum的值都有与max进行比较
                max = currentSum;       //如果currentSum的值大于max,则将currentSum的值赋值给max
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] array = {6,-3,-2,7,-15,1,2,2};
        int result = FindGreatestSumOfSubArray(array);
        System.out.println("连续子元素的最大和为："+result);
    }
}

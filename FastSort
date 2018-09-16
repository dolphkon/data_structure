package paixu;

import java.util.Arrays;

       /*  快速排序的基本思想： 通过一趟排序将要排序的数据分成独立的两部分，其中一部分的所有数据（左边的数据）都比
         另外一部分的所有数据（右边的数据）都要小，然后再按此方法对这两部分数据分别进行快速排序， 整个排序过程可以递归进行，以此达到整个数据变成有序的序列。

          一趟快速排序： 在要排序的数据中，首先任意选取一个数据（通常选用第一个数）作为关键数（或称为基准数），
          然后将所有比它小的数都放在前面（左边），所有比它大的数都放到后面（右边），这个过程称为一趟排序。

         一趟快速排序规则: 1）设置两个变量i、j，排序开始的时候：i=0，j=N-1； 2）以第一个数组元素作为关键数据(即基准数)，赋值给key，即
          key=A[0]； 3）从j开始向前搜索，即由后开始向前搜索（j--），找到第一个小于key的值A[j]，A[i]与A[j]交换；
         4）从i开始向后搜索，即由前开始向后搜索（i++），找到第一个大于key的A[i]，A[i]与A[j]交换； 5）重复执行第3、4步，直到 i=j；
          6）到此找到基准点的下标，作为分治下标； 7）重复1-6步骤递归排序前半部分； 8）重复1-6步骤递归排序后半部分。
         */
public class FastSort {
    public static void main (String [] args){
        int[] sortNum = new int[]{12,10,-1,15,4,0,-3,16,8,2,33,7,28,19}; 	// 定义数组
        System.out.println("排序前：" + Arrays.toString(sortNum)); 		// 排序前的数组
        quickSort(sortNum, 0, sortNum.length - 1); 					// 执行排序方法2
        System.out.println("排序后：" + Arrays.toString(sortNum));
    }
    private static int getMiddle(int[] sortArray, int left, int right){
        int key = sortArray[left];	//以数组的第一个数作为中轴
        while(left < right){
            //从右边开始
            if(sortArray[right] >= key){
                right--;		//下标向左移动
            }
            sortArray[left] = sortArray[right];			//比中轴数小，移动到左边位置，此时left位相当于空，等待低位比key大的数补上

            //从左边开始
            if(sortArray[left] <= key){
                left++;  		//下标向右移动
            }
            sortArray[right] = sortArray[left];  		//比中轴数大，移动到右边位置，此时left位相当于空，等待高位比key小的数补上
        }
        sortArray[left] = key;  //当left == right，完成一趟快速排序，此时left位相当于空，等待pivotkey补上
        return left;			//返回中轴的位置，为什么返回的是left这个位置？当然也可以返回right位置，因为走到最后left与right相同了
    }

    //快速排序方法
    public static void quickSort(int[] sortArray, int left, int right){
        if(left < right){
            int middle = getMiddle(sortArray, left, right);  	//中轴数将数组进行一分为二
            quickSort(sortArray, left, middle-1);  			//比中轴小的左边部分数组继续进行递归排序
            quickSort(sortArray, middle+1, right);  			//比中轴大的右边部分数组继续进行递归排序
        }
    }
}

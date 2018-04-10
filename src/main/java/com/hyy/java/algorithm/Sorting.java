package com.hyy.java.algorithm;

/**
 * @Author hyy
 **/
public class Sorting {

    public static void main(String[] args) {
        int nums[] = {5,6,3,2,1,4};
//        int result[] = bubbleSort(nums);
        int result[] = selectSort(nums);
        for(int i=0;i<result.length;i++){
            System.out.println(result[i]);
        }
    }
    /**
     * 冒泡排序原理：
     * 相邻数字比较。每轮后，最大或最小数字交换到最后一位。
     * @param nums
     * @return
     */
    public static int[] bubbleSort(int[] nums){
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1;j++){
                int one = nums[j];
                int two = nums[j+1];
                if(one > two){
                    nums[j+1] = one;
                    nums[j] = two;
                }
            }
        }
        return nums;
    }

    /**
     * 选择排序原理：
     * 在未排序序列中找到最小或最大元素，存放到排序序列的起始位置。
     * @param nums
     * @return
     */
    public static int[] selectSort(int[] nums){
        for(int i=0;i<nums.length;i++){
            int min = nums[i];
            int index = i;
            for(int j=i+1;j<nums.length;j++){
                if(nums[j] < min){
                    min = nums[j];
                    index = j;
                }
            }
            nums[index] = nums[i];
            nums[i] = min;
        }
        return nums;
    }

    /**
     * 插入排序原理：
     * 对于每个未排序数据，在已排序序列中从后向前扫描，找到相应位置并插入。
     * @param nums
     * @return
     */
    public static int[] insertionSort(int[] nums){
        for(int i=0;i<nums.length;i++){
        }
        return nums;
    }

}

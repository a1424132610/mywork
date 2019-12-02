package com.zhj.utils;

/**
 * 　　　　　　　   ┏┓　   ┏┓+ +
 * 　　　　　　　┏┛┻━━━┛┻┓ + +
 * 　　　　　　　┃　　　　　　　┃
 * 　　　　　　　┃　　　━　　　┃ ++ + + +
 * 　　　　　　 ████━████ ┃+
 * 　　　　　　　┃　　　　　　　┃ +
 * 　　　　　　　┃　　　┻　　　┃
 * 　　　　　　　┃　　　　　　　┃ + +
 * 　　　　　　　┗━┓　　　┏━┛
 * 　　　　　　　　　┃　　　┃
 * 　　　　　　　　　┃　　　┃ + + + +
 * 　　　　　　　　　┃　　　┃			God beast body, code no BUG
 * 　　　　　　　　　┃　　　┃ +			神兽护体,代码无BUG
 * 　　　　　　　　　┃　　　┃
 * 　　　　　　　　　┃　　　┃　　+
 * 　　　　　　　　　┃　 　　┗━━━┓ + +
 * 　　　　　　　　　┃ 　　　　　　　┣┓
 * 　　　　　　　　　┃ 　　　　　　　┏┛
 * 　　　　　　　　　┗┓┓┏━┳┓┏┛ + + + +
 * 　　　　　　　　　　┃┫┫　┃┫┫
 * 　　　　　　　　　　┗┻┛　┗┻┛+ + + +
 *
 * @title:
 * @author 14241
 * @date 2019/10/24
 */
public class BinarySearch {

    public int binarySearch(int num,int[] nums){
        if(nums.length < 0){
            throw new RuntimeException("数组不能为空");
        }
        //{1, 20, 30, 40, 50, 60,70,80,90,100}
        return search(nums, num, 0, nums.length - 1);
    }

    private int retrunSearch(int[] arr, int key, int start, int end) {
        if(key < arr[start] || key > arr[end] || start > end){
            return -1;
        }
        int middle = (end + start) / 2;
        if(key < arr[middle]){
           return retrunSearch(arr,key,start,middle-1);
        }
        if(key > arr[middle]){
            return retrunSearch(arr,key,middle+1,end);
        }else {
            return middle;
        }
    }
    private int search(int[] arr,int key,int start,int end){
        if(key < arr[start] || key > arr[end] || start > end){
            return -1;
        }
        while (start < end){
            int middle = (start+end) / 2;
            if(key == arr[middle]){
                return middle;
            }
            if(key < arr[middle]){
                end = middle - 1;
            }
            if(key > arr[middle]){
                start = middle + 1;
            }
        }
        return -1;
    }

}

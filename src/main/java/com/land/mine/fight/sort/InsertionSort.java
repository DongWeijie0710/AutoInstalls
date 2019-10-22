package com.land.mine.fight.sort;

/**
 * @task: 插入排序
 * @discrption: 稳定
 * @author: dongweijie
 * @date: 2019/10/22
 * @version: 1.0.0
 */
public class InsertionSort {

    public static void main(String[] args) {
        int[] array = {28, 11, 29, 12, 520, 14, 13};
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int index = i;
            while (index > 0 && current < array[index - 1]) {
                array[index] = array[index - 1];
                index--;
            }
            array[index] = current;
        }
        System.out.print(array);
    }


}

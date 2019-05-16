package com.fajuary.algorithmengineerapp;

/**
 * <pre>
 *     author : zhangpengfei
 *     e-mail : 18242312549@163.com
 *     time   : 2019/05/16
 *     desc   :
 *     version: 1.0
 * </pre>
 */
public class Solution {

    public static void main(String args[]) {
        int[][] ary = generateMatrix(3);

        printArray(ary);
    }



    /**
     * (0,0)
     * 1
     * (0,1)
     * 1 2
     * 4 3
     * <p>
     * (1,1）
     * 1 2 3
     * 8 9 4
     * 7 6 5
     * <p>
     * （0，1）
     * 1  2  3  4
     * 12 13 14  5
     * 11 16 15  6
     * 10  9  8  7
     * <p>
     * （3,1）
     * 1   2   3    4   5
     * 16  17  18  19   6
     * 15  24  25  20   7
     * 14  23  22  21   8
     * 13  12  11  10   9
     *给定一个正整数n，生成一个由1到n2元素组成的螺旋矩阵。
     * @param n
     * @return
     */

    public static int[][] generateMatrix(int n) {
        int[][] array = new int[n][n];
        int count = n * n;
        int val = 1;
        int row = n, col = n;
        int i ,j, direct;
        int r_r=row,c_r = col,r_d=row,c_d=col,r_l=row,c_l=col,r_u=row,c_u=col;

        /**
         * direct 方向
         * 1 向右
         * 2 向下
         * 3 向左
         * 4 向上
         */
        while (count>0){
            for (direct = 1; direct <= 4; direct++) {
                if (direct == 1) {//向右
                    i = row-r_r;
                    for(j=col-c_r;j<c_r;j++){
                        array[i][j]=val;
                        count--;
                        val++;
                    }
                    c_r--;
                    r_r--;
                }
                if (direct == 2) {//向下
                    j = c_d-1;
                    for(i = row-r_d+1;i<r_d&&count>0;i++){
                        array[i][j]=val;
                        count--;
                        val++;
                    }
                    r_d--;
                    c_d--;
                }
                if (direct == 3) {//向左
                    i = r_l-1;
                    for(j=c_l-2;j>=col-c_l&&count>0;j--){
                        array[i][j]=val;
                        count--;
                        val++;
                    }
                    r_l--;
                    c_l--;
                }
                if (direct == 4) {//向上
                    j=col-c_u;
                    for(i=r_u-2;i>row-r_u&&count>0;i--){
                        array[i][j]=val;
                        count--;
                        val++;
                    }
                    r_u--;
                    c_u--;

                }
            }
        }

        return array;
    }

    public static void printArray(int[][] Array) {
        for (int i = 0; i < Array.length; i++) {
            System.out.print("[");

            for (int j = 0; j < Array[i].length; j++) {
                if (i == Array.length - 1) {
                    if (j == Array.length - 1) {
                        System.out.print(Array[i][j] + "");

                    } else {
                        System.out.print(Array[i][j] + ",");

                    }

                } else if (j == Array[i].length - 1) {
                    System.out.print(Array[i][j] + "]" + "\n");
                } else {
                    System.out.print(Array[i][j] + ",");
                }
            }

        }
        System.out.println("]");
    }

    public static void printOneArray(int[] Array) {
        System.out.print("[");

        for (int i = 0; i < Array.length; i++) {

            if (i == Array.length - 1) {
                System.out.print(Array[i] + "]" + "\n");
            } else {
                System.out.print(Array[i] + ",");
            }
        }
    }
    public static int[] generateMatrixOne(int n) {
        int[] array = new int[n * n];
        for (int i = 0; i < n * n; i++) {
            array[i] = i + 1;
        }
        return array;

    }

}

package com.lx.datastructure.ds01_sparsearr;

/**
 * 稀疏数组
 */
public class SparseArr {

    public static void main(String[] args) {
        //0.定义行和列
        int row = 11;
        int col = row;

        //1,定义一个棋盘的二维数组
        int chessArr1[][] = new int[row][col];
        //2.设置数据，0 为空值 ，1为黑子 ，2为白子
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 1;
        chessArr1[3][4] = 1;
        chessArr1[2][5] = 2;
        chessArr1[3][5] = 2;
        chessArr1[4][5] = 2;

        System.out.println("棋盘二维数组");
        int sum = 0;
        for (int[] rows : chessArr1) {
            for (int data : rows) {
                System.out.print(data+"\t");
                if (data!=0) sum++;
            }
            System.out.println();
        }
        System.out.println("一共有多少个位置的值sum:"+sum);

        //创建稀疏数组
        int spareseArr[][] = new int[sum+1][3];
        //设置稀疏数组第一行的值
        spareseArr[0][0]=row;
        spareseArr[0][1]=col;
        spareseArr[0][2]=sum;

        //往稀疏数组中赋值
        int spareseArrRow = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (chessArr1[i][j] != 0){
                    spareseArrRow++;
                    spareseArr[spareseArrRow][0]=i;
                    spareseArr[spareseArrRow][1]=j;
                    spareseArr[spareseArrRow][2]=chessArr1[i][j];
                }
            }
        }

        System.out.println("把棋盘的二维数组压缩成稀疏数组:");
        for (int[] rows : spareseArr) {
            for (int data : rows) {
                System.out.print(data+"\t");
            }
            System.out.println();
        }

        //把稀疏数组转变成二维数组
        int diskChessArr[][] = new int[spareseArr[0][0]][spareseArr[0][1]];
        //往二维数组加棋子数据
        for (int i = 1; i < spareseArr.length; i++) {
            diskChessArr[spareseArr[i][0]][spareseArr[i][1]] = spareseArr[i][2];
        }

        System.out.println("==把稀疏数组转成二维数组 ====");
        for (int[] rows : diskChessArr) {
            for (int data : rows) {
                System.out.print(data+"\t");
            }
            System.out.println();
        }

    }



}

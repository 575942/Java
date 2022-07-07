/*数组*/
import java.util.Arrays;
import java.util.Scanner;

public class array{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);  //定义输入
        System.out.println("1、定义数组\n2、定义多维数组");
        System.out.print("请选择：");
        int n=in.nextInt(); //整数类型输入方式
        /*switch模块*/
        switch (n) {
            case 1:
                /*定义数组1*/
                int [] number=new int [5];  //定义数组
                number[0]=1;
                number[1]=3;
                System.out.println("定义数组1");
                System.out.println("内存地址:"+number);  //输出的是内存地址
                System.out.println("数组内容:"+Arrays.toString(number)+"\n");  //输出数组
                /*定义数组2*/
                int [] number1={2,3,5,6,6}; 
                System.out.println("定义数组2");
                System.out.println("数组内容:"+Arrays.toString(number1));
                System.out.println("数组长度:"+number1.length);  
                System.out.println("内存地址:"+number1+"\n");
                /*定义数组3*/
                int [] number2=new int [5];
                for(int i=0;i<=4;i++){
                    number2[i]=i;
                }
                System.out.println("定义数组3");
                System.out.println("数组内容:"+Arrays.toString(number2));
                break;
            case 2:
                System.out.println("***********");
                /*定义多维数组1*/
                int [][] num=new int [2][3];  //定义2行3列的数组
                for(int i=0;i<2;i++){
                    for(int j=0;j<3;j++){
                        num[i][j]=i+j;
                    }
                }
                System.out.println("定义多维数组1");
                System.out.println("内存地址:"+Arrays.toString(num));
                System.out.println("数组内容:"+Arrays.deepToString(num)+"\n"); 
                /*定义多维数组2*/
                int [][] num2={{1,2,3},{2,3,5,5}};
                System.out.println("定义多维数组2");
                System.out.println("数组内容:"+Arrays.deepToString(num2)+"\n");
                break;   
        }
    }
}
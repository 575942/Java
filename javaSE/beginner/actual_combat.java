
/*
1、打印九九乘法表
    简单：将九九乘法表打印到控制台。
2、求1000以内的是水仙花数
    中等：打印1000以内所有满足水仙花的数，“水仙花数”是指一个三位数其各位数字的立方和等于该数本身，
    例如153是“水仙花数”，因为：153 = 1^3 + 5^3 + 3^3ss
*/
import java.util.Scanner;

public class five_actual_combat{
    public static void main(String[] args){
        //输入内容  ，  iV  I
        Scanner in=new Scanner(System.in);  //定义scanner，等待输入
        System.out.println("1、九九乘法表\n2、1000水仙花数");
        System.out.print("请选择功能：");
        int n=in.nextInt();  //整数类型输入方式
        switch(n){
            case 1:
                //九九乘法表
                System.out.println("九九乘法表");
                for(int i=1;i<=9;i+=1){
                    for(int j=1;j<=i;j+=1){
                        System.out.print(i+"x"+j+"="+i*j+"\t");
                    }
                    System.out.println();  //将光标移动到一个新行
                } 
                break; 
            case 2:
                //水仙花数
                System.out.println("水仙花数:");
                for(int i=1;i<=1000;i++){
                    int ge=i%10;   //余数
                    int shi=i/10%10;
                    int bai=i/100%10;
                    if (ge*ge*ge+shi*shi*shi+bai*bai*bai==i){
                        System.out.print(i+"\t");
                    } 
                }    
                break;            
        }
    }
}
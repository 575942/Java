import java.util.Scanner;

public class string{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);  //定义输入
        System.out.println("1、字符串相关操作\n2、字符串和特殊符号");
        System.out.print("请选择：");
        int n=in.nextInt(); //整数类型输入方式

        /*switch模块*/
        switch (n) {
            case 1:
                /*字符串的相关操作*/
                String message="  Hello world";
                System.out.println(message);
                System.out.println("结尾："+message.endsWith("d"));  //查看是否以d结尾,True or False
                System.out.println("开头："+message.startsWith("h"));  //查看是否以h开头
                System.out.println("字符串长度："+message.length());   //查看字符串的长度
                System.out.println("查看索引："+message.indexOf("h"));  //查看h的索引位置,不存在返回-1
                System.out.println("替换："+message.replace("h","*"));   //替换字符
                System.out.println("大写变小写："+message.toLowerCase());  //大写变小写
                System.out.println("小写变大写："+message.toUpperCase());  //小写变大写
                System.out.println("去除开头或结尾的空格："+message.trim());  //去除空格
                break;
            case 2:
            /*字符串和特殊符号*/
                String message2="Hello \"mosh\"";  //反斜杠
                String message3="hello windows\\....";
                System.out.println("反斜杠："+message2);
                System.out.println(message3);
            default:
                break;
        }
    }   
}
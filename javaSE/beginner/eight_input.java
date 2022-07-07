import java.util.Scanner;

public class eight_input{
    public static void main(String[] args){
        Scanner  iner=new Scanner (System.in);
        System.out.print("Age:");
        System.out.print("Height:");
        byte age=iner.nextByte();   //输入字节类型的数据
        System.out.println("you are "+age+" years old");
        //float height=ienr.nextfloat();  //浮点类型的数据
        //System.out.println("you height is "+height);
        //String name=iner.nextLine();  //输入时包含空格后面的内容
        
    }
}
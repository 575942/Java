//数据类型转换
public class two_type_conversion{
    public static void main(String[] args){
        //隐式类型转换
        //byte>short>int>long>float>double
        byte b = 9;
        short s = b;
        int i = s;
        long l = i;
        float f = l;
        double d = f;
        System.out.println(d);
        //显式类型转换
        int a=128;
        byte g=(byte)a;  //超出精度范围
        System.out.println(g);
    }
}
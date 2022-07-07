public class one_data_type {
    public static void main(String[] args) {     
        //创建变量
        int a=10;
        System.out.println(a);
        //创建常量
        final int b=200;
        System.out.println(b);
        //整数类型
        byte c=123;   //8bit,也就是一个字节,范围在-128~127
        short d=2342; //16bit，也就是16个字节，范围在-32768~+32767
        int e=324145; //32bit，也就是32个字节，最常用的类型
        long f=328341240;  //64bit
        System.out.println(c);
        //小数类型
        float g=3141;   //单精度浮点型，32bit
        double t=232; //双精度浮点型，64bit
        System.out.println(g);
        System.out.println(t);
    }
}

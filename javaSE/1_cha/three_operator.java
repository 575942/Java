public class three_operator{
    public static void main(String[] args){
        //算数运算
        int a=10;
        int c=1+1;
        int b=5*5;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        //字符连接
        System.out.println("lbw"+"nb");
        System.out.println("lbw"+a+b);  //字符和其他类型连接，会当作字符串处理
        //自减和自增
        System.out.println(a+=2);  //等价于 a = a + 2
        System.out.println(b-=4);
        //关系运算符
        boolean x=a>b;
        System.out.println(x);
        //逻辑运算符
        /* 
        &&：与
        ||：或
        ！：非
        */
        boolean y = a > b && a < b;  //怎么可能同时满足呢
        boolean h = a > b || a <= b;  //一定有一个满足！
        System.out.println(y);   //true
        System.out.println(h);   //false
        //三目运算符
        int aa = 7, bb = 15;
        String str = aa > bb ? "行" : "不行";  // 判断条件(只能是boolean,或返回boolean的表达式) ? 满足的返回值 : 不满足的返回值 
        System.out.println("汉堡做的行不行？"+str);  //汉堡做的行不行？不行
    }

}
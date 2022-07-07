public class six_mathclass{
    public static void main(String[] args){
        //向下取整
        int result=Math.round(1.1F);
        System.out.println("1.1四舍五入"+result);
        //向上取整
        int result1=(int)Math.ceil(1.1F);
        System.out.println("1.1向上取整"+result1);
        //比大小
        int result2=Math.max(2,4);
        System.out.println("比大小"+result2);    
        //随机数
        double res1=Math.random()*1;  //0~!之间
        System.out.println("0~1随机数:"+res1); 
        double res2=Math.random()*100;  //0~100之间
        System.out.println("0~100随机数:"+res2); 
        System.out.println("0~100随机数四舍五入:"+Math.round(res2));
    }
}
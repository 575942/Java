//格式化数据格式
import java.text.NumberFormat;

public class seven_format{
    public static void main(String[] args){
        //￥1234,转为货币数据
        NumberFormat cur=NumberFormat.getCurrencyInstance();  //转为货币数据
        System.out.println(cur.format(12345.24));
        String result=NumberFormat.getCurrencyInstance().format(134543);
        System.out.println(result);
        //百分比
        NumberFormat per=NumberFormat.getPercentInstance();
        System.out.println(per.format(0.2));


    }
}
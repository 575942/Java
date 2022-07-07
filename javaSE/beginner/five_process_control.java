public class five_process_control{
    public static void main(String[] args){
        //判断语句
        System.out.println("**if判断**");
        int a=10;
        int b=20;
        if (a>b){
            System.out.println("yes");
        }
        else if(a<b){
            System.out.println("no");
        }
        else{
            System.out.println("equal");
        }
        int n=4;
        //switch语句
        System.out.println("**switch结构**");
        switch(n){
            case 1:
                System.out.println("真厉害");
                break;
            case 4:
                System.out.println("卢本伟牛逼");
                break;
        }
        //循环结构
        System.out.println("**for循环**");
        for(int i=0;i<4;i++){
            System.out.println("淡水海边");
        }
        String [] fruits= {"apple","mango","orange"};
        for(int i=fruits.length;i>0;i--){
            System.out.println(fruits[i-1]);
        }
        //while结构
        System.out.println("**while循环**");
        while(n<6){
            System.out.println(n);
            n+=1;
        }
        //do while循环
        System.out.println("**do while循环**");
        do{
            System.out.println(n);
            n-=1;
        }while(n>4);
    }
}
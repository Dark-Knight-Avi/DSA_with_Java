import java.util.Scanner
Class Candle{
public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int testNum=sc.nextInt();
        for(int i=0;i<testNum; i++){
        String[]arr=sc.nextLine().split(" ");
        int n=(int)arr[0];
        int m=(int)arr[1];
        String[]student=sc.nextLine().split(" ");
        int sum=0;
        for(String s:student){
        sum+=(int)s;
        }
        System.out.println("Case #1:"+(sum%m));
        }
        }
        }
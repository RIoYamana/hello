import java.util.Random;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        int a = rand.nextInt(90)+10; 
        for(int i=0;i<5;i++){
            Scanner sc = new Scanner(System.in);
            System.out.print("10~99の数字を1つ入力してください：");
            int num = sc.nextInt();
            if(num==a){
                System.out.print("当たり!!");
                break;
            }else{
                if(num>a){
                    System.out.println("正解の数より大きいです");
                    if(num-a>20){
                        System.out.println("20以上離れています");
                    }
                }else{
                    System.out.println("正解の数より小さいです");
                    if(a-num>20){
                        System.out.println("20以上離れています");

                    }
                }
            }
        }
    }
}

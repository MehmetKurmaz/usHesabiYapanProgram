import java.util.Scanner;

public class Main {
    static int exponentialNumber(){
        int number1,number2;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Taban Sayisini Giriniz :");
        number1=scanner.nextInt();
        System.out.print("Us Sayisini Giriniz :");
        number2=scanner.nextInt();
        int exponential,result = 0;
        for (int i=0;i<number2;i++){
             exponential=number1*number1;
             result=number1*exponential;
           
        }
        System.out.println(result);
        return exponentialNumber();

    }
    public static void main(String[] args) {
       exponentialNumber();



    }
}
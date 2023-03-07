import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter which algorithm to use (1 - interval, 2 - GoldenCut, 3 - Newtons)");
        int input = myObj.nextInt();

        while(input != 1 && input != 2 && input != 3){
            System.out.println("Wrong data, try again");
            input = myObj.nextInt();
        }
        if(input == 1) {
            DalijimasPusiau test1 = new DalijimasPusiau(0, 10);
            test1.whoAmI();
            test1.calculate();
            test1.print();
        }
        else if(input == 2) {
            AuksinisPjuvis test = new AuksinisPjuvis(0, 10);
            test.whoAmI();
            test.goldenSectionSearch();
            test.print();
        }
        else{
            System.out.println("Starting Newton's algorithm");
            NiutonoMetodas.calculate();
        }

    }
}
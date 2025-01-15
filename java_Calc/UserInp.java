import java.util.*;

class UserInp {
    int[] userinp() {
        int[] n = new int[2];
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter first number:");
        n[0] = sc.nextInt();
        System.out.println("Enter second number:");
        n[1] = sc.nextInt();

        return n;
    }

    
    int getOperationChoice() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select operation:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        int choice = sc.nextInt();
        return choice;
    }
}

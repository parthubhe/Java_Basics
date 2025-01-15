import java.util.*;

class calc {

    void performOperation() {
        UserInp u1 = new UserInp();
        int[] num = u1.userinp();   
        int choice = u1.getOperationChoice();   

        int result = 0;
        switch (choice) {
            case 1:
                result = num[0] + num[1];
                System.out.println("Sum is: " + result);
                break;
            case 2:
                result = num[0] - num[1];
                System.out.println("Difference is: " + result);
                break;
            case 3:
                result = num[0] * num[1];
                System.out.println("Product is: " + result);
                break;
            case 4:
                if (num[1] != 0) {
                    result = num[0] / num[1];
                    System.out.println("Division result is: " + result);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operation choice.");
        }
    }
}

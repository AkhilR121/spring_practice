import java.util.Scanner;

public class PrintName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        RecursionPrintName obj = new RecursionPrintName();
        // int i = 1;
        System.out.println("Give any nunber: ");
        int n = sc.nextInt();
        obj.recursiveFunction(n, n);
    }
}

class RecursionPrintName{
    // public void recursiveFunction(int i, int n){
    //     if(i > n) return;
    //     System.out.println("Name: " + "Hello");
    //     recursiveFunction(i+1, n);
    // }

    public void recursiveFunction(int i, int n){
        if(i < 1) return;
        recursiveFunction(i-1, n);
        System.out.println("Number: " + i);
    }
}
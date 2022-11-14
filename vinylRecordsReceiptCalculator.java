import java.util.Scanner;
public class vinylRecordsReceiptCalculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double taxRate = 1.14;
        System.out.println("Please input the customers name");
        String name = scan.next();

        System.out.println("Please input number of kilometers to customers house");
        double deliveryCost = scan.nextDouble()*(15);

        System.out.println("Please input the cost of the records being purchased");
        double costRecords = scan.nextDouble()*(taxRate);

        double totalCost = deliveryCost + costRecords;

        System.out.printf("Purchase summary for "+name+"\n"+ "Delivery cost: $"+"%.2f",deliveryCost);
        System.out.printf("\n"+"Cost of records: $"+"%.2f",costRecords);
        System.out.printf("\n"+"Total cost: $"+"%.2f",totalCost);
    }
}

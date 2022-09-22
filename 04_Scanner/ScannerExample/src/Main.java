import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên của bạn: ");
        String name = input.nextLine();

        System.out.println("Nhập tuổi của bạn: ");
//        int age = input.nextInt();
//        input.nextLine(); //Cách 1
        int age = Integer.parseInt(input.nextLine());

        System.out.println("Nhập địa chỉ: ");
        String address = input.nextLine();

//        System.out.println("Nhập lương của bạn: ");
//        long salary = input.nextLong();
//
//        System.out.println("nhập chiều cao của bạn: ");
//        float height = input.nextFloat();
//
//        System.out.println("Nhập cân nặng của bạn: ");
//        double weight = input.nextDouble();

        System.out.println("Tên tôi là: " + name);
        System.out.println("Tuổi của tôi là: " + age);
        System.out.println("Địa chỉ của tôi là: " + address);
        //System.out.println("Lương của tôi là: " + salary);


    }
}
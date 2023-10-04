package org.example.app.view;

import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class ProductCreateView {
    public String[] getData() {
        Scanner scanner = new Scanner(System.in);

        String title = "Input product name: ";
        System.out.print(title);
        String productName = scanner.nextLine().trim();

        title = "Input quota: ";
        System.out.print(title);
        String quota = scanner.nextLine().trim();

        title = "Input price: ";
        System.out.print(title);
        String price = scanner.nextLine().trim();

        return new String[]{productName, quota, price};
    }

    public void getOutput(String output) {
        System.out.println(output);
    }
}

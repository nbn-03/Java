/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
// cái này làm khác yêu cầu đề bài tận dụng thư viện stack
package com.mycompany.project03_04;
import java.util.Stack;
/**
 *
 * @author nguye
 */
public class main0 {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        stack.push(5); // Thêm phần tử vào đỉnh ngăn xếp
        stack.push(10);
        stack.push(15);

        System.out.println("Stack: " + stack); // In ra ngăn xếp

        int popped = stack.pop(); // Lấy phần tử trên đỉnh ngăn xếp ra
        System.out.println("Popped item: " + popped);

        System.out.println("Is stack empty? " + stack.isEmpty()); // Kiểm tra xem ngăn xếp có rỗng không

        System.out.println("Number of elements in stack: " + stack.size()); // Số phần tử trong ngăn xếp
    }
}

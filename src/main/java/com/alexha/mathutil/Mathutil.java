/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.alexha.mathutil;

import com.alexha.mathutil.core.MathUtinity;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class Mathutil {

    public static void SayHiFromLocal() {
        System.out.println("XIn lloxi em yeuu");
    }

    //this method  is  written directly  in server to simulate the work of another teammemer, he upload code  before me
    public static void SayHiFromServer(){
        System.out.println("HELLO");}
    public static void main(String[] args) {
        // cách kiêm thử thứ 2 - giống cách 1
        // test case #1: check if 0! return 1
        int n = 0;
        long expectedResult = 1;// 0! == 1
        long actualResult = MathUtinity.getFactorial(n);

        String msg = "0! | expected: " + expectedResult + " Actual: " + actualResult;
        JOptionPane.showMessageDialog(null, msg);
    }

//    public static void main(String[] args) {
//        // đây là nơi test han
//        // viết các test case: bọ data vào và giá trị kì vong
//        // lát hồi so sánh với giá trị thực tế mà hàm trả về
//
//        //test case#1: n = 0 | 0! = hy vọng == 1 thực tế thì chờ hàm trả về
//        int n = 0;
//        long expectedValue = 1; // hy vọng 0! trả về 1
//        long actualvalue = 1;
//
//        actualvalue = MathUtinity.getFactorial(n);
//
//        // só sánh giữa expected vs actual coi có == nhau hay kh
//        System.out.println("0! | epected: " + expectedValue + " Actual: " + actualvalue);
//        //test case #2 :1! ta hy vọng hàm trả 1 luôn!!!
//        n = 1;
//        expectedValue = 1;
//        actualvalue = MathUtinity.getFactorial(n);
//        System.out.println("1! | epected: " + expectedValue + " Actual: " + actualvalue);
//
//        //test case #3 :5! ta hy vọng hàm trả 120 luôn!!!
//        n = 5;
//        expectedValue = 120;
//        actualvalue = MathUtinity.getFactorial(n);
//        System.out.println("5! | epected: " + expectedValue + " Actual: " + actualvalue);
//
//        //test case #4 :-1! ta hy vọng hàm trả ra ngoại lệ luôn!!!
//        //đưa data cà chớn hàm ném ra ngoại lệ
//        n = -1;
//        // expectedValue = Ham tung ra ngoại lệ;
//        System.out.println("Check getF(-1) to see the exception");
//        actualvalue = MathUtinity.getFactorial(n);
//        //hy vọng sẽ thấy ngoại lệ xuất hiện
//
//    }
}

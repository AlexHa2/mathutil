/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.alexha.mathutil.core.test;

import com.alexha.mathutil.core.MathUtinity;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
// quy ước đặt  tên package của java
//tên miền đảo  ngược, chữ thường 100%
//com.mycompant trên mạng
//com.ten-cty.ten-dự-án.ten-module.Tên-class-sẽ-dùng

//c# viết chieuf xuôi, chữ hoa từng đầu  từ
// microsoft.sqlserver.
//code conention for....
/**
 *
 * @author ADMIN
 */
public class MathUtilityTest {

    //  ở đây chưa các lệnh các hà dùng deerd didtesst chính  ở  bên code chính
    // ở bên thưu  mục  source phía trên coi hàm chạy ổn kh
    //ở đây ta  làm  các hà ứng với tác test case để test code chính ở bên 
    //mathutility. ví dụ.getFractorial()
    //là 1 bộ data đưa vào app để verify coi app  có sử lý đúng không 
    // nó đi kèm theo cách sài hàm trình tự sài app + expected
    //value _ status test passed hay failed
    //TEST CASE #1: CHECK GETFACTORIAL WITH N = 0, 0! HOPES TO SEE 1 RETURN
    @Test
    //tên hàm mang ý nghĩa của test case luôn
    public void testFactorialGivenRightArg0ReturnsWell() {
        int n = 0;//given right argument
        long expectedValed = 1; // hy vọng n!  => 1
        long actualValue;//=??? // đoán xem hàm trả về mấy
        //nếu expected == actual, hàm ngon với case này

        actualValue = MathUtinity.getFactorial(0);

        assertEquals(expectedValed, actualValue);
        //cách cũ là phải sout() từng cái một nhìn để phân biệt đúng sai

    }

    //TEST CASE #2: CHECK GETFACTORIAL WITH N = 1, EXPECTED  => 1
    @Test
    public void testFactorialGivenRightArg1ReturnWell() {
        int n = 1;
        long expectedValue = 1;//1 giai thừa hy vọng là 1
        long actualValue; // chờ xem
        actualValue = MathUtinity.getFactorial(n);
        assertEquals(expectedValue, actualValue);
    }

    //TEST CASE #3: CHECK GETFACTORIAL WITH N = 2, EXPECTED  => 2
    //                                      N = 3, EXPECTED  => 6
    //                                      N = 5, EXPECTED  => 120
    @Test
    public void testFactorialGivenRightArg235ReturnWell() {
        int n = 2;
        long expectedValue = 2;//1 giai thừa hy vọng là 1
        long actualValue; // chờ xem
        actualValue = MathUtinity.getFactorial(n);

        assertEquals(expectedValue, actualValue);//?2! ==  2???

        assertEquals(6, MathUtinity.getFactorial(3));

        assertEquals(120, MathUtinity.getFactorial(5));
    }

    // Test #4:check if get factoral return exception if we pass n < 0 
    @Test
    public void testFactorialGivenWrongArgument_1ThrowException() {
        //in put n < 0,  cụ thể  là  -1 
        //  thì expected result : ilegalArgument  exception
        // màu xanh  là trả về như  kỳ vọng 
        // màu đỏ actual != kỳ vọng
        // ngoài lẹ exception kh là  value, to khkhai báo  biến == ngoại lệ
        //  kh asserEquals(value value value)
        assertThrows(IllegalArgumentException.class,
                () -> {
                    MathUtinity.getFactorial(-1);
                });

    }

}

//phần kiến thức bổ  sung vào cv
//TDD - test driven developmment
// là kỹ  thuật  viết code của dân dev đi kèm với viết các test case
// để kiểm thử ngay những code mình vừa viết 
//tức là code của mỗi hàm luôn đi kèm code  kiểm thử
// kết quả kiểm thử hiển thị theo 2 màu xanh - code ngon, pass các test case
//code đỏ, code  đã kh pass test case việc này cứ làm  liên tục, viết code, viết test case,  run test
// case để xem xanh đỏ, kĩ thuật này gọi là TDD
//mọi ngôn ngữ lập trình điều hỗ trợ bộ thư viện, framework giúp test code 2 màu xanh đổ 
// gọi là  unit  testin framwork
//mọi ngôn ngữ điều hỗ trọ TDD,  vấn đề là dev team có dùng hay kh
//nhóm làm obs có xà
//  đề bài  thuyết trình nhóm
// nhóm hãy chọn 1 unit test framwork để demo
// vào google gõ: unit testing framework for <NNLT>

//C# : nunit,xunit,mms test
//java:testing
//js:mocha, jame

//dòng thứ 2 trong cv
//DDT - data driven testing ( đừng nhầm với TDD-test driven development ở trên)
//                                    Parameterized testing( theo stlyle tham số hóa)
//DDT là  phần mở rộng thêm khi, kĩ thuật nâng cao để giúp viết code unit test, bà  con với TDD

// DDT - Praameterized  testing là kĩ thuật viết các test case mà ta tách riêng phần data
// ra khỏi các câu lệnh assert()
// cho dễ quản lý các test case
// dễ theo dõi các code liên quan đến test hàm
// vì câu lệnh so sánh expected vs. actual trở nên gọn  nhẹ hơn



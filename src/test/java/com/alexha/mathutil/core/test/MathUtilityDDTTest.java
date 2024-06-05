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
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author ADMIN
 */
public class MathUtilityDDTTest {

    //CHUẨN  BỊ DDAATAA ,SAU NÀY ĐƯA  VÀO  ASSERT() CỦA FRAMWORK
    // DATA NÀY SẼ TỪ TỪ ĐƯỢC TRÍCH VÀO TRONG HÀM ASSERT()
    //NÓ PHẢI NẰM  TRONG HÀM CÓ STYLE STATIC - NẰM  IM  CỐ ĐỊNH Ở 1 VÙNG RAM
    //TEST CASE 
    //0! -> 1; 1! -> 1; 2! -> 2; 4! -> 24 ; 5! -> 120
    //TA THẤY CÓ CÁC BỘ DATA 
    //{ 0,1 },{ 1,1 },{ 2,2 }, { 3,3}   { 7,2 }
    //TA ĐỂ RIÊNG DATA NÀY RA 1 MẢNG 2 CHIỀU
    public static Object[][] initData() {
        return new Object[][]{
            {0, 1},
            {1, 1},
            {2, 2},
            {3, 6},
            {5,120}
        };

    }

    //test case so sánh  hàm có  trả về kỳ vọng kh
    @ParameterizedTest // tham số hóa test case
    @MethodSource("initData")
    public void testFactorialGivenRightArgumentReturnWell( int  n, long expected) {
        assertEquals(expected, MathUtinity.getFactorial(n));
    }
}

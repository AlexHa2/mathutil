/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.alexha.mathutil.core;

/**
 *
 * @author ADMIN
 */
public class MathUtinity {
    // ta sẽ viết những hàm taons thọc
    // giống thư viện math. của jdk
    // các hàm mang ý nghĩa dùng chung cho nhiều nơi
    // thì sẽ được thiết kế là static!!!!
    // static sẽ được gọi là trưc tiếp qua ten class
    
    // hàm tính n! = 1.2.3.4....n
    //n: 0......20;21! tran kieru long
    //nếu 0! = 1;
    public static long getFactorial(int n) {
     
        long product = 1;// biến con heo đát , biến nhân dồn
        
        if( n < 0 || n > 20){
            throw new IllegalArgumentException("Invalid n. n must be between 0...20");
        }
        
        if(n == 0){
            return 1;
        }
        //code chạy đến đây, n = 1...2.....20
        for (int i = 1; i <= n; i++) {
            product *= i;// product = product * i
        }
        
        
        return product;
    }
}

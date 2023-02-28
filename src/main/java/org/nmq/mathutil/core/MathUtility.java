/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.nmq.mathutil.core;

/**
 *
 * @author Admin
 */
public class MathUtility {
    public static final double pi = 3.1415;
        
    // 21 giai  thừa thì vượt kiểu long  - 18 con số 0
    // ta thí nghiệm hàm n! với n = 0...20 -> đủ kiểu long
    // n! = 1 x 2 x 3 x 4 ... xn 
    // ko có giai thừa âm
    // 21! tràn long, do đó n chỉ áp dụng 0 ... 20 
    // 0! = 1! quy ước 0! = 1
    public static long getFactorial(int n){
        if(n < 0 || n > 20)
            throw new IllegalArgumentException("Invalid n. n must be between 0...20!");
        if(n == 0 || n == 1)
            return 1;
        
        // sống sót đến đây, sure n = 2 ... 20
        // for hay đệ quy mà tính 
        long product = 1; // biến tích lũy, gom việc nhân i vào 
            for (int i = 2; i <= n; i++)  // do not make code wrong 
                product *= i;             // if upload this modification
            return product;               //we will sê the Green again!
    }
}
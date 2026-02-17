/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.model;

/**
 *
 * @author castr
 */
public class ArithmeticLogic {
    
    private int num1;
    private int num2;
    private String sign;
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
    
    public int calculate()
    {
        int total=num1+num2;
        
        if(sign.equalsIgnoreCase("-"))
        {
            total=num1-num2;
        }
        else if(sign.equalsIgnoreCase("/"))
        {
            total=num1/num2;
        }
        else if(sign.equalsIgnoreCase("*"))
        {
            total=num1*num2;
        }
        
        return total;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

import java.util.Scanner;

/**
 *
 * @author mutug
 */
public class chap1 {
    private static double balance, amount, initialCash, DepositBalance;
//    initial money in the account
    public void initialCash(){
        //double initialCash;
        System.out.println("Enter Initial Deposit");
        Scanner sc = new Scanner(System.in);
        initialCash = sc.nextDouble();
        System.out.println("You have deposited: "+initialCash);
        balance = initialCash;
        System.out.println("Your Balance Is: "+balance);
    }
    public void deposit(){
        System.out.println("Make Some more deposit");
        Scanner sc = new Scanner(System.in);
        amount = sc.nextDouble();
        System.out.println("You have deposited: "+amount+" shillings");
        DepositBalance = initialCash + amount;
        System.out.println("Your Balance Is: " +DepositBalance);
    }
    public void withDraw(){
        System.out.println("Withdraw Some Money");
        Scanner sc =new Scanner(System.in);
        double Withdraw = sc.nextDouble();
        System.out.println("You have withdrawn: "+Withdraw+" shillings");
        balance = DepositBalance - Withdraw;
        System.out.println("Your Balance Is: " +balance);
    }
    public void separator(){
        System.out.println("*********************************************************");
    }
    public void ending(){
        System.out.println("Thank you for choosing us. Goodbye");
    }
    public static void main(String[]args){
        System.out.println("Your Bank Details Are as Follows");
        chap1 bank = new chap1();
        bank.separator();
        bank.separator();
        bank.initialCash();
        bank.deposit();
        bank.separator();
        bank.withDraw();
        bank.ending();
        System.exit(0);
    }
}

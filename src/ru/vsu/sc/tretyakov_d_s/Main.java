package ru.vsu.sc.tretyakov_d_s;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    String str = readString();
    CheckingBrackets check = new CheckingBrackets();
    str = str.replaceAll("[A-Za-zА-Яа-я0-9 ]", "");
    printResult(str, check);

    }

  private static String readString() {
    System.out.println("Write the symbols: ");
    Scanner scanner = new Scanner(System.in);
    return scanner.nextLine();
  }

  private static void printResult(String str, CheckingBrackets check) {

    if(check.checkForCorrectness(str)) {
      System.out.println("The brackets are correct");
    } else {
      System.out.println("The brackets are not placed correctly");
    }
  }

}

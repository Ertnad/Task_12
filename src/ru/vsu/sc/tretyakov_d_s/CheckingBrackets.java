package ru.vsu.sc.tretyakov_d_s;

public class CheckingBrackets {

  public boolean checkForCorrectness(String str) {

    if (str.length() == 0) {
      return true;
    }
    if (str.contains("()")) {
      return checkForCorrectness(str.replaceFirst("\\(\\)", ""));
    }

    if (str.contains("[]")) {
      return checkForCorrectness(str.replaceFirst("\\[\\]", ""));
    }

    if (str.contains("{}")) {
      return checkForCorrectness(str.replaceFirst("\\{\\}", ""));
    } else {
      return false;
    }
  }

  public String removeAllSymbolsExpectBrackets(String str) {
    str = str.replaceAll("[A-Za-zА-Яа-я0-9 ]", "");
    return str;
  }
}

package chapter05.obj_practice;

public class GadgetBMI {
    public String printBMI(double val, String bmi) {
          if(val < 18.5) {
               bmi = "저체중";
          } else if(val >= 18.5 && val < 23) {
               bmi = "정상";
          } else if(val >= 23 && val < 26) {
               bmi = "과체중";
          } else if(val >= 26 && val < 30) {
               bmi = "비만";
          } else {
               bmi = "고도비만";
          }
          return bmi;
    }
}

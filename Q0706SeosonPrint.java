import java.util.Scanner;

class Main {
  static void printseason(int m) {
      switch (m){
        case 3: case 4: case 5: System.out.print("봄"); break;
        case 6: case 7: case 8: System.out.print("여름"); break; 
        case 9: case 10: case 11: System.out.print("가을"); break;
        case 12: case 1: case 2: System.out.print("겨울"); break;



    }



}
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    int month;
    do{
      System.out.print("몇 월입니까(1~12) :");
      month = stdIn.nextInt();
    }while (month >12 || month < 1);


    System.out.print("해당 월의 계절은 ");
    printseason(month);
    System.out.print("입니다.");

  }

}



// ver 2


// class Main {
//   static void printseason(int m) {
//       switch (m){
//         case 3: case 4: case 5: return "봄"; 
//         case 6: case 7: case 8: return "여름";  
//         case 9: case 10: case 11: return "가을"; 
//         case 12: case 1: case 2: return "겨울"; 


// System.out.print("해당 월의 계절은" + printseason(month)+"입니다.");

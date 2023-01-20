import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    int a, b;
		Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    b = sc.nextInt();

    if(a > b){
          System.out.println("A가 크다");
    } else if(a < b) {
          System.out.println("B가 크다");
      } else{
          System.out.println("A와 B는 같다");
      }
  }
}
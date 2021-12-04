
public class ParamidNestedLoop {

  public static void main(String[] args) {
    int rows = 10;

    for (int i = rows; i >= 1; --i) {
      for (int j = 1; j <= i; ++j) {
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}

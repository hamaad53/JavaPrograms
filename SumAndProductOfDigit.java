class SumAndProductOfDigit {
 
    
    static int getProduct(int n)
    {
        int product = 1;
 
        while (n != 0) {
            product = product * (n % 10);
            n = n / 10;
        }
 
        return product;
    }
  static int getSum(int n)
    {
        int sum = 0;
 
        while (n != 0) {
            sum = sum + (n % 10);
            n = n / 10;
        }
 
        return sum;
    }

    public static void main(String[] args)
    {
        int n = 2321;
        System.out.println("Product is");
        System.out.println(getProduct(n));
        System.out.println("Sum is");
        System.out.println(getSum(n));
    }
}

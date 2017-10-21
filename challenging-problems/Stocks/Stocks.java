public class Stocks {


  public static int get_max_profit(int[] stocks) {
    int average;
    int total = 0;
    int max_profit = 0;
    for (int i = 0; i < stocks.length; i++) {
      total += stocks[i];
    }

    average = total / stocks.length;
    System.out.println("AVERAGE: " + average);
    
    int[] bigIndecies = new int[stocks.length];
    int[] smallIndecies = new int[stocks.length];
    System.out.println("LENGHT: " + bigIndecies.length + " " + smallIndecies.length);

    int k = 0;
    int j = 0;
    
    for (int i = 0; i < stocks.length; i++) {
      if (stocks[i] <= average) {
        smallIndecies[k++] = i;
      } else {
        bigIndecies[j++] = i;
      }
    }

    for (int m = 0; m < smallIndecies.length; m++) {
        for (int n = 0; n < bigIndecies.length; n++) {
          if (smallIndecies[m] < bigIndecies[n]) {
            int profit = stocks[bigIndecies[n]] - stocks[smallIndecies[m]];
            if (profit > max_profit) {
              max_profit = profit;
            }
          }
        }
    }

    return max_profit;
  }

  public static void main(String[] args) {
    int[] test = {50, 10, 30, 40 , 90, 100};
    System.out.println(get_max_profit(test));
  }
}
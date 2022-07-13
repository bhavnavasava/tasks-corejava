package task1To10.task8;

public class RightShift {
	int count = 0;

	  void Rightshift(int arr[], int f, int l) {
	      int last = arr[l];
	      for (int j = l; j > f; j--) {
	          arr[j] = arr[j - 1];
	      }
	      arr[f] = last;
	  }

	  void alter(int arr[]) {
	      for (int i = 0; i < arr.length; i++) {
	          if (i % 2 == 0) {
	              if (arr[i] < 0) {
	                  for (int j = i + 1; j < arr.length; j++) {
	                      if (arr[j] > 0) {
	                          count = j;
	                          break;
	                      }
	                  }
	                  int l = count;
	                  if (count != 0) {
	                      Rightshift(arr, i, l);
	                  }
	                  count = 0;
	              }
	          } else {
	              if (arr[i] > 0) {
	                  for (int j = i + 1; j < arr.length; j++) {
	                      if (arr[j] < 0) {
	                          count = j;
	                          break;
	                      }
	                  }
	                  int l = count;
	                  if (count != 0) {
	                      Rightshift(arr, i, l);
	                  }
	                  count = 0;
	              }
	          }
	      }
	  }

	  void display(int arr[]) {
	      for (int i = 0; i < arr.length; i++) {
	          System.out.print(arr[i] + " ");
	      }
	      System.out.println();
	  }

	  public static void main(String[] args) {
	      int arr[] = { 1, 2, 3, 4, 5, -1, -2, -3, -4, -5, 8, 10, 88 };
	      int arr1[] = { 1, 3, -4, 5, -6, 23, -45, 67, 43, 44, 56, -90, 100 };
	      RightShift s = new RightShift();
	      System.out.println("______");
	      s.display(arr);
	      s.alter(arr);
	      s.display(arr);
	      System.out.println("______");
	      s.display(arr1);
	      s.alter(arr1);
	      s.display(arr1);
	      System.out.println("______");
	  }
}

}

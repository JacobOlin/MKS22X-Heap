public class MyHeap{
  private static void pushDown(int[]data,int size,int index) {
    while ((2*index+1 < size && data[2*index+1] > data[index]) || (2*index+2 < size && data[2*index+2] > data[index])) {
      if (2*index+2 < size && data[2*index+2] > data[2*index+1]) {
        swap(data,index,2*index+2);
        index = 2*index+2;
      }
      else{
        swap(data,index,2*index+1);
        index = 2*index+1;
      }
    }
  }

  private static void pushUp(int[]data,int index) {
    while (index > 0) {
      if (data[(index-1)/2] < data[index]) {
        swap(data,index,(index-1)/2);
        index = (index-1)/2;
      }
    }
  }

  private static void swap(int[]data,int ind1,int ind2) {
    int k = data[ind1];
    data[ind1] = data[ind2];
    data[ind2] = k;
  }

  public static void heapify(int[] data) {
    for (int i = data.length - 1;i >= 0;i -= 1) {
      pushDown(data,data.length,i);
    }
  }
}

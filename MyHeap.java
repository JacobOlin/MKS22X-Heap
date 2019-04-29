public class MyHeap{
  private static void pushDown(int[]data,int size,int index) {
    while ((2*index+1 < size && data[2*index+1] > data[index]) || (2*index+2 < size && data[2*index+2] > data[index])) {
      if (2*index+2 < size && data[2*index+2] > data[2*index+1]) {
        swap(data,index,2*index+2);
      }
      else{
        swap(data,index,2*index+1);
      }
    }
  }

  private static void swap(int[]data,int ind1,int ind2) {
    
  }
}

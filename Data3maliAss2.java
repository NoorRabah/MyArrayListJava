
    public class Data3maliAss2 {

        public static void main(String[] args) {
            MyArrayList<Integer> a=new MyArrayList<>();
            a.add(1);
            a.add(3);
            a.add(4);
            MyArrayList aCopy= new MyArrayList();
           aCopy= a.duplicate();
            System.out.println("Copied List: " + aCopy);
        
             MyArrayList<Integer> arr1=new MyArrayList<>();
            arr1.add(11);
            arr1.add(3);
            arr1.add(5);
            
             MyArrayList<Integer> arr2=new MyArrayList<>();
              arr2.add(2);
            arr2.add(3);
            arr2.add(4);
          MyArrayList resultMergeList=new MyArrayList();
            resultMergeList=resultMergeList.merge(arr1, arr2);
           System.out.println("if arr1=" +arr1+" arr2="+arr2+
                   " the merge List is ="+resultMergeList);
            
          } 
        }

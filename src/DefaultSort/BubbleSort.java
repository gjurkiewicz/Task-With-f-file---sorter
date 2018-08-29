package DefaultSort;

public class BubbleSort implements Sorter {

    @Override
    public void sortList() {
        if (Data.numberList.size()>1){

            for (int i=0; i<Data.numberList.size()-1; i++) {

                for (int j = 0; j < Data.numberList.size()-1; j++) {

                    if (Data.numberList.get(j)>(Data.numberList.get(j+1))) {
                        int temp = Data.numberList.get(j);
                        Data.numberList.set(j,Data.numberList.get(j+1));
                        Data.numberList.set(j+1,temp);
                    }
                }
            }
        }
    }
}







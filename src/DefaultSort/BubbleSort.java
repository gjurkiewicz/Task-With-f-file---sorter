package DefaultSort;

public class BubbleSort implements Sorter {

    @Override
    public void sortList() {
        if (Data.sortedNumberList.size()>1){

            for (int i=0; i<Data.sortedNumberList.size()-1; i++) {

                for (int j = 0; j < Data.sortedNumberList.size()-1; j++) {

                    if (Data.sortedNumberList.get(j)>(Data.sortedNumberList.get(j+1))) {
                        int temp = Data.sortedNumberList.get(j);
                        Data.sortedNumberList.set(j,Data.sortedNumberList.get(j+1));
                        Data.sortedNumberList.set(j+1,temp);
                    }
                }
            }
        }
    }
}







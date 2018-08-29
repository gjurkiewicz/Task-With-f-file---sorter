package DefaultSort;

public class SelectionSort implements SorterInterface{

    @Override
    public void sortList() {
        for (int i = 0; i <Data.sortedNumberList.size()-1 ; i++) {
            int min = i;

            for (int j = i+1; j < Data.sortedNumberList.size(); j++) {

                if (Data.sortedNumberList.get(i)>Data.sortedNumberList.get(j)) {
                    min = j;
                    int temp = Data.sortedNumberList.get(i);
                    Data.sortedNumberList.set(i, Data.sortedNumberList.get(j));
                    Data.sortedNumberList.set(j,temp);

                }
            }
        }
    }
}



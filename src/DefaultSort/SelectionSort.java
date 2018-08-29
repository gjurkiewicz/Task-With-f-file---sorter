package DefaultSort;

public class SelectionSort implements SorterInterface{

    @Override
    public void sortList() {
        for (int i = 0; i <Data.numberList.size()-1 ; i++) {
            int min = i;

            for (int j = i+1; j < Data.numberList.size(); j++) {

                if (Data.numberList.get(i)>Data.numberList.get(j)) {
                    min = j;
                    int temp = Data.numberList.get(i);
                    Data.numberList.set(i, Data.numberList.get(j));
                    Data.numberList.set(j,temp);

                }
            }
        }
    }
}



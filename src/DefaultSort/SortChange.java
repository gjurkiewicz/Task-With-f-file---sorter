package DefaultSort;

public class SortChange {
    static void sortChange(){
        if(Data.sortChange.get(0).equalsIgnoreCase("BO")) {
            System.out.println("Wykonano sortowanie bąbelkowe: ");
            new BubbleSort().sortList();
            System.out.println(Data.numberList);

        }else if (Data.sortChange.get(0).equalsIgnoreCase("CHO")) {
            System.out.println("Wykonano sortowanie przez wybieranie:  ");
            new SelectionSort().sortList();
            System.out.println(Data.numberList);

        }else {System.out.println("W pierwszej lini pliku nie ma wskazania na rodzaj sortowania" +
                " i lista nie została posortowana: ");
            System.out.println(Data.numberList);
        }
    }
}
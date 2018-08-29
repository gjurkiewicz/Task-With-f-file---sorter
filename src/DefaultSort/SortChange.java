package DefaultSort;

public class SortChange {
    static void sortChange(){
        if(Data.sortChange.get(0).equalsIgnoreCase("BO")) {
            System.out.println("Wykonano sortowanie bąbelkowe: ");
            new BubbleSort().sortList();

        }else if (Data.sortChange.get(0).equalsIgnoreCase("CHO")) {
            System.out.println("Wykonano sortowanie przez wybieranie: ");
            new SelectionSort().sortList();

        }else {System.out.println("W pierwszej lini pliku niema wskazania na rodzaj sortowania i lista nie została posortowana: ");
        }
    }
}
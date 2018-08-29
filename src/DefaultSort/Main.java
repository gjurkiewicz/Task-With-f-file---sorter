package DefaultSort;

public class Main {
    public static void main(String[] args) {

        FileRead.readNumbersFromFile();
        System.out.println("Nie posortowana lista liczb: ");
        System.out.println(Data.numberList);
        System.out.println();
        SortChange.sortChange();
    }
}

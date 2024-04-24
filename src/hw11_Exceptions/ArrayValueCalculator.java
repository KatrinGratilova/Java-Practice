package hw11_Exceptions;

public class ArrayValueCalculator {
    public static void main(String[] args) {
        try {
            int sum = doCalc(new String[][] {{"-1", "2", "3", "4"}, {"5", "6", "7", "8"},
                    {"9", "10", "11", "12"}, {"13", "14", "15", "16"}});
            System.out.println("Сума елементів масиву: " + sum);
        }
        catch (ArraySizeException e){
            System.err.println(e.getMessage());
        }
        catch (ArrayDataException e){
            System.err.println(e.getMessage() + e.getCause().getMessage());
        }
    }

    static int doCalc(String[][] numbers) throws ArraySizeException, ArrayDataException {
        if (numbers.length != 4) throw new ArraySizeException("Розмір масиву відмінний від 4х4!");
        for (String[] row : numbers) {
            if (row.length != 4)
                throw new ArraySizeException("Розмір масиву відмінний від 4х4!");
        }

        int sum = 0;
        // if we want to see where directly the problem occurs (indexes of array) and there are not many elements,
        // nested for loop doesn't decrease efficiency
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    sum += Integer.parseInt(numbers[i][j]);
                }
                catch (NumberFormatException e){  // parseInt throws NumberFormatException
                    throw new ArrayDataException("Невірне значення у комірці [" + i + "][" + j + "]- ", e);
                }
            }
        }
        return sum;
    }
}

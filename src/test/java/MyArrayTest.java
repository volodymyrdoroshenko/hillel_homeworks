import com.hillel.doroshenko.homeworks.homework13.MyArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MyArrayTest {
    MyArray myArray = new MyArray();

    @Test
    @DisplayName("Find average in array")
    public void testAverageArray() {
        int[] array = new int[]{1, 3, 4, 6, 8};
        Assertions.assertEquals(4.4, myArray.averageArray(array));
    }

    @Test
    @DisplayName("Check square array")
    public void testCheckSquareArray() {
        int[][] array = {
                {3, 4, 6, 7},
                {9, 4, 5, 9},
                {3, 3, 3, 7},
                {0, 4, 5, 6}
        };
        Assertions.assertTrue(myArray.checkSquareArray(array));
    }
}
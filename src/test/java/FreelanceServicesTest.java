import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.javaqa.javaqamvn.services.FreelanceServices;

public class FreelanceServicesTest {
    @ParameterizedTest
    @CsvSource({
            "3, 10000, 3000, 20000",
            "2, 100000, 60000, 150000"
    })

    public void testWithLowData(int expected, int income, int expenses, int threshold) {
        FreelanceServices FreelanceService = new FreelanceServices();

        //int expected = 3;
        int actual = FreelanceServices.calculate(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    /*@Test
    public void testWithHigherData() {
        FreelanceServices FreelanceService = new FreelanceServices();

        int expected = 2;
        int actual = FreelanceServices.calculate(100_000, 60_000, 150_000);

        Assertions.assertEquals(expected, actual);
    }*/

}

import com.company.Credit;
import com.company.Shedule;
import org.junit.Test;
import org.mockito.InjectMocks;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;


public class Test_Mockito
{
    @InjectMocks
    Credit credit = new Credit(10, 150000, 12.5);

    @Test
    public void testCalcNecessaryPayments()
    {
        credit.calcNecessaryPayments();
        ArrayList<Shedule> ExpectedNecessaryPayments = new ArrayList();
        ExpectedNecessaryPayments.add(new Shedule(1, 150000.0, 16562.5));
        ExpectedNecessaryPayments.add(new Shedule(2, 135000.0, 16406.25));
        ExpectedNecessaryPayments.add(new Shedule(3, 120000.0, 16250.0));
        ExpectedNecessaryPayments.add(new Shedule(4, 105000.0, 16093.75));
        ExpectedNecessaryPayments.add(new Shedule(5, 90000.0, 15937.5));
        ExpectedNecessaryPayments.add(new Shedule(6, 75000.0, 15781.25));
        ExpectedNecessaryPayments.add(new Shedule(7, 60000.0, 15625.0));
        ExpectedNecessaryPayments.add(new Shedule(8, 45000.0, 15468.75));
        ExpectedNecessaryPayments.add(new Shedule(9, 30000.0, 15312.5));
        ExpectedNecessaryPayments.add(new Shedule(10, 15000.0, 15156.25));
        assertEquals(ExpectedNecessaryPayments, credit.getNecessaryPayments());
    }
}
import static org.junit.Assert.*;

public class ProgramTest {

    @org.junit.Test
    public void mysqrt() {
        //Program program = new Program();
        double temp = 9;
        double actual = Program.mysqrt(temp);
        double expected = 3;
        assertEquals(expected, actual, 0);
    }

    @org.junit.Test
    public void mysquare() {
        //Program program = new Program();
        double temp = 9;
        double actual = Program.mysquare(temp);
        double expected = 81;
        assertEquals(expected, actual, 0);
    }

    @org.junit.Test
    public void mycos() {
        //Program program = new Program();
        double temp = 3.1413;
        double actual = Program.mycos(temp);
        double expected = -1;
        assertEquals(expected, actual, 0.01);
    }
}
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {printer = new Printer(100, 50);}

    @Test
    public void hasPaperCount(){
        assertEquals(100, printer.countPaper());
    }

    @Test
    public void hasTonerCount(){
        assertEquals(50, printer.countToner());
    }

    @Test
    public void willPrintIfPaperAvailable(){
        assertEquals(88 & 38, printer.printCopies(6, 2));
    }

    @Test
    public void willNotPrintIfNotAllPaperAvailable(){
        assertEquals(100 & 50, printer.printCopies(6, 37));
    }



//    @Test
//    public void isAbleToPrint(){
//        assertEquals(true, printer.canPrinterPrint(5, 20));
//    }
//
//    @Test
//    public void isNotAbleToPrint(){
//        assertEquals(false, printer.canPrinterPrint(10, 25));
//    }

}

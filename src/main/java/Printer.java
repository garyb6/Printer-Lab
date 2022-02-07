public class Printer {
    private int paper;
    private int toner;

    public Printer (int paper, int toner){
        this.paper = paper;
        this.toner = toner;
    }

    public int countPaper(){
        return this.paper;
    }

    public int countToner(){
        return this.toner;
    }

    public int printCopies(int pages, int copies){
        int sheets = pages * copies;
        if (this.paper >= sheets){
            return this.paper - sheets & this.toner - sheets;
        }
        return this.paper & this.toner;
    }

//    public boolean canPrinterPrint(int pages, int copies){
//        int sheets = pages * copies;
//        if (this.paper >= sheets){
//            return true;}
//        else {
//            return false;
//        }
//    }

}


package excercises.chapter_10;

public class Tax {
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;
    private int filingStatus;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;

    public Tax() {
        this(0, 1000);
    }

    public Tax(int filingStatus, double taxableIncome) {
        this.filingStatus = filingStatus;
        this.taxableIncome = taxableIncome;
        initialiseBracketsFor2001();
        initialiseRatesfor2001();
    }

    public double getTax() {
        for(int bracket = 4; bracket >= 0; bracket--) {
            if(taxableIncome < brackets[filingStatus][bracket]) {
                continue;
            } else {
                return taxableIncome * rates[bracket];
            }
        }
        return 0;
    }

    private void initialiseBracketsFor2001() {
        brackets = new int[4][5];
        brackets[0][0] = 27050;
        brackets[0][1] = 65550;
        brackets[0][2] = 136750;
        brackets[0][3] = 297350;
        brackets[0][4] = 297351;

        brackets[1][0] = 45200;
        brackets[1][1] = 109250;
        brackets[1][2] = 166500;
        brackets[1][3] = 297350;
        brackets[1][4] = 297351;

        brackets[2][0] = 22600;
        brackets[2][1] = 54625;
        brackets[2][2] = 83250;
        brackets[2][3] = 148675;
        brackets[2][4] = 148676;

        brackets[3][0] = 36250;
        brackets[3][1] = 93650;
        brackets[3][2] = 151650;
        brackets[3][3] = 297350;
        brackets[3][4] = 297351;
    }

    private void initialiseRatesfor2001() {
        rates = new double[5];
        rates[0] = 0.15;
        rates[1] = 0.275;
        rates[2] = 0.305;
        rates[3] = 0.355;
        rates[4] = 0.391;
    }

    public void setFilingStatus(int filingStatus) {
        this.filingStatus = filingStatus;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public int getFilingStatus() {
        return filingStatus;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public double[] getRates() {
        return rates;
    }

    public double getTaxableIncome() {
        return taxableIncome;
    }
}

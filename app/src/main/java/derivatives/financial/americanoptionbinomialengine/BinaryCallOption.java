package derivatives.financial.americanoptionbinomialengine;

/**
 * Created by casa on 4/11/14.
 */
public class BinaryCallOption extends AmericanOption {
    private double strike;

    public BinaryCallOption(BinomialModel model, double strike){
        super(model);
        this.strike = strike;
    }

    public BinaryCallOption(double spot, double rate, double dividendRate, double volatility, int numberOfSteps,
                              double timeToMaturity, double strike) {
        super(spot, rate, dividendRate, volatility, numberOfSteps, timeToMaturity);
        this.strike = strike;
    }

    @Override
    public double payoff(double spot){
        double __payoff = 0.0;

        if (spot >= this.strike) __payoff = 1.0;
        return __payoff;
    }
}

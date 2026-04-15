public class App {

    private static final double BASE_CHARGE = 100.0;
    private static final double RATE_PER_UNIT = 7.0;

    public double calculateBill(double units, boolean isPeakHour, int tariffLevel) {

        double tariffMultiplier = getTariffMultiplier(isPeakHour, tariffLevel);

        return BASE_CHARGE + (units * RATE_PER_UNIT * tariffMultiplier);
    }

    public double getTariffMultiplier(boolean isPeakHour, int tariffLevel) {

        double tariff = 1.0;

        if (isPeakHour) {
            tariff += 0.5;
        }

        if (tariffLevel > 5) {
            tariff += 0.5;
        }

        return tariff;
    }
}
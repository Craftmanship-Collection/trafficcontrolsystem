package src.algorithm;

public class DefaultTimingAlgorithm implements TimingAlgorithm {
    public int calculateDuration(int trafficDensity) {
        if (trafficDensity > 70) return 60;
        else if (trafficDensity > 40) return 40;
        else return 20;
    }
}

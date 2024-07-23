package review.abs;

import review.abs.camera.FactoryCam;
import review.abs.detector.AdvancedFireDetector;
import review.abs.detector.FireDetector;
import review.abs.reporter.NormalReporter;
import review.abs.reporter.VideoReporter;

public class ReviewInterface {
    public static void main(String[] args) {
        NormalReporter normalReporter = new NormalReporter();
        VideoReporter videoReporter = new VideoReporter();

        normalReporter.report();
        videoReporter.report();

        System.out.println("---------------------");

        FireDetector fireDetector = new FireDetector();
        AdvancedFireDetector advancedFireDetector = new AdvancedFireDetector();

        fireDetector.detect();
        advancedFireDetector.detect();

        System.out.println("---------------------");

        FactoryCam  factoryCam = new FactoryCam();

        factoryCam.setDetector(advancedFireDetector);
        factoryCam.setReporter(videoReporter);
    }
}

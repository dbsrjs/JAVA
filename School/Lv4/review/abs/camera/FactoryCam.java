package review.abs.camera;

import review.abs.detector.Detectable;
import review.abs.reporter.Reportable;

public class FactoryCam extends Camera implements Detectable, Reportable {

    Detectable detector;
    Reportable reporter;

    public void setDetector(Detectable detector) {
        detector.detect();
    }

    public void setReporter(Reportable reporter) {
        reporter.report();
    }
    @Override
    public void showMainFeature() {
        System.out.println("화재 감지");
    }

    @Override
    public void detect() {
        System.out.println("감지 기능을 수행합니다");
    }

    @Override
    public void report() {
        System.out.println("신고 기능을 수행합니다.");
    }


}

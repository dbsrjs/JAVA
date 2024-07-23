package review.abs.camera;

import review.abs.detector.Detectable;
import review.abs.reporter.Reportable;

public class SpeedCam extends Camera implements Detectable, Reportable {
    Detectable detector;
    Reportable reporter;

    public void setDetector(Detectable detector) {
        this.detector = detector;
    }

    public void setReporter(Reportable reporter) {
        this.reporter = reporter;
    }
    @Override
    public void showMainFeature() {
        System.out.println("속도 측정, 번호 인식");
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

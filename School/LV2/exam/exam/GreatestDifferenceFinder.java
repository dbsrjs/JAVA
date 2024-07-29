package exam;

import org.w3c.dom.ranges.Range;

public class GreatestDifferenceFinder {
    int greatestDifference(int[] intArray) {
        if (intArray.length < 2) {
            return 0;
        }

        int max = intArray[0];
        int min = intArray[0];

        for (int i = 0; i<intArray.length; i++) {
            if (max < intArray[i]) {
                max = intArray[i];
            }
            if (min > intArray[i]) {
                min = intArray[i];
            }
        }

        return max - min;
    }
}

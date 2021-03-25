import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BinarySearch {

    private static Logger logger = LoggerFactory.getLogger("logger");

    public int binarySearch(int[] mass, int start, int end, int target) {

        if (start > end) {
            logger.debug("find fail: no element");
            return -1;
        }

        int middleIndex = (start + end) / 2;

        logger.debug("binary search: \nMiddle Index = " + middleIndex + "\nstart index: " + start + "\nend index: " + end);

        if (target == mass[middleIndex]) {
            logger.debug("find success: target index: " + middleIndex);
            return middleIndex;
        } else if (target < mass[middleIndex]) {
            return binarySearch(mass, start, middleIndex - 1, target);
        } else {
            return binarySearch(mass, middleIndex + 1, end, target);
        }
    }
}

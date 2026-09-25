import java.util.Collections;
import java.util.PriorityQueue;

public class FindMedianFromDataStream {

    static class MedianFinder {

        PriorityQueue<Integer> maxHeap; // left half
        PriorityQueue<Integer> minHeap; // right half

        public MedianFinder() {

            maxHeap = new PriorityQueue<>(Collections.reverseOrder());

            minHeap = new PriorityQueue<>();
        }

        public void addNum(int num) {

            maxHeap.add(num);

            minHeap.add(maxHeap.poll());

            if (minHeap.size() > maxHeap.size()) {
                maxHeap.add(minHeap.poll());
            }
        }

        public double findMedian() {

            return maxHeap.size() > minHeap.size()
                    ? maxHeap.peek()
                    : (maxHeap.peek() + minHeap.peek()) / 2.0;
        }
    }

    public static void main(String[] args) {

        MedianFinder mf = new MedianFinder();

        mf.addNum(1);
        mf.addNum(2);

        System.out.println(mf.findMedian());

        mf.addNum(3);

        System.out.println(mf.findMedian());
    }
}
package excercises.chapter_09;

import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
        this.start();
    }

    public void start() {
        startTime = System.nanoTime();
    }

    public void stop() {
        endTime = System.nanoTime();
    }

    public long getElapsedTime() {
        return endTime - startTime;
    }
}

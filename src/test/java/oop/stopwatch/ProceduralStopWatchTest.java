package oop.stopwatch;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ProceduralStopWatchTest {

    private long expectedElapsedTime = 100l;
    @Test
    public void should_return_elapsed_milli_seconds() {

        ProceduralStopWatch stopWatch = new ProceduralStopWatch();
        stopWatch.nanoStartTime = System.nanoTime(); // start time millis
        doSomething();
        stopWatch.nanoStopTime = System.nanoTime(); // end time

        long elapsedTime = stopWatch.getNanoElapsedTime();
        assertThat( elapsedTime ).isGreaterThanOrEqualTo( expectedElapsedTime );
    }

    private void doSomething() {

        try {
            Thread.sleep( 100l );
        }
        catch ( InterruptedException e ) {
            throw new RuntimeException( e );
        }
    }
}
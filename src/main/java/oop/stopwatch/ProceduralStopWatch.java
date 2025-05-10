package oop.stopwatch;

/**
 * <pre>
 * 주시스템		: framework-web
 * 서브 시스템	: oop.stopwatch
 * 프로그램 ID	: ProceduralStopWatch
 * 프로그램 개요 	: 	
 *
 * 변경이력
 * ============================================================================
 * 1.0  5/10/25	:	yghee	-	신규생성
 * ============================================================================
 * </pre>
 */
 
public class ProceduralStopWatch {

    // 클래스 변수를 public으로 제공
    public long startTime;
    public long stopTime;
    public long nanoStartTime;
    public long nanoStopTime;
    public long getElapsedTime() {
        return stopTime - startTime;
    }

    public long getNanoElapsedTime() {
        return nanoStopTime - nanoStartTime;
    }


}

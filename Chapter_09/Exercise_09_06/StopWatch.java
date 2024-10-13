
package Exercise_09_06;

/**
 *
 * @author DejanD
 */
public class StopWatch {
    private long startTime;
    private long endTime;
    
    public StopWatch() {
        startTime = System.currentTimeMillis();
    }
    
    public void start(){
        startTime = System.currentTimeMillis();
    }
    public void stop(){
        endTime = System.currentTimeMillis();
    }
    public long getElapsedTime(){
        return this.endTime - this.startTime;
    }
    
    public long getStartTime(){
        return startTime;
    }
    public long getEndTime(){
        return endTime;
    }
    public void setStartTime(long startTime){
        this.startTime = startTime;
    }
    public void setEndTime(long endTime){
        this.endTime = endTime;
    }
}

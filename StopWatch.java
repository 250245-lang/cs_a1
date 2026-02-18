import java.time.Instant;

public class StopWatch{
    long startTime;
    long endTime;

    public StopWatch(){
        this.start();
    }

    void start(){
        this.startTime = Instant.now().toEpochMilli();
    }
    void stop(){
        this.endTime = Instant.now().toEpochMilli();
    }

    long getElapsedTime(){
        return this.endTime - this.startTime;
    }
}
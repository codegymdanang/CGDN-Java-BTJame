package B3_LopVaDoiTuongTrongJava.XayDungLopStopWatch;

import java.util.Date;

public class StopWatch {
    private Date startTime;
    private Date endTime;

    public StopWatch() {
        startTime = new Date();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public void start() {
        setStartTime(new Date());
    }
    public void stop(){
        setEndTime(new Date());
    }
    public long getElapsedTime() {
        return endTime.getTime() - startTime.getTime();
    }
}

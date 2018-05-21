package duanzu.entity;

import java.util.Date;

public class CheckInOutTimeArrange {
    private String timeId;

    private String houseId;

    private Date presetStartTime;

    private Date presetEndTime;

    private String remark;

    public String getTimeId() {
        return timeId;
    }

    public void setTimeId(String timeId) {
        this.timeId = timeId == null ? null : timeId.trim();
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId == null ? null : houseId.trim();
    }

    public Date getPresetStartTime() {
        return presetStartTime;
    }

    public void setPresetStartTime(Date presetStartTime) {
        this.presetStartTime = presetStartTime;
    }

    public Date getPresetEndTime() {
        return presetEndTime;
    }

    public void setPresetEndTime(Date presetEndTime) {
        this.presetEndTime = presetEndTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}
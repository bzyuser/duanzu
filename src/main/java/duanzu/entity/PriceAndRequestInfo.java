package duanzu.entity;

public class PriceAndRequestInfo {
    private String priceInfoId;

    private String houseId;

    private String dayPrice;

    private String weekPrice;

    private String cleanPrice;

    private String cashPledge;

    private String lessDay;

    private String moreDay;

    private String checkInStartTime;

    private String checkInEndTime;

    private String checkOutTime;

    private String remark1;

    public String getPriceInfoId() {
        return priceInfoId;
    }

    public void setPriceInfoId(String priceInfoId) {
        this.priceInfoId = priceInfoId == null ? null : priceInfoId.trim();
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId == null ? null : houseId.trim();
    }

    public String getDayPrice() {
        return dayPrice;
    }

    public void setDayPrice(String dayPrice) {
        this.dayPrice = dayPrice == null ? null : dayPrice.trim();
    }

    public String getWeekPrice() {
        return weekPrice;
    }

    public void setWeekPrice(String weekPrice) {
        this.weekPrice = weekPrice == null ? null : weekPrice.trim();
    }

    public String getCleanPrice() {
        return cleanPrice;
    }

    public void setCleanPrice(String cleanPrice) {
        this.cleanPrice = cleanPrice == null ? null : cleanPrice.trim();
    }

    public String getCashPledge() {
        return cashPledge;
    }

    public void setCashPledge(String cashPledge) {
        this.cashPledge = cashPledge == null ? null : cashPledge.trim();
    }

    public String getLessDay() {
        return lessDay;
    }

    public void setLessDay(String lessDay) {
        this.lessDay = lessDay == null ? null : lessDay.trim();
    }

    public String getMoreDay() {
        return moreDay;
    }

    public void setMoreDay(String moreDay) {
        this.moreDay = moreDay == null ? null : moreDay.trim();
    }

    public String getCheckInStartTime() {
        return checkInStartTime;
    }

    public void setCheckInStartTime(String checkInStartTime) {
        this.checkInStartTime = checkInStartTime == null ? null : checkInStartTime.trim();
    }

    public String getCheckInEndTime() {
        return checkInEndTime;
    }

    public void setCheckInEndTime(String checkInEndTime) {
        this.checkInEndTime = checkInEndTime == null ? null : checkInEndTime.trim();
    }

    public String getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(String checkOutTime) {
        this.checkOutTime = checkOutTime == null ? null : checkOutTime.trim();
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }
}
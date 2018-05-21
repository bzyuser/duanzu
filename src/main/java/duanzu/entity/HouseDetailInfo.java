package duanzu.entity;

public class HouseDetailInfo {
    private String detailId;

    private String houHouseId;

    private String houseId;

    private String homeNum;

    private String bedNum;

    private String availablePeopleNum;

    private String bedType;

    private String extraAddPeopleNum;

    private String toiletNum;

    private String toiletType;

    private String towerLevel;

    private String totalLevel;

    private String area;

    private String remark;

    public String getDetailId() {
        return detailId;
    }

    public void setDetailId(String detailId) {
        this.detailId = detailId == null ? null : detailId.trim();
    }

    public String getHouHouseId() {
        return houHouseId;
    }

    public void setHouHouseId(String houHouseId) {
        this.houHouseId = houHouseId == null ? null : houHouseId.trim();
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId == null ? null : houseId.trim();
    }

    public String getHomeNum() {
        return homeNum;
    }

    public void setHomeNum(String homeNum) {
        this.homeNum = homeNum == null ? null : homeNum.trim();
    }

    public String getBedNum() {
        return bedNum;
    }

    public void setBedNum(String bedNum) {
        this.bedNum = bedNum == null ? null : bedNum.trim();
    }

    public String getAvailablePeopleNum() {
        return availablePeopleNum;
    }

    public void setAvailablePeopleNum(String availablePeopleNum) {
        this.availablePeopleNum = availablePeopleNum == null ? null : availablePeopleNum.trim();
    }

    public String getBedType() {
        return bedType;
    }

    public void setBedType(String bedType) {
        this.bedType = bedType == null ? null : bedType.trim();
    }

    public String getExtraAddPeopleNum() {
        return extraAddPeopleNum;
    }

    public void setExtraAddPeopleNum(String extraAddPeopleNum) {
        this.extraAddPeopleNum = extraAddPeopleNum == null ? null : extraAddPeopleNum.trim();
    }

    public String getToiletNum() {
        return toiletNum;
    }

    public void setToiletNum(String toiletNum) {
        this.toiletNum = toiletNum == null ? null : toiletNum.trim();
    }

    public String getToiletType() {
        return toiletType;
    }

    public void setToiletType(String toiletType) {
        this.toiletType = toiletType == null ? null : toiletType.trim();
    }

    public String getTowerLevel() {
        return towerLevel;
    }

    public void setTowerLevel(String towerLevel) {
        this.towerLevel = towerLevel == null ? null : towerLevel.trim();
    }

    public String getTotalLevel() {
        return totalLevel;
    }

    public void setTotalLevel(String totalLevel) {
        this.totalLevel = totalLevel == null ? null : totalLevel.trim();
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}
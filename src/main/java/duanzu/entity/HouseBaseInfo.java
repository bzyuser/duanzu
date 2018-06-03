package duanzu.entity;

public class HouseBaseInfo {
    private String houseId;

    private String cityId;

    private String hostFamilyId;

    private String houseName;

    private String rentOutType;

    private String houseType;

    private String homeType;

    private String price;

    private String address;

    private String facility;

    private String houseDesc;

    private String traffic;

    private String rimDesc;

    private String other;

    private String hotLevel;

    private String status;

    private String time;

    private String remark;

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId == null ? null : houseId.trim();
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }

    public String getHostFamilyId() {
        return hostFamilyId;
    }

    public void setHostFamilyId(String hostFamilyId) {
        this.hostFamilyId = hostFamilyId == null ? null : hostFamilyId.trim();
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName == null ? null : houseName.trim();
    }

    public String getRentOutType() {
        return rentOutType;
    }

    public void setRentOutType(String rentOutType) {
        this.rentOutType = rentOutType == null ? null : rentOutType.trim();
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType == null ? null : houseType.trim();
    }

    public String getHomeType() {
        return homeType;
    }

    public void setHomeType(String homeType) {
        this.homeType = homeType == null ? null : homeType.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getFacility() {
        return facility;
    }

    public void setFacility(String facility) {
        this.facility = facility == null ? null : facility.trim();
    }

    public String getHouseDesc() {
        return houseDesc;
    }

    public void setHouseDesc(String houseDesc) {
        this.houseDesc = houseDesc == null ? null : houseDesc.trim();
    }

    public String getTraffic() {
        return traffic;
    }

    public void setTraffic(String traffic) {
        this.traffic = traffic == null ? null : traffic.trim();
    }

    public String getRimDesc() {
        return rimDesc;
    }

    public void setRimDesc(String rimDesc) {
        this.rimDesc = rimDesc == null ? null : rimDesc.trim();
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other == null ? null : other.trim();
    }

    public String getHotLevel() {
        return hotLevel;
    }

    public void setHotLevel(String hotLevel) {
        this.hotLevel = hotLevel == null ? null : hotLevel.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}
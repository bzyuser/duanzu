package duanzu.entity;

public class HousePictureUrl {
    private String housePictureUrlId;

    private String houseId;

    private String pictureType;

    private String pictureUrl;

    private String remark1;

    public String getHousePictureUrlId() {
        return housePictureUrlId;
    }

    public void setHousePictureUrlId(String housePictureUrlId) {
        this.housePictureUrlId = housePictureUrlId == null ? null : housePictureUrlId.trim();
    }

    public String getHouseId() {
        return houseId;
    }

    public void setHouseId(String houseId) {
        this.houseId = houseId == null ? null : houseId.trim();
    }

    public String getPictureType() {
        return pictureType;
    }

    public void setPictureType(String pictureType) {
        this.pictureType = pictureType == null ? null : pictureType.trim();
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl == null ? null : pictureUrl.trim();
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }
}
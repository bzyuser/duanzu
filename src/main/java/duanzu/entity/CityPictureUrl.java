package duanzu.entity;

public class CityPictureUrl {
    private String cityPictureUrlId;

    private String cityId;

    private String pictureName;

    private String pictureUrl;

    private String picDesc;

    private String remark1;

    public String getCityPictureUrlId() {
        return cityPictureUrlId;
    }

    public void setCityPictureUrlId(String cityPictureUrlId) {
        this.cityPictureUrlId = cityPictureUrlId == null ? null : cityPictureUrlId.trim();
    }

    public String getCityId() {
        return cityId;
    }

    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }

    public String getPictureName() {
        return pictureName;
    }

    public void setPictureName(String pictureName) {
        this.pictureName = pictureName == null ? null : pictureName.trim();
    }

    public String getPictureUrl() {
        return pictureUrl;
    }

    public void setPictureUrl(String pictureUrl) {
        this.pictureUrl = pictureUrl == null ? null : pictureUrl.trim();
    }

    public String getPicDesc() {
        return picDesc;
    }

    public void setPicDesc(String picDesc) {
        this.picDesc = picDesc == null ? null : picDesc.trim();
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }
}
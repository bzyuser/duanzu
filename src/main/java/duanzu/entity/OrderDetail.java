package duanzu.entity;

public class OrderDetail {
    private String orderDetailId;

    private String orderId;

    private String checkInTime;

    private String checkOutTime;

    private String checkInDays;

    private String checkInPeopleNum;

    private String totalPrice;

    private String name;

    private String idCard;

    private String phone;

    private String status;

    private String remark;

    public String getOrderDetailId() {
        return orderDetailId;
    }

    public void setOrderDetailId(String orderDetailId) {
        this.orderDetailId = orderDetailId == null ? null : orderDetailId.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getCheckInTime() {
        return checkInTime;
    }

    public void setCheckInTime(String checkInTime) {
        this.checkInTime = checkInTime == null ? null : checkInTime.trim();
    }

    public String getCheckOutTime() {
        return checkOutTime;
    }

    public void setCheckOutTime(String checkOutTime) {
        this.checkOutTime = checkOutTime == null ? null : checkOutTime.trim();
    }

    public String getCheckInDays() {
        return checkInDays;
    }

    public void setCheckInDays(String checkInDays) {
        this.checkInDays = checkInDays == null ? null : checkInDays.trim();
    }

    public String getCheckInPeopleNum() {
        return checkInPeopleNum;
    }

    public void setCheckInPeopleNum(String checkInPeopleNum) {
        this.checkInPeopleNum = checkInPeopleNum == null ? null : checkInPeopleNum.trim();
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice == null ? null : totalPrice.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}
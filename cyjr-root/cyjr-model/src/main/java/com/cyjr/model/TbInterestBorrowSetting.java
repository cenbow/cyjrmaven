package org.cyjr.model;

public class TbInterestBorrowSetting {
    private Integer id;

    private Integer borrowType;

    private Integer interestSettingId;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBorrowType() {
        return borrowType;
    }

    public void setBorrowType(Integer borrowType) {
        this.borrowType = borrowType;
    }

    public Integer getInterestSettingId() {
        return interestSettingId;
    }

    public void setInterestSettingId(Integer interestSettingId) {
        this.interestSettingId = interestSettingId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
package org.cyjr.model;

public class TbHongbaoBorrowSetting {
    private Integer id;

    private Integer borrowType;

    private Integer hongbaoSettingId;

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

    public Integer getHongbaoSettingId() {
        return hongbaoSettingId;
    }

    public void setHongbaoSettingId(Integer hongbaoSettingId) {
        this.hongbaoSettingId = hongbaoSettingId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
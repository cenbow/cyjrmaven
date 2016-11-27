package org.cyjr.model;

public class TbHongbaoBorrow {
    private Integer id;

    private Long hongbaoId;

    private Integer borrowType;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getHongbaoId() {
        return hongbaoId;
    }

    public void setHongbaoId(Long hongbaoId) {
        this.hongbaoId = hongbaoId;
    }

    public Integer getBorrowType() {
        return borrowType;
    }

    public void setBorrowType(Integer borrowType) {
        this.borrowType = borrowType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
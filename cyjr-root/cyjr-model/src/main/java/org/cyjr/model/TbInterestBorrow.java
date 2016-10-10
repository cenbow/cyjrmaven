package org.cyjr.model;

public class TbInterestBorrow {
    private Integer id;

    private Long interestId;

    private Integer borrowType;

    private Integer status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getInterestId() {
        return interestId;
    }

    public void setInterestId(Long interestId) {
        this.interestId = interestId;
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
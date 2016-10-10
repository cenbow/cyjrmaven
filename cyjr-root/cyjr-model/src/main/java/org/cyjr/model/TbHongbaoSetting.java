package org.cyjr.model;

import java.math.BigDecimal;

public class TbHongbaoSetting {
    private Integer id;

    private String name;

    private BigDecimal tenderRatio;

    private BigDecimal money;

    private String remark;

    private Integer status;

    private Integer type;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public BigDecimal getTenderRatio() {
        return tenderRatio;
    }

    public void setTenderRatio(BigDecimal tenderRatio) {
        this.tenderRatio = tenderRatio;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }
}
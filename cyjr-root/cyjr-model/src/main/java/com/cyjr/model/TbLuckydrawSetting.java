package org.cyjr.model;

import java.math.BigDecimal;

public class TbLuckydrawSetting {
    private Integer id;

    private Integer luckyGrade;

    private String gradeName;

    private String prizeName;

    private Integer total;

    private BigDecimal probability;

    private Integer usedNumber;

    private Integer isHongbao;

    private BigDecimal hongbaoMoney;

    private Integer isInterest;

    private BigDecimal interestMoney;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getLuckyGrade() {
        return luckyGrade;
    }

    public void setLuckyGrade(Integer luckyGrade) {
        this.luckyGrade = luckyGrade;
    }

    public String getGradeName() {
        return gradeName;
    }

    public void setGradeName(String gradeName) {
        this.gradeName = gradeName == null ? null : gradeName.trim();
    }

    public String getPrizeName() {
        return prizeName;
    }

    public void setPrizeName(String prizeName) {
        this.prizeName = prizeName == null ? null : prizeName.trim();
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public BigDecimal getProbability() {
        return probability;
    }

    public void setProbability(BigDecimal probability) {
        this.probability = probability;
    }

    public Integer getUsedNumber() {
        return usedNumber;
    }

    public void setUsedNumber(Integer usedNumber) {
        this.usedNumber = usedNumber;
    }

    public Integer getIsHongbao() {
        return isHongbao;
    }

    public void setIsHongbao(Integer isHongbao) {
        this.isHongbao = isHongbao;
    }

    public BigDecimal getHongbaoMoney() {
        return hongbaoMoney;
    }

    public void setHongbaoMoney(BigDecimal hongbaoMoney) {
        this.hongbaoMoney = hongbaoMoney;
    }

    public Integer getIsInterest() {
        return isInterest;
    }

    public void setIsInterest(Integer isInterest) {
        this.isInterest = isInterest;
    }

    public BigDecimal getInterestMoney() {
        return interestMoney;
    }

    public void setInterestMoney(BigDecimal interestMoney) {
        this.interestMoney = interestMoney;
    }
}
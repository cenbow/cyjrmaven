package org.cyjr.model;

public class TbLottery {
    private Integer id;

    private String userid;

    private String jiangpinname;

    private String addtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getJiangpinname() {
        return jiangpinname;
    }

    public void setJiangpinname(String jiangpinname) {
        this.jiangpinname = jiangpinname == null ? null : jiangpinname.trim();
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime == null ? null : addtime.trim();
    }
}
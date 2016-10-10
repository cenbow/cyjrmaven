package org.cyjr.model;

public class TbLinks {
    private Integer id;

    private String hrefname;

    private String hrefurl;

    private String addtime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHrefname() {
        return hrefname;
    }

    public void setHrefname(String hrefname) {
        this.hrefname = hrefname == null ? null : hrefname.trim();
    }

    public String getHrefurl() {
        return hrefurl;
    }

    public void setHrefurl(String hrefurl) {
        this.hrefurl = hrefurl == null ? null : hrefurl.trim();
    }

    public String getAddtime() {
        return addtime;
    }

    public void setAddtime(String addtime) {
        this.addtime = addtime == null ? null : addtime.trim();
    }
}
package org.cyjr.model;

public class TbAuthItemChild {
    private Integer id;

    private String parent;

    private String child;

    private String description;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getParent() {
        return parent;
    }

    public void setParent(String parent) {
        this.parent = parent == null ? null : parent.trim();
    }

    public String getChild() {
        return child;
    }

    public void setChild(String child) {
        this.child = child == null ? null : child.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}
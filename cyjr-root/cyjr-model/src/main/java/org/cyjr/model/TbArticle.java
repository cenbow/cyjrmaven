package org.cyjr.model;

public class TbArticle {
    private Integer id;

    private Integer siteId;

    private String name;

    private String littitle;

    private Integer status;

    private String litpic;

    private String flag;

    private String source;

    private String publish;

    private String isJump;

    private String author;

    private String jumpurl;

    private String summary;

    private Integer aOrder;

    private Integer hits;

    private Integer comment;

    private String isComment;

    private Integer userId;

    private Integer createdAt;

    private Integer updatedAt;

    private String content;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getSiteId() {
        return siteId;
    }

    public void setSiteId(Integer siteId) {
        this.siteId = siteId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLittitle() {
        return littitle;
    }

    public void setLittitle(String littitle) {
        this.littitle = littitle == null ? null : littitle.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getLitpic() {
        return litpic;
    }

    public void setLitpic(String litpic) {
        this.litpic = litpic == null ? null : litpic.trim();
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag == null ? null : flag.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getPublish() {
        return publish;
    }

    public void setPublish(String publish) {
        this.publish = publish == null ? null : publish.trim();
    }

    public String getIsJump() {
        return isJump;
    }

    public void setIsJump(String isJump) {
        this.isJump = isJump == null ? null : isJump.trim();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }

    public String getJumpurl() {
        return jumpurl;
    }

    public void setJumpurl(String jumpurl) {
        this.jumpurl = jumpurl == null ? null : jumpurl.trim();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary == null ? null : summary.trim();
    }

    public Integer getaOrder() {
        return aOrder;
    }

    public void setaOrder(Integer aOrder) {
        this.aOrder = aOrder;
    }

    public Integer getHits() {
        return hits;
    }

    public void setHits(Integer hits) {
        this.hits = hits;
    }

    public Integer getComment() {
        return comment;
    }

    public void setComment(Integer comment) {
        this.comment = comment;
    }

    public String getIsComment() {
        return isComment;
    }

    public void setIsComment(String isComment) {
        this.isComment = isComment == null ? null : isComment.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Integer createdAt) {
        this.createdAt = createdAt;
    }

    public Integer getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Integer updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}
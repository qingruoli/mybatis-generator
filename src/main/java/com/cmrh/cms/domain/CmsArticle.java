package com.cmrh.cms.domain;

import java.util.Date;

public class CmsArticle {
    private Long articleId;

    private Long operateId;

    private String articleType;

    private Long siteId;

    private String isSpecificTemplate;

    private Long specificTemplateId;

    private String articleTitle;

    private String subHeadline;

    private String subTitle;

    private String articlePublisher;

    private String via;

    private String viaUri;

    private Date publishedDate;

    private Long publishVersion;

    private Long prevPublishVersion;

    private String publishState;

    private String isLocked;

    private String createdUser;

    private Date createdDate;

    private Date updatedDate;

    private String updatedUser;

    private String isValid;
    
    private String logoPicture;

    private String articleOutline;

    public Long getArticleId() {
        return articleId;
    }

    public void setArticleId(Long articleId) {
        this.articleId = articleId;
    }

    public Long getOperateId() {
        return operateId;
    }

    public void setOperateId(Long operateId) {
        this.operateId = operateId;
    }

    public String getArticleType() {
        return articleType;
    }

    public void setArticleType(String articleType) {
        this.articleType = articleType == null ? null : articleType.trim();
    }

    public Long getSiteId() {
        return siteId;
    }

    public void setSiteId(Long siteId) {
        this.siteId = siteId;
    }

    public String getIsSpecificTemplate() {
        return isSpecificTemplate;
    }

    public void setIsSpecificTemplate(String isSpecificTemplate) {
        this.isSpecificTemplate = isSpecificTemplate == null ? null : isSpecificTemplate.trim();
    }

    public Long getSpecificTemplateId() {
        return specificTemplateId;
    }

    public void setSpecificTemplateId(Long specificTemplateId) {
        this.specificTemplateId = specificTemplateId;
    }

    public String getArticleTitle() {
        return articleTitle;
    }

    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle == null ? null : articleTitle.trim();
    }

    public String getSubHeadline() {
        return subHeadline;
    }

    public void setSubHeadline(String subHeadline) {
        this.subHeadline = subHeadline == null ? null : subHeadline.trim();
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle == null ? null : subTitle.trim();
    }

    public String getArticlePublisher() {
        return articlePublisher;
    }

    public void setArticlePublisher(String articlePublisher) {
        this.articlePublisher = articlePublisher == null ? null : articlePublisher.trim();
    }

    public String getVia() {
        return via;
    }

    public void setVia(String via) {
        this.via = via == null ? null : via.trim();
    }

    public String getViaUri() {
        return viaUri;
    }

    public void setViaUri(String viaUri) {
        this.viaUri = viaUri == null ? null : viaUri.trim();
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public Long getPublishVersion() {
        return publishVersion;
    }

    public void setPublishVersion(Long publishVersion) {
        this.publishVersion = publishVersion;
    }

    public Long getPrevPublishVersion() {
        return prevPublishVersion;
    }

    public void setPrevPublishVersion(Long prevPublishVersion) {
        this.prevPublishVersion = prevPublishVersion;
    }

    public String getPublishState() {
        return publishState;
    }

    public void setPublishState(String publishState) {
        this.publishState = publishState == null ? null : publishState.trim();
    }

    public String getIsLocked() {
        return isLocked;
    }

    public void setIsLocked(String isLocked) {
        this.isLocked = isLocked == null ? null : isLocked.trim();
    }

    public String getCreatedUser() {
        return createdUser;
    }

    public void setCreatedUser(String createdUser) {
        this.createdUser = createdUser == null ? null : createdUser.trim();
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    public Date getUpdatedDate() {
        return updatedDate;
    }

    public void setUpdatedDate(Date updatedDate) {
        this.updatedDate = updatedDate;
    }

    public String getUpdatedUser() {
        return updatedUser;
    }

    public void setUpdatedUser(String updatedUser) {
        this.updatedUser = updatedUser == null ? null : updatedUser.trim();
    }

    public String getIsValid() {
        return isValid;
    }

    public void setIsValid(String isValid) {
        this.isValid = isValid == null ? null : isValid.trim();
    }
    public String getLogoPicture() {
        return logoPicture;
    }

    public void setLogoPicture(String logoPicture) {
        this.logoPicture = logoPicture == null ? null : logoPicture.trim();
    }

    public String getArticleOutline() {
        return articleOutline;
    }

    public void setArticleOutline(String articleOutline) {
        this.articleOutline = articleOutline == null ? null : articleOutline.trim();
    }
}
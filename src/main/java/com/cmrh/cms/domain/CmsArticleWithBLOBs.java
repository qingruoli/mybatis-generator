package com.cmrh.cms.domain;

public class CmsArticleWithBLOBs extends CmsArticle {

    private String articleContent;

    public String getArticleContent() {
        return articleContent;
    }

    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent == null ? null : articleContent.trim();
    }
}
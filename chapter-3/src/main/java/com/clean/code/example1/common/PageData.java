package com.clean.code.example1.common;

/**
 * Model class for the HTML content of a page.
 *
 * @author Sonya
 */
public class PageData {

    private static final String TEST_PAGE = "Test";

    private String content;

    private String html;

    private WikiPage wikiPage;

    /**
     * Default constructor of {@link PageData}
     */
    public PageData() {
        // default empty constructor
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getHtml() {
        return this.html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public WikiPage getWikiPage() {
        return wikiPage;
    }

    public void setWikiPage(WikiPage wikiPage) {
        this.wikiPage = wikiPage;
    }

    public boolean hasAttribute(final String test) {
        return PageData.TEST_PAGE.equals(test);
    }

    @Override
    public String toString() {
        return "PageData{" +
                "content='" + content + '\'' +
                ", html='" + html + '\'' +
                ", wikiPage=" + wikiPage +
                '}';
    }
}

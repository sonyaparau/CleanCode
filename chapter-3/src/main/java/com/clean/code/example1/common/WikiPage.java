package com.clean.code.example1.common;

/**
 * Model class for an HTML class.
 *
 * @author Sonya
 */
public class WikiPage {

    private PageCrawler pageCrawler;

    private WikiPagePath wikiPagePath;

    /**
     * Default constructor of {@link WikiPage}
     */
    public WikiPage() {
        // default empty constructor
    }

    public PageCrawler getPageCrawler() {
        return pageCrawler;
    }

    public void setPageCrawler(PageCrawler pageCrawler) {
        this.pageCrawler = pageCrawler;
    }

    public WikiPagePath getWikiPagePath() {
        return wikiPagePath;
    }

    public void setWikiPagePath(WikiPagePath wikiPagePath) {
        this.wikiPagePath = wikiPagePath;
    }

    @Override
    public String toString() {
        return "WikiPage{" +
                "pageCrawler=" + pageCrawler +
                "wikiPagePath=" + wikiPagePath +
                '}';
    }
}

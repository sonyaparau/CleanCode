package com.clean.code.example1.common;

/**
 * Page crawler class.
 *
 * @author Sonya
 */
public class PageCrawler {

    /**
     * Gets the full path of a given {@link WikiPage}.
     *
     * @param wikiPage a given {@link WikiPage}
     * @return the corresponding {@link WikiPagePath}
     */
    public WikiPagePath getFullPath(final WikiPage wikiPage) {
        return wikiPage.getWikiPagePath();
    }
}

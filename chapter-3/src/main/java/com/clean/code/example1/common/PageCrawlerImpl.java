package com.clean.code.example1.common;

/**
 * Implementation of a {@link PageCrawler}.
 *
 * @author Sonya
 */
public class PageCrawlerImpl {

    /**
     * Private empty constructor.
     */
    private PageCrawlerImpl() {
        // default empty constructor
    }

    /**
     * Gets the inherited page of given page based on a given {@link SuiteResponder}.
     *
     * @param suiteSetupName a given suite responder
     * @param wikiPage       a given HTML page
     * @return the inherited page of type {@link WikiPage}
     */
    public static WikiPage getInheritedPage(SuiteResponder suiteSetupName, WikiPage wikiPage) {
        final WikiPagePath inheritedPagePath = new WikiPagePath();
        inheritedPagePath.setPath(suiteSetupName.name());

        final WikiPage inheritedPage = new WikiPage();
        inheritedPage.setWikiPagePath(inheritedPagePath);
        inheritedPage.setPageCrawler(wikiPage.getPageCrawler());

        return inheritedPage;
    }
}

package com.clean.code.example1.refactored_code;

import com.clean.code.example1.common.*;
import com.clean.code.example1.intial_code.*;

/**
 * Refactored implementation of {@link HtmlUtil}.
 *
 * @author Sonya
 */
public class HtmlUtilRefactored {

    private static final String NEW_LINE = "\n";

    /**
     * After the refactoring, the public method can now be read as a brief paragraph:
     * To renderPageWithSetupsAndTeardowns, we check to see whether the page is a test page and if so, we include the
     * setups and teardowns. In either case, we render the page in HTML.
     *
     * @param pageData the given HTML Page
     * @param isSuite  flag which indicates a suite page
     * @return the rendered page in HTML
     */
    public static String renderPageWithSetupsAndTeardowns(final PageData pageData, final boolean isSuite) {
        if (isTestPage(pageData)) {
            includeSetupAndTeardownPages(pageData, isSuite);
        }
        return pageData.getHtml();
    }

    private static boolean isTestPage(final PageData pageData) {
        return pageData.hasAttribute("Test");
    }

    private static void includeSetupAndTeardownPages(final PageData pageData, final boolean isSuite) {
        final WikiPage testPage = pageData.getWikiPage();
        final StringBuilder newPageContent = new StringBuilder();
        includeSetupPages(testPage, newPageContent, isSuite);
        newPageContent.append(pageData.getContent());
        includeTeardownPages(testPage, newPageContent, isSuite);
        pageData.setContent(newPageContent.toString());
    }

    private static void includeTeardownPages(final WikiPage testPage, final StringBuilder newPageContent,
                                             final boolean isSuite) {
        final WikiPage tearDown = PageCrawlerImpl.getInheritedPage(SuiteResponder.TEAR_DOWN, testPage);
        if (tearDown != null) {
            newPageContent.append(NEW_LINE);
            includeTeardownPage(testPage, newPageContent, tearDown);
        }
        if (isSuite) {
            final WikiPage suiteTeardown = PageCrawlerImpl.getInheritedPage(SuiteResponder.SUITE_TEARDOWN_NAME,
                    testPage);
            if (suiteTeardown != null) {
                includeTeardownPage(testPage, newPageContent, suiteTeardown);
            }
        }
    }

    private static void includeSetupPages(final WikiPage testPage, final StringBuilder newPageContent,
                                          final boolean isSuite) {
        if (isSuite) {
            final WikiPage suiteSetup = PageCrawlerImpl.getInheritedPage(SuiteResponder.SUITE_SETUP_NAME, testPage);
            if (suiteSetup != null) {
                includeSetupPage(newPageContent, suiteSetup);
            }
        }

        final WikiPage setup = PageCrawlerImpl.getInheritedPage(SuiteResponder.SETUP_NAME, testPage);
        if (setup != null) {
            includeSetupPage(newPageContent, setup);
        }

    }

    private static void includeTeardownPage(final WikiPage testPage, final StringBuilder newPageContent,
                                            final WikiPage tearDown) {
        final String tearDownPathName = PathParser.render(testPage.getPageCrawler().getFullPath(tearDown));
        newPageContent.append("!include -teardown .")
                .append(tearDownPathName)
                .append(NEW_LINE);
    }

    private static void includeSetupPage(final StringBuilder newPageContent, final WikiPage setup) {
        final String pagePathName = PathParser.render(setup.getPageCrawler().getFullPath(setup));
        newPageContent.append("!include -setup .")
                .append(pagePathName)
                .append(NEW_LINE);
    }


}

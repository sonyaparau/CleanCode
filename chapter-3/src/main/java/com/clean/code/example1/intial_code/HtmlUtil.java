package com.clean.code.example1.intial_code;

import com.clean.code.example1.common.*;

/**
 * Example of class containing a long method having duplicated code, lots of odd strings, and many strange and not
 * obvious data types and APIs. Also, the method has more than one level of abstraction.
 *
 * @author Sonya
 */
public class HtmlUtil {

    public static String testableHtml(PageData pageData, boolean includeSuiteSetup) throws Exception {
        WikiPage wikiPage = pageData.getWikiPage();
        StringBuffer buffer = new StringBuffer();
        if (pageData.hasAttribute("Test")) {
            if (includeSuiteSetup) {
                WikiPage suiteSetup = PageCrawlerImpl.getInheritedPage(SuiteResponder.SUITE_SETUP_NAME, wikiPage);
                if (suiteSetup != null) {
                    WikiPagePath pagePath = suiteSetup.getPageCrawler().getFullPath(suiteSetup);
                    String pagePathName = PathParser.render(pagePath);
                    buffer.append("!include -setup .")
                            .append(pagePathName)
                            .append("\n");
                }
            }
            WikiPage setup = PageCrawlerImpl.getInheritedPage(SuiteResponder.SETUP_NAME, wikiPage);
            if (setup != null) {
                WikiPagePath setupPath = wikiPage.getPageCrawler().getFullPath(setup);
                String setupPathName = PathParser.render(setupPath);
                buffer.append("!include -setup .")
                        .append(setupPathName)
                        .append("\n");

            }

        }
        buffer.append(pageData.getContent());
        if (pageData.hasAttribute("Test")) {
            WikiPage tearDown = PageCrawlerImpl.getInheritedPage(SuiteResponder.TEAR_DOWN, wikiPage);
            if (tearDown != null) {
                WikiPagePath tearDownPath = wikiPage.getPageCrawler().getFullPath(tearDown);
                String tearDownPathName = PathParser.render(tearDownPath);
                buffer.append("\n")
                        .append("!include -teardown .")
                        .append(tearDownPathName)
                        .append("\n");
            }
            if (includeSuiteSetup) {
                WikiPage suiteTeardown = PageCrawlerImpl.getInheritedPage(SuiteResponder.SUITE_TEARDOWN_NAME, wikiPage);
                if (suiteTeardown != null) {
                    WikiPagePath pagePath = suiteTeardown.getPageCrawler().getFullPath(suiteTeardown);
                    String pagePathName = PathParser.render(pagePath);
                    buffer.append("!include -teardown .")
                            .append(pagePathName)
                            .append("\n");
                }
            }
        }
        pageData.setContent(buffer.toString());
        return pageData.getHtml();
    }
}

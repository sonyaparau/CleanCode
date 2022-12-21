package com.clean.code.example1.common;

/**
 * Handles the parsing of the page's path.
 *
 * @author Sonya
 */
public class PathParser {

    /**
     * Private default constructor.
     */
    private PathParser() {
        // default empty constructor
    }

    /**
     * Renders a {@link WikiPage}.
     *
     * @param pagePath the given path of a page
     * @return the rendered content of the page
     */
    public static String render(final WikiPagePath pagePath) {
        return pagePath.toString();
    }
}

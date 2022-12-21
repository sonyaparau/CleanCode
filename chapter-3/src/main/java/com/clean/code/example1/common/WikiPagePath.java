package com.clean.code.example1.common;

/**
 * Model class for the path of a HTML page.
 *
 * @author Sonya
 */
public class WikiPagePath {

    private String path;

    /**
     * Default constructor of {@link WikiPagePath}
     */
    public WikiPagePath() {
        // default empty constructor
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "WikiPagePath{" +
                "path='" + path + '\'' +
                '}';
    }
}

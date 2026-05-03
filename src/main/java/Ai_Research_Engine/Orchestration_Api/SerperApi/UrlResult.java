package Ai_Research_Engine.Orchestration_Api.SerperApi;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UrlResult {
    private int position;
    private String title;
    private String link;
    private String snippet;

    @JsonProperty("displayed_link")
    private String displayedLink;

    @Override
    public String toString() {
        return "UrlResult{" +
                "position=" + position +
                ", title='" + title + '\'' +
                ", link='" + link + '\'' +
                ", snippet='" + snippet + '\'' +
                ", displayedLink='" + displayedLink + '\'' +
                '}';
    }

    public UrlResult() {
    }

    public UrlResult(int position, String title, String link, String snippet, String displayedLink) {
        this.position = position;
        this.title = title;
        this.link = link;
        this.snippet = snippet;
        this.displayedLink = displayedLink;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getSnippet() {
        return snippet;
    }

    public void setSnippet(String snippet) {
        this.snippet = snippet;
    }

    public String getDisplayedLink() {
        return displayedLink;
    }

    public void setDisplayedLink(String displayedLink) {
        this.displayedLink = displayedLink;
    }
}

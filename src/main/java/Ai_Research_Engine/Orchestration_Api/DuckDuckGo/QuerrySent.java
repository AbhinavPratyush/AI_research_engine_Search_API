package Ai_Research_Engine.Orchestration_Api.DuckDuckGo;

import lombok.Builder;

public class QuerrySent {
    // Required: The search engine (e.g., "google_light")
    private String engine;

    // Required: The search keywords
    private String q;

    // Required: Your SerpApi Key
    private String apiKey;

    // Optional: Number of results (up to 100 for Google Light)
    @Builder.Default
    private int m = 100;

    // Optional: Offset for pagination (0 for first page)
    @Builder.Default
    private int start = 0;

    // Optional: Localization (e.g., "us" for United States)
    private String kl;


    public QuerrySent(String engine, String q, String apiKey, int m, int start, String kl) {
        this.engine = engine;
        this.q = q;
        this.apiKey = apiKey;
        this.m = m;
        this.start = start;
        this.kl = kl;
    }

    public QuerrySent() {
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getQ() {
        return q;
    }

    public void setQ(String q) {
        this.q = q;
    }

    public String getApiKey() {
        return apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    public int getM() {
        return m;
    }

    public void setM(int m) {
        this.m = m;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public String getKl() {
        return kl;
    }

    public void setKl(String kl) {
        this.kl = kl;
    }
}

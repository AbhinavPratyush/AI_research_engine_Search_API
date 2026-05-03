package Ai_Research_Engine.Orchestration_Api.SerperApi;

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
    private int num = 100;

    // Optional: Offset for pagination (0 for first page)
    @Builder.Default
    private int start = 0;

    // Optional: Localization (e.g., "us" for United States)
    private String gl;

    // Optional: Language (e.g., "en" for English)
    private String hl;

    //location requested India
    private String location_requested;

    //location_used India
    private String location_used;


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

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public String getGl() {
        return gl;
    }

    public void setGl(String gl) {
        this.gl = gl;
    }

    public String getHl() {
        return hl;
    }

    public void setHl(String hl) {
        this.hl = hl;
    }

    public String getLocation_requested() {
        return location_requested;
    }

    public void setLocation_requested(String location_requested) {
        this.location_requested = location_requested;
    }

    public String getLocation_used() {
        return location_used;
    }

    public void setLocation_used(String location_used) {
        this.location_used = location_used;
    }

    //constructor
    public QuerrySent() {
    }

    public QuerrySent(String engine,
                      String q,
                      String apiKey,
                      int num,
                      int start,
                      String gl,
                      String hl,
                      String location_requested,
                      String location_used) {
        this.engine = engine;
        this.q = q;
        this.apiKey = apiKey;
        this.num = num;
        this.start = start;
        this.gl = gl;
        this.hl = hl;
        this.location_requested = location_requested;
        this.location_used = location_used;
    }
}

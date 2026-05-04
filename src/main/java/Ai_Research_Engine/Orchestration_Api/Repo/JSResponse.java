package Ai_Research_Engine.Orchestration_Api.Repo;

import java.util.List;

public class JSResponse {
    List<UrlSentForRanking> sendToJs;

    public JSResponse(List<UrlSentForRanking> sendToJs) {
        this.sendToJs = sendToJs;
    }

    public List<UrlSentForRanking> getSendToJs() {
        return sendToJs;
    }

    public void setSendToJs(List<UrlSentForRanking> sendToJs) {
        this.sendToJs = sendToJs;
    }
}

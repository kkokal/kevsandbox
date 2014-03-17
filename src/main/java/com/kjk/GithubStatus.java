package com.kjk;

import org.codehaus.jackson.annotate.JsonProperty;

public class GithubStatus {
    private String status;
    private String lastUpdated;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("last_updated")
    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}

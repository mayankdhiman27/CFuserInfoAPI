package com.gfg.consumerest.consumeRESTCF.user;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "lastName",
        "country",
        "lastOnlineTimeSeconds",
        "city",
        "rating",
        "friendOfCount",
        "titlePhoto",
        "handle",
        "avatar",
        "firstName",
        "contribution",
        "organization",
        "rank",
        "maxRating",
        "registrationTimeSeconds",
        "maxRank"
})
public class Result {

    @JsonProperty("lastName")
    private String lastName;
    @JsonProperty("country")
    private String country;
    @JsonProperty("lastOnlineTimeSeconds")
    private Long lastOnlineTimeSeconds;
    @JsonProperty("city")
    private String city;
    @JsonProperty("rating")
    private Long rating;
    @JsonProperty("friendOfCount")
    private Long friendOfCount;
    @JsonProperty("titlePhoto")
    private String titlePhoto;
    @JsonProperty("handle")
    private String handle;
    @JsonProperty("avatar")
    private String avatar;
    @JsonProperty("firstName")
    private String firstName;
    @JsonProperty("contribution")
    private Long contribution;
    @JsonProperty("organization")
    private String organization;
    @JsonProperty("rank")
    private String rank;
    @JsonProperty("maxRating")
    private Long maxRating;
    @JsonProperty("registrationTimeSeconds")
    private Long registrationTimeSeconds;
    @JsonProperty("maxRank")
    private String maxRank;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("lastName")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("lastName")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("country")
    public String getCountry() {
        return country;
    }

    @JsonProperty("country")
    public void setCountry(String country) {
        this.country = country;
    }

    @JsonProperty("lastOnlineTimeSeconds")
    public Long getLastOnlineTimeSeconds() {
        return lastOnlineTimeSeconds;
    }

    @JsonProperty("lastOnlineTimeSeconds")
    public void setLastOnlineTimeSeconds(Long lastOnlineTimeSeconds) {
        this.lastOnlineTimeSeconds = lastOnlineTimeSeconds;
    }

    @JsonProperty("city")
    public String getCity() {
        return city;
    }

    @JsonProperty("city")
    public void setCity(String city) {
        this.city = city;
    }

    @JsonProperty("rating")
    public Long getRating() {
        return rating;
    }

    @JsonProperty("rating")
    public void setRating(Long rating) {
        this.rating = rating;
    }

    @JsonProperty("friendOfCount")
    public Long getFriendOfCount() {
        return friendOfCount;
    }

    @JsonProperty("friendOfCount")
    public void setFriendOfCount(Long friendOfCount) {
        this.friendOfCount = friendOfCount;
    }

    @JsonProperty("titlePhoto")
    public String getTitlePhoto() {
        return titlePhoto;
    }

    @JsonProperty("titlePhoto")
    public void setTitlePhoto(String titlePhoto) {
        this.titlePhoto = titlePhoto;
    }

    @JsonProperty("handle")
    public String getHandle() {
        return handle;
    }

    @JsonProperty("handle")
    public void setHandle(String handle) {
        this.handle = handle;
    }

    @JsonProperty("avatar")
    public String getAvatar() {
        return avatar;
    }

    @JsonProperty("avatar")
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    @JsonProperty("firstName")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("firstName")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("contribution")
    public Long getContribution() {
        return contribution;
    }

    @JsonProperty("contribution")
    public void setContribution(Long contribution) {
        this.contribution = contribution;
    }

    @JsonProperty("organization")
    public String getOrganization() {
        return organization;
    }

    @JsonProperty("organization")
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    @JsonProperty("rank")
    public String getRank() {
        return rank;
    }

    @JsonProperty("rank")
    public void setRank(String rank) {
        this.rank = rank;
    }

    @JsonProperty("maxRating")
    public Long getMaxRating() {
        return maxRating;
    }

    @JsonProperty("maxRating")
    public void setMaxRating(Long maxRating) {
        this.maxRating = maxRating;
    }

    @JsonProperty("registrationTimeSeconds")
    public Long getRegistrationTimeSeconds() {
        return registrationTimeSeconds;
    }

    @JsonProperty("registrationTimeSeconds")
    public void setRegistrationTimeSeconds(Long registrationTimeSeconds) {
        this.registrationTimeSeconds = registrationTimeSeconds;
    }

    @JsonProperty("maxRank")
    public String getMaxRank() {
        return maxRank;
    }

    @JsonProperty("maxRank")
    public void setMaxRank(String maxRank) {
        this.maxRank = maxRank;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}

package ds.mygoogleimage.model.responsemodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Metatag {

    @SerializedName("og:title")
    @Expose
    private String ogTitle;
    @SerializedName("twitter:card")
    @Expose
    private String twitterCard;
    @SerializedName("twitter:site")
    @Expose
    private String twitterSite;
    @SerializedName("twitter:title")
    @Expose
    private String twitterTitle;
    @SerializedName("og:image")
    @Expose
    private String ogImage;
    @SerializedName("twitter:image")
    @Expose
    private String twitterImage;
    @SerializedName("og:image:width")
    @Expose
    private String ogImageWidth;
    @SerializedName("og:image:height")
    @Expose
    private String ogImageHeight;
    @SerializedName("og:url")
    @Expose
    private String ogUrl;
    @SerializedName("og:type")
    @Expose
    private String ogType;
    @SerializedName("og:description")
    @Expose
    private String ogDescription;
    @SerializedName("twitter:description")
    @Expose
    private String twitterDescription;
    @SerializedName("viewport")
    @Expose
    private String viewport;
    @SerializedName("apple-itunes-app")
    @Expose
    private String appleItunesApp;
    @SerializedName("apple-mobile-web-app-title")
    @Expose
    private String appleMobileWebAppTitle;
    @SerializedName("application-name")
    @Expose
    private String applicationName;
    @SerializedName("google")
    @Expose
    private String google;
    @SerializedName("mobile-web-app-capable")
    @Expose
    private String mobileWebAppCapable;
    @SerializedName("theme-color")
    @Expose
    private String themeColor;
    @SerializedName("og:locale")
    @Expose
    private String ogLocale;
    @SerializedName("og:site_name")
    @Expose
    private String ogSiteName;

    public String getOgTitle() {
        return ogTitle;
    }

    public void setOgTitle(String ogTitle) {
        this.ogTitle = ogTitle;
    }

    public String getTwitterCard() {
        return twitterCard;
    }

    public void setTwitterCard(String twitterCard) {
        this.twitterCard = twitterCard;
    }

    public String getTwitterSite() {
        return twitterSite;
    }

    public void setTwitterSite(String twitterSite) {
        this.twitterSite = twitterSite;
    }

    public String getTwitterTitle() {
        return twitterTitle;
    }

    public void setTwitterTitle(String twitterTitle) {
        this.twitterTitle = twitterTitle;
    }

    public String getOgImage() {
        return ogImage;
    }

    public void setOgImage(String ogImage) {
        this.ogImage = ogImage;
    }

    public String getTwitterImage() {
        return twitterImage;
    }

    public void setTwitterImage(String twitterImage) {
        this.twitterImage = twitterImage;
    }

    public String getOgImageWidth() {
        return ogImageWidth;
    }

    public void setOgImageWidth(String ogImageWidth) {
        this.ogImageWidth = ogImageWidth;
    }

    public String getOgImageHeight() {
        return ogImageHeight;
    }

    public void setOgImageHeight(String ogImageHeight) {
        this.ogImageHeight = ogImageHeight;
    }

    public String getOgUrl() {
        return ogUrl;
    }

    public void setOgUrl(String ogUrl) {
        this.ogUrl = ogUrl;
    }

    public String getOgType() {
        return ogType;
    }

    public void setOgType(String ogType) {
        this.ogType = ogType;
    }

    public String getOgDescription() {
        return ogDescription;
    }

    public void setOgDescription(String ogDescription) {
        this.ogDescription = ogDescription;
    }

    public String getTwitterDescription() {
        return twitterDescription;
    }

    public void setTwitterDescription(String twitterDescription) {
        this.twitterDescription = twitterDescription;
    }

    public String getViewport() {
        return viewport;
    }

    public void setViewport(String viewport) {
        this.viewport = viewport;
    }

    public String getAppleItunesApp() {
        return appleItunesApp;
    }

    public void setAppleItunesApp(String appleItunesApp) {
        this.appleItunesApp = appleItunesApp;
    }

    public String getAppleMobileWebAppTitle() {
        return appleMobileWebAppTitle;
    }

    public void setAppleMobileWebAppTitle(String appleMobileWebAppTitle) {
        this.appleMobileWebAppTitle = appleMobileWebAppTitle;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getGoogle() {
        return google;
    }

    public void setGoogle(String google) {
        this.google = google;
    }

    public String getMobileWebAppCapable() {
        return mobileWebAppCapable;
    }

    public void setMobileWebAppCapable(String mobileWebAppCapable) {
        this.mobileWebAppCapable = mobileWebAppCapable;
    }

    public String getThemeColor() {
        return themeColor;
    }

    public void setThemeColor(String themeColor) {
        this.themeColor = themeColor;
    }

    public String getOgLocale() {
        return ogLocale;
    }

    public void setOgLocale(String ogLocale) {
        this.ogLocale = ogLocale;
    }

    public String getOgSiteName() {
        return ogSiteName;
    }

    public void setOgSiteName(String ogSiteName) {
        this.ogSiteName = ogSiteName;
    }

}

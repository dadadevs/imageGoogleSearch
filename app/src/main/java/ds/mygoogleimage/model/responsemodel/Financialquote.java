
package ds.mygoogleimage.model.responsemodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Financialquote {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("imageurl")
    @Expose
    private String imageurl;
    @SerializedName("tickersymbol")
    @Expose
    private String tickersymbol;
    @SerializedName("exchange")
    @Expose
    private String exchange;
    @SerializedName("exchangetimezone")
    @Expose
    private String exchangetimezone;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("pricechange")
    @Expose
    private String pricechange;
    @SerializedName("pricechangepercent")
    @Expose
    private String pricechangepercent;
    @SerializedName("isafterhours")
    @Expose
    private String isafterhours;
    @SerializedName("afterhoursprice")
    @Expose
    private String afterhoursprice;
    @SerializedName("afterhourspricechange")
    @Expose
    private String afterhourspricechange;
    @SerializedName("afterhourspricechangepercent")
    @Expose
    private String afterhourspricechangepercent;
    @SerializedName("afterhoursquotetime")
    @Expose
    private String afterhoursquotetime;
    @SerializedName("quotetime")
    @Expose
    private String quotetime;
    @SerializedName("datasource")
    @Expose
    private String datasource;
    @SerializedName("datasourcedisclaimerurl")
    @Expose
    private String datasourcedisclaimerurl;
    @SerializedName("pricecurrency")
    @Expose
    private String pricecurrency;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImageurl() {
        return imageurl;
    }

    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    public String getTickersymbol() {
        return tickersymbol;
    }

    public void setTickersymbol(String tickersymbol) {
        this.tickersymbol = tickersymbol;
    }

    public String getExchange() {
        return exchange;
    }

    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    public String getExchangetimezone() {
        return exchangetimezone;
    }

    public void setExchangetimezone(String exchangetimezone) {
        this.exchangetimezone = exchangetimezone;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPricechange() {
        return pricechange;
    }

    public void setPricechange(String pricechange) {
        this.pricechange = pricechange;
    }

    public String getPricechangepercent() {
        return pricechangepercent;
    }

    public void setPricechangepercent(String pricechangepercent) {
        this.pricechangepercent = pricechangepercent;
    }

    public String getIsafterhours() {
        return isafterhours;
    }

    public void setIsafterhours(String isafterhours) {
        this.isafterhours = isafterhours;
    }

    public String getAfterhoursprice() {
        return afterhoursprice;
    }

    public void setAfterhoursprice(String afterhoursprice) {
        this.afterhoursprice = afterhoursprice;
    }

    public String getAfterhourspricechange() {
        return afterhourspricechange;
    }

    public void setAfterhourspricechange(String afterhourspricechange) {
        this.afterhourspricechange = afterhourspricechange;
    }

    public String getAfterhourspricechangepercent() {
        return afterhourspricechangepercent;
    }

    public void setAfterhourspricechangepercent(String afterhourspricechangepercent) {
        this.afterhourspricechangepercent = afterhourspricechangepercent;
    }

    public String getAfterhoursquotetime() {
        return afterhoursquotetime;
    }

    public void setAfterhoursquotetime(String afterhoursquotetime) {
        this.afterhoursquotetime = afterhoursquotetime;
    }

    public String getQuotetime() {
        return quotetime;
    }

    public void setQuotetime(String quotetime) {
        this.quotetime = quotetime;
    }

    public String getDatasource() {
        return datasource;
    }

    public void setDatasource(String datasource) {
        this.datasource = datasource;
    }

    public String getDatasourcedisclaimerurl() {
        return datasourcedisclaimerurl;
    }

    public void setDatasourcedisclaimerurl(String datasourcedisclaimerurl) {
        this.datasourcedisclaimerurl = datasourcedisclaimerurl;
    }

    public String getPricecurrency() {
        return pricecurrency;
    }

    public void setPricecurrency(String pricecurrency) {
        this.pricecurrency = pricecurrency;
    }

}

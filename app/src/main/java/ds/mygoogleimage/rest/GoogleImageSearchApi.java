package ds.mygoogleimage.rest;

import ds.mygoogleimage.model.responsemodel.SearchResponseModel;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface GoogleImageSearchApi {


    @GET("customsearch/v1/")
    Call<SearchResponseModel> getResult(@Query("q") String search, @Query("cx") String cx, @Query("key") String key);

}

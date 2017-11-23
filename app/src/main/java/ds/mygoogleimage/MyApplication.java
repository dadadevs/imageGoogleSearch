package ds.mygoogleimage;


import android.app.Application;

import ds.mygoogleimage.rest.GoogleImageSearchApi;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MyApplication extends Application {

    private Retrofit retrofit;
    private static GoogleImageSearchApi googleApi;

    @Override
    public void onCreate() {
        super.onCreate();
        initApi();
    }

    private void initApi() {
        retrofit = new Retrofit.Builder()
                .baseUrl("https://www.googleapis.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        googleApi = retrofit.create(GoogleImageSearchApi.class);

    }

    public static GoogleImageSearchApi getApi() {
        return googleApi;
    }
}

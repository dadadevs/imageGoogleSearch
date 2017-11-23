package ds.mygoogleimage.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import ds.mygoogleimage.MyApplication;
import ds.mygoogleimage.R;
import ds.mygoogleimage.adapters.RecyclerViewAdapter;
import ds.mygoogleimage.model.responsemodel.Item;
import ds.mygoogleimage.model.responsemodel.SearchResponseModel;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.search_view)
    SearchView searchView;
    @BindView(R.id.recycler_view)
    RecyclerView rv;
    @BindView(R.id.progress_bar_main)
    ProgressBar progressBar;
    String cxParam;
    String keyParam;
    ArrayList<Item> items;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("");
        ButterKnife.bind(this);
        cxParam = getResources().getString(R.string.cx_api_key);
        keyParam = getResources().getString(R.string.api_key2);
        setSupportActionBar(toolbar);
        items = new ArrayList<>();
        initSearchView();
        initRecyclerView();
        loadSearchedItems("Google");
    }


    private void loadSearchedItems(String searchItem) {
        Log.e("test", cxParam + " " + keyParam + " " + searchItem);
        progressBar.setVisibility(View.VISIBLE);
        MyApplication.getApi().getResult(searchItem, cxParam, keyParam).enqueue(new Callback<SearchResponseModel>() {
            @Override
            public void onResponse(Call<SearchResponseModel> call, Response<SearchResponseModel> response) {
                if (response.isSuccessful()) {
                    SearchResponseModel responseModel = response.body();

                    //фильтрация item-ов у кот нет параметра PageMap, CseThumbnail, CseImage
                    try {
                        for (Item item : responseModel.getItems()) {
                            if (item.getPagemap() != null && item.getPagemap().getCseThumbnail() != null && item.getPagemap().getCseImage() != null) {
                                items.add(item);
                            }
                        }
                    }catch (NullPointerException e){
                        Toast.makeText(MainActivity.this,"По Вашему запросу ничего ненайдено", Toast.LENGTH_LONG).show();
                    }

                    rv.getAdapter().notifyDataSetChanged();
                    progressBar.setVisibility(View.GONE);
                } else {

                }
            }

            @Override
            public void onFailure(Call<SearchResponseModel> call, Throwable t) {
                progressBar.setVisibility(View.GONE);
            }
        });


    }

    private void initRecyclerView() {
        rv.setLayoutManager(new GridLayoutManager(this, 2));
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(items, MainActivity.this);
        rv.setAdapter(adapter);
    }

    private void initSearchView() {

        EditText searchEditText = (EditText) searchView.findViewById(android.support.v7.appcompat.R.id.search_src_text);
        searchEditText.setTextColor(Color.GRAY);
        searchEditText.setHintTextColor(Color.GRAY);
        searchView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                searchView.onActionViewExpanded();

            }
        });
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                if (items.size() > 0) {
                    items.clear();
                }
                loadSearchedItems(query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });


    }
}

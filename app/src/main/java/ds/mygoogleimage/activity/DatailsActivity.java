package ds.mygoogleimage.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import butterknife.BindView;
import butterknife.ButterKnife;
import ds.mygoogleimage.Constants;
import ds.mygoogleimage.R;

public class DatailsActivity extends AppCompatActivity {

    String title;
    String image;

    @BindView(R.id.title_text)
    TextView titleTextView;
    @BindView(R.id.image_view_datails)
    ImageView imageView;
    @BindView(R.id.progress_bar)
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_datails);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ButterKnife.bind(this);
        initViews();
    }

    private void initViews(){
        title = getIntent().getStringExtra(Constants.title);
        image = getIntent().getStringExtra(Constants.imageSrc);

        titleTextView.setText(title);
        Picasso.with(DatailsActivity.this).load(image).fit().into(imageView, new Callback() {
            @Override
            public void onSuccess() {
                progressBar.setVisibility(View.GONE);
            }

            @Override
            public void onError() {

            }
        });

    }

}

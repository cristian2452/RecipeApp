package com.atempa.mvp.dam2018_02_recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class RecipeDetailActivity extends AppCompatActivity {
    private TextView mTitle, mDescription;
    private ImageView mImageUrl;
    private WebView mWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe_detail);
        // 1
        String title = this.getIntent().getExtras().getString("title");
        String description = this.getIntent().getExtras().getString("description");
        String imageUrl = this.getIntent().getExtras().getString("imageUrl");
        String url = this.getIntent().getExtras().getString("url");
        // 2
        setTitle(title);
        // 3
        mTitle = findViewById(R.id.txt_title);
        mDescription = findViewById(R.id.txt_description);
        mImageUrl = findViewById(R.id.picture);
        mWebView = findViewById(R.id.wv_detail);
        // 4
        mWebView.loadUrl(url);

        mTitle.setText(title);
        mDescription.setText(description);

        Picasso.get()
                .load(imageUrl).placeholder(R.mipmap.ic_launcher).into(mImageUrl);
    }
}

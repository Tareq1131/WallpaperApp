package com.tareq.android.wallpaperapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.tareq.android.wallpaperapp.adapters.CuratedAdapter;
import com.tareq.android.wallpaperapp.listners.CuratedResponseListener;
import com.tareq.android.wallpaperapp.listners.OnRecyclerClickListener;
import com.tareq.android.wallpaperapp.models.CuratedApiResponse;
import com.tareq.android.wallpaperapp.models.Photo;

import java.util.List;

public class MainActivity extends AppCompatActivity implements OnRecyclerClickListener {

    RecyclerView recyclerView_home;
    CuratedAdapter adapter;
    ProgressDialog dialog;
    RequestManager manager;
    FloatingActionButton fab_next,fab_back;
    int page;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab_next = findViewById(R.id.fab_next);
        fab_back = findViewById(R.id.fab_back);

        dialog = new ProgressDialog(this);
        dialog.setTitle("Loading ...");

        manager = new RequestManager(this);
        manager.getCuratedWallpapers(listener, "1");

        fab_next.setOnClickListener(v -> {
            String next_page = String.valueOf(page+1);
            manager.getCuratedWallpapers(listener, next_page);
            dialog.show();
        });
        fab_back.setOnClickListener(v -> {
            if (page>1){
                String pre_page = String.valueOf(page-1);
                manager.getCuratedWallpapers(listener,pre_page);
                dialog.show();
            }
        });


    }

    private final CuratedResponseListener listener = new CuratedResponseListener() {
        @Override
        public void onFetch(CuratedApiResponse response, String message) {

            dialog.dismiss();
            if (response.getPhotos().isEmpty()){
                Toast.makeText(MainActivity.this, "No image Found!!", Toast.LENGTH_SHORT).show();
            return;
            }
            page = response.getPage();
            showData(response.getPhotos());
        }

        @Override
        public void onError(String message) {
            dialog.dismiss();
            Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
        }
    };

    private void showData(List<Photo> photos) {
        recyclerView_home= findViewById(R.id.recycler_home);
        recyclerView_home.setHasFixedSize(true);
        recyclerView_home.setLayoutManager(new GridLayoutManager(this,2));
        adapter= new CuratedAdapter(MainActivity.this,photos,this);
        recyclerView_home.setAdapter(adapter);
    }

    @Override
    public void onClick(Photo photo) {
        //Toast.makeText(MainActivity.this, photo.getPhotographer(), Toast.LENGTH_SHORT).show();
    startActivity(new Intent(MainActivity.this,WallpaperActivity.class)
    .putExtra("photo", photo));



    }
}
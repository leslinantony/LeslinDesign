package com.sosa.leslindesign;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {

    List<BucketModel> list_bucket=new ArrayList<>();
    List<ModelShot> list_shot=new ArrayList<>();

    RecyclerView rv_shot,rv_bucket;
    ShotAdapter shotAdapter;
    BucketAdapter bucketAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        rv_bucket=findViewById(R.id.rv_bucket);
        rv_shot=findViewById(R.id.rv_shot);

        rv_shot.setHasFixedSize(true);
        rv_shot.setLayoutManager(new GridLayoutManager(this,2));

        list_shot.add(new ModelShot(R.drawable.ic_blocks,R.drawable.bg_green));
        list_shot.add(new ModelShot(R.drawable.ic_blocks,R.drawable.bg_red));
        list_shot.add(new ModelShot(R.drawable.ic_blocks,R.drawable.bg_orange));
        list_shot.add(new ModelShot(R.drawable.ic_blocks,R.drawable.bg_blue));
        list_shot.add(new ModelShot(R.drawable.ic_blocks,R.drawable.bg_rectangle_curved));
        list_shot.add(new ModelShot(R.drawable.ic_blocks,R.drawable.bg_green));
        rv_shot.setAdapter(new ShotAdapter(this,list_shot));

        rv_bucket.setHasFixedSize(true);
        rv_bucket.setLayoutManager(new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false));

        list_bucket.add(new BucketModel("Illustration",R.drawable.bg_blue));
        list_bucket.add(new BucketModel("Photoshop",R.drawable.bg_red));
        list_bucket.add(new BucketModel("Video Editing",R.drawable.bg_orange));
        list_bucket.add(new BucketModel("Illustration",R.drawable.bg_rectangle_curved));
        list_bucket.add(new BucketModel("Web Design",R.drawable.bg_green));
        list_bucket.add(new BucketModel("Interface",R.drawable.bg_blue));
        list_bucket.add(new BucketModel("X Code",R.drawable.bg_green));

        rv_bucket.setAdapter(new BucketAdapter(this,list_bucket));
    }
}

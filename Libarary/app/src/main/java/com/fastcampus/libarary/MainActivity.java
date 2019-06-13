package com.fastcampus.libarary;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class MainActivity extends AppCompatActivity {

    Context context;
    ImageView imageViewOne;
    ImageView imageViewTwo;
    ImageView imageViewThree;
    ImageView imageViewFour;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        imageViewOne = findViewById(R.id.image_one);
        imageViewTwo = findViewById(R.id.image_two);
        imageViewThree = findViewById(R.id.image_three);
        imageViewFour = findViewById(R.id.image_four);

        //  웹 이미지를 넣는 방법
        Glide.with(context)
                .load("https://post-phinf.pstatic.net/MjAxOTAxMTdfNDEg/MDAxNTQ3NzA1NDQxMTk1.ieYZa5KIvF3Uo4t7Vuj96vJ8aBorwylJWt6kJuN2ssIg.q8572nRlsMVLTA-rU8y7Fjg4yIUjN4v4lzInj2g160kg.JPEG/신세경1.jpg?type=w1200")
                .into(imageViewOne);

        // 옵션 사용 방법
        RequestOptions cropOption = new RequestOptions().centerCrop();
        Glide.with(context)
                .load("https://post-phinf.pstatic.net/MjAxOTAxMTdfNDEg/MDAxNTQ3NzA1NDQxMTk1.ieYZa5KIvF3Uo4t7Vuj96vJ8aBorwylJWt6kJuN2ssIg.q8572nRlsMVLTA-rU8y7Fjg4yIUjN4v4lzInj2g160kg.JPEG/신세경1.jpg?type=w1200")
                .apply(cropOption)
                .into(imageViewTwo);

        // 옵션 사용 방법
        RequestOptions circleCrop = new RequestOptions().circleCrop();
        Glide.with(context)
                .load("https://post-phinf.pstatic.net/MjAxOTAxMTdfNDEg/MDAxNTQ3NzA1NDQxMTk1.ieYZa5KIvF3Uo4t7Vuj96vJ8aBorwylJWt6kJuN2ssIg.q8572nRlsMVLTA-rU8y7Fjg4yIUjN4v4lzInj2g160kg.JPEG/신세경1.jpg?type=w1200")
                .apply(circleCrop)
                .into(imageViewThree);

        //로컬 이미지 불러오는 방법
        Glide.with(context)
                .load(R.drawable.ic_launcher_background)
                .into(imageViewFour);
    }
}

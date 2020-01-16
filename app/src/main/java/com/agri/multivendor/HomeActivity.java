package com.agri.multivendor;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ViewFlipper;
import android.view.View.OnClickListener;


public class HomeActivity extends AppCompatActivity {
    ViewFlipper v_fliper;

    int[] images={
            R.drawable.tamil,
            R.drawable.fruites,
            R.drawable.legumes,
            R.drawable.vegtables
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);




        v_fliper=findViewById(R.id.v_fliper);
        for(int i=0;i<=3;i++){
            flip_image(images[i]);
        }
    }
    public void flip_image(int i){
        ImageView view = new ImageView(this);
        view.setBackgroundResource(i);
        v_fliper.addView(view);
        v_fliper.setFlipInterval(4000);
        v_fliper.setAutoStart(true);
        v_fliper.setInAnimation(this,android.R.anim.slide_out_right);

    }

    public void buyersloginn(View view) {
        Intent i = new Intent(this,BuyersLogin.class);
        startActivity(i);
    }

    public void sellerslogin(View view) {
        Intent i = new Intent(this,SellersLogin.class);
        startActivity(i);
    }
}

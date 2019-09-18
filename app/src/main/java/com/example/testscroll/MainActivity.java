 package com.example.testscroll;

import androidx.appcompat.app.AppCompatActivity;
import java.io.IOException;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

 public class MainActivity extends AppCompatActivity implements OnClickListener {
    private ImageView referencia, android, apple, linux, firefox;
    private Button botonUno;
    private int movil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        referencia=(ImageView)findViewById(R.id.principal);
        android=(ImageView) findViewById(R.id.android);
        linux=(ImageView)findViewById(R.id.linux);
        firefox=(ImageView)findViewById(R.id.firefox);
        apple=(ImageView)findViewById(R.id.apple);

        botonUno=(Button)findViewById(R.id.boton);

        referencia.setOnClickListener(this);
        android.setOnClickListener(this);
        linux.setOnClickListener(this);
        firefox.setOnClickListener(this);
        apple.setOnClickListener(this);

        botonUno.setOnClickListener(this);






    }

    @Override
     public void onClick(View v){

        switch (v.getId()){
            case R.id.android:
                referencia.setImageResource(R.drawable.android);
                movil=R.drawable.android;
                break;
            case R.id.apple:
                referencia.setImageResource(R.drawable.apple);
                movil=R.drawable.apple;
                break;
            case R.id.firefox:
                referencia.setImageResource(R.drawable.firefox);
                movil=R.drawable.firefox;
                break;
            case R.id.linux:
                referencia.setImageResource(R.drawable.linux);
                movil=R.drawable.linux;
                break;
            case R.id.boton:
                Bitmap fondo= BitmapFactory.decodeStream(getResources().openRawResource(movil));
                try {
                    getApplicationContext().setWallpaper(fondo);
                }catch(IOException e){
                    e.printStackTrace();
                }
                break;

            default:
                break;
        }
    }
}

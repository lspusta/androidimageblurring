package itkido.me.androidimageblurring;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.ImageView;

import com.jackandphantom.blurimage.BlurImage;


public class MainActivity extends AppCompatActivity {
    ImageView imgBlur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imgBlur = findViewById(R.id.imgBlur);


        Bitmap bitmap = BlurImage.with(getApplicationContext()).load(R.drawable.catimage).intensity(25).Async(true).getImageBlur();
        imgBlur.setImageBitmap(bitmap);
    }



}

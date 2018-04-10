package pe.com.falvarado.paginasamarillasapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;


import pe.com.falvarado.paginasamarillasapp.R;


public class DetailActivity extends AppCompatActivity {

    private TextView textView;
    ImageView imageView;
    private String num;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        textView = findViewById(R.id.info);
        String logo = getIntent().getStringExtra("logo");
        String info = getIntent().getStringExtra("info");
        int restId = getResources().getIdentifier(logo, "drawable", getPackageName());
        imageView.setImageResource(restId);
        num = getIntent().getStringExtra("numero");
        textView.setText(info);
    }
}

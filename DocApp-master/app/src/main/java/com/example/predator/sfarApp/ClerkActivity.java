package com.example.lenovo.sfarApp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.lenovo.sfar.R;
import com.example.lenovo.sfarApp.patient.AddPatient;
import com.example.lenovo.sfarApp.patient.DeletePatient;
import com.example.lenovo.sfarApp.patient.EditPatient;
import com.example.lenovo.sfarApp.patient.SearchPatient;
import com.example.lenovo.sfarApp.patient.ViewPatient;

public class ClerkActivity extends AppCompatActivity {
    ImageView img;
    TextView txtname;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clerk);
        img=(ImageView)findViewById(R.id.img);
        txtname=(TextView)findViewById(R.id.txtname);

       /* byte[] byteArray = getIntent().getByteArrayExtra("image");
        Bitmap bmp = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);//
        img.setImageBitmap(bmp); */

        String name=getIntent().getStringExtra("name");
        txtname.setText("welcome"+" "+name);

    }

    public void add(View v)
    {
        Intent i=new Intent(this,AddPatient.class);
        startActivity(i);
    }

    public  void search(View v)
    {
        Intent i=new Intent(this,SearchPatient.class);
        startActivity(i);
    }

    public  void edit(View v)
    {
        Intent i=new Intent(this,EditPatient.class);
        startActivity(i);
    }

    public  void view(View v)
    {
        Intent i=new Intent(this,ViewPatient.class);
        startActivity(i);
    }

    public void delete(View v)
    {
        Intent i=new Intent(this, DeletePatient.class);
        startActivity(i);
    }
}

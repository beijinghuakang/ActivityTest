package com.hkc.activitytest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {
     private EditText editText;
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.add_item:
                Toast.makeText(this,"You click  Add",Toast.LENGTH_SHORT).show();
                break;
            case  R.id.remove_item:
                Toast.makeText(this,"You click remove",Toast.LENGTH_SHORT).show();
                break;
           default:
        }
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
        Button button1= (Button) findViewById(R.id.button_1);
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
               // Toast.makeText(FirstActivity.this, "YOU clicked Button 1", Toast.LENGTH_SHORT).show();
               // finish();
               // Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
              // startActivity(intent);
              //  Intent intent=new Intent(Intent.ACTION_VIEW);
               // intent.setData(Uri.parse("http://www.baidu.com"));
               // startActivity(intent);
             //   editText= (EditText) findViewById(R.id.edit_text);
              //  String a=editText.getText().toString();
              //  Toast.makeText(FirstActivity.this,inputText,Toast.LENGTH_SHORT).show();

            }
        });

    }
}

package com.hkc.activitytest;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText editText;
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
        Button button= (Button) findViewById(R.id.button_7);
        editText= (EditText) findViewById(R.id.edit_text);
        progressBar= (ProgressBar) findViewById(R.id.progress_bar);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
         switch (v.getId()){
             case R.id.button_7:
                 //添加逻辑的地方
                /*if (progressBar.getVisibility()==View.GONE) {
                    progressBar.setVisibility(View.VISIBLE);
                }else{
                    progressBar.setVisibility(View.GONE);
                }*/
                 /*int progress=progressBar.getProgress();
                 progress=progress+10;
                 progressBar.setProgress(progress);*/
                 AlertDialog.Builder dialog=new AlertDialog.Builder(MainActivity.this);
                 dialog.setTitle("一个对话框");
                 dialog.setMessage("什么这是");
                 dialog.setCancelable(false);
                 dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                     @Override
                     public void onClick(DialogInterface dialog, int which) {

                     }
                 });
                 dialog.setNegativeButton("Cannel",new DialogInterface.OnClickListener(){

                     @Override
                     public void onClick(DialogInterface dialog, int which) {

                     }
                 });
                 dialog.show();
                 break;
             default:
                 break;
         }
    }
}

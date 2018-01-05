package com.example.student.a18010501;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int ch;
    int tmp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void click1(View v)
    {
        AlertDialog.Builder bulider = new AlertDialog.Builder(MainActivity.this);
        bulider.setTitle("This is title");
        bulider.setMessage("Hello");
        bulider.setPositiveButton("確定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this,"按下了確定",Toast.LENGTH_LONG).show();
            }
        });
          bulider.setNegativeButton("取消", new DialogInterface.OnClickListener() {
              @Override
              public void onClick(DialogInterface dialogInterface, int i) {
                  Toast.makeText(MainActivity.this,"按下了取消",Toast.LENGTH_LONG).show();
            }
         });
          bulider.setNeutralButton("HELP", new DialogInterface.OnClickListener() {
               @Override
               public void onClick(DialogInterface dialogInterface, int i) {
               Toast.makeText(MainActivity.this,"按下了幫助",Toast.LENGTH_LONG).show();
               }
          });
                  bulider.show();


    }
    public void click2(View v)
    {
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
        builder.setTitle("This is title");
        final EditText ed = new EditText(MainActivity.this);
        final TextView tv = findViewById(R.id.textView);
        ed.setText(tv.getText().toString());
        builder.setView(ed);

        builder.setPositiveButton("確定", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                //Toast.makeText(MainActivity.this,"按下了確定",Toast.LENGTH_LONG).show();
                tv.setText(ed.getText().toString());

            }
        });
        builder.setNegativeButton("取消", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this,"按下了取消",Toast.LENGTH_LONG).show();
            }
        });
        builder.show();
    }
         public void click3(View v)
         {
             AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
             builder.setTitle("列表");
             final String fruits[] = {"蘋果","香蕉","梨子"};   // 設定陣列 fruits
             final TextView tv2 = findViewById(R.id.textView2); // 抓textView2
             builder.setItems(fruits, new DialogInterface.OnClickListener() { //放入選項資料,設定點擊事件
                 @Override
                 public void onClick(DialogInterface dialogInterface, int i) {
                  tv2.setText(fruits[i]);                                      //tv2 放入fruits[i] , i =
                 }
             });

             builder.setNeutralButton("取消", new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialogInterface, int i) {

                 }
             });
             builder.setCancelable(false);  //點其他地方不會跳出
             builder.show();
         }

         public void click4(View v){
             AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
             builder.setTitle("單選列表");
             final String fruits[] = {"蘋果","香蕉","梨子"};   // 設定陣列 fruits
             final TextView tv3 = findViewById(R.id.textView3); // 抓textView
             tmp = ch;
             builder.setSingleChoiceItems(fruits, ch, new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialogInterface, int i) {
                   tmp = i;
                 }
             });
             builder.setPositiveButton("確定", new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialogInterface, int i) {
                     ch = tmp;
                     tv3.setText(fruits[ch]);
                 }
             }) ;
             builder.setNeutralButton("取消", new DialogInterface.OnClickListener() {
                 @Override
                 public void onClick(DialogInterface dialogInterface, int i) {

                 }
             });
             builder.show();
         }

}

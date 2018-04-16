package net.macdidi.hw1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void click_bt(View view){
        //一個ＮＥＷ的intent物件
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, Main2Activity.class);



        //new一個Bundle物件，並將要傳遞的資料傳入
        EditText et01 = (EditText)findViewById(R.id.et01);

        Bundle bundle = new Bundle();
        bundle.putString("saying", et01.getText().toString());
        bundle.putString("say2", "ABC");

        //將Bundle物件assign給intent
        intent.putExtras(bundle);

        startActivity(intent);
        MainActivity.this.finish();
    }
}

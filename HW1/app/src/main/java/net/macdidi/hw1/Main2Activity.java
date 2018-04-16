package net.macdidi.hw1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Bundle bundle030678 =this.getIntent().getExtras();
        String saying = bundle030678.getString("saying");
        saying = "B10509030：" + saying;

        TextView tv01  = (TextView)findViewById(R.id.textView);
        tv01.setText(saying);
    }
}

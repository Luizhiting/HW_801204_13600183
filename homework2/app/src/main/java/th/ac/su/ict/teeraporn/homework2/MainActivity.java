package th.ac.su.ict.teeraporn.homework2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView empty;
    Button bt1 , bt2 , bt3 , bt4 , bt5 , bt6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        empty = findViewById(R.id.empty);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);
        bt6 = findViewById(R.id.bt6);



        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                empty.setText("235-225-221");
                empty.setBackgroundColor(0xFFEBE1DD);
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                empty.setText("236-203-202");
                empty.setBackgroundColor(0xFFECCBCA);
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                empty.setText("116-131-156");
                empty.setBackgroundColor(0xFF74839C);
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                empty.setText("153-169-191");
                empty.setBackgroundColor(0xFF99A9BF);
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                empty.setText("194-204-213");
                empty.setBackgroundColor(0xFFC2CCD5);
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                empty.setText("221-226-229");
                empty.setBackgroundColor(0xFFDDE2E5);
            }
        });


    }

}
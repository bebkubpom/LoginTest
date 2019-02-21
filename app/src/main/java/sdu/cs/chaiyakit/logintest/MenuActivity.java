package sdu.cs.chaiyakit.logintest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MenuActivity extends AppCompatActivity {

    //Explicit
    String getNameString;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        // ผูกตัวแปรบน Java กับ XML
        TextView nametTextView = findViewById(R.id.tvNameLogin);

        //รับค่าตัวแปร Name จากการ Intent
        getNameString = getIntent().getStringExtra("Name");
        nametTextView.setText("Great!  " + getNameString + " เข้า System แล้ว");
    }//end onCreate
}//end class

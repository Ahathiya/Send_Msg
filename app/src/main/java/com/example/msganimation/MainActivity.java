package com.example.msganimation;
import androidx.annotation.Nullable;
        import androidx.appcompat.app.AppCompatActivity;

        import android.os.Bundle;
        import android.os.PersistableBundle;
        import android.telephony.SmsManager;
        import android.view.View;
        import android.widget.Button;
        import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText ednum,edmsg;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ednum=findViewById(R.id.editTextPhone);
        edmsg=findViewById(R.id.editTextTextPersonName2);
        b=findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SmsManager sm=SmsManager.getDefault();
                sm.sendTextMessage(ednum.getText().toString(),null,edmsg.getText().toString(),null,null);

            }
        });
    }
}


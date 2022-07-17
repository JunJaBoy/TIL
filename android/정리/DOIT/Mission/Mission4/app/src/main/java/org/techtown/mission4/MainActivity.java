package org.techtown.mission4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etv;
    TextView tv;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etv = (EditText) findViewById(R.id.etv);
        tv = (TextView) findViewById(R.id.tv);

        tv.setText("0/80 글자");
        etv.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence s, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() > 80) {
                    s.delete(s.length() - 2, s.length() - 1);
                }
                tv.setText(s.length() + "/80 글자");
            }
        });

    }

    public void onBtnClicked(View view) {
        String str = etv.getText().toString();
        Toast.makeText(this.getApplicationContext(), str, Toast.LENGTH_LONG).show();
    }

}
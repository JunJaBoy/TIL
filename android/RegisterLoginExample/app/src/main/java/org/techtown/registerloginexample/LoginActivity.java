package org.techtown.registerloginexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class LoginActivity extends AppCompatActivity {
    private EditText et_login_id, et_login_pass;
    private Button btn_login_login, btn_login_register;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        et_login_id = findViewById(R.id.et_login_id);
        et_login_pass = findViewById(R.id.et_login_pass);
        btn_login_login = findViewById(R.id.btn_login_login);
        btn_login_register = findViewById(R.id.btn_login_register);



        btn_login_register.setOnClickListener(new View.OnClickListener() { //회원가입 버튼 클릭 시
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LoginActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

        btn_login_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //et_????에 입력되어 있는 값을 각 변수에 할당
                String userID = et_login_id.getText().toString();
                String userPass = et_login_pass.getText().toString();

                Response.Listener<String> responseListener = new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        try {
                            JSONObject jsonObject = new JSONObject(response);
                            boolean success = jsonObject.getBoolean("success"); // 서버[Register.php]에서 "success"를 수신하면 success = "true"
                            if (success) { //서버에서 "success"를 수신했을 시 (로그인 성공 시)
                                String userID = jsonObject.getString("userID");
                                String userName = jsonObject.getString("userName");

                                Toast.makeText(getApplicationContext(), "로그인에 성공하였습니다!", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                                intent.putExtra("userID", userID);
                                intent.putExtra("userName", userName);
                                startActivity(intent);
                            } else { //서버에서 "success"를 수신하지 못했을 시 (로그인 실패 시)
                                Toast.makeText(getApplicationContext(), "로그인에 실패하였습니다.", Toast.LENGTH_SHORT).show();
                                return;
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                };
                LoginRequest loginRequest = new LoginRequest(userID, userPass, responseListener);
                RequestQueue queue = Volley.newRequestQueue(LoginActivity.this);
                queue.add(loginRequest);

            }
        });

    }
}
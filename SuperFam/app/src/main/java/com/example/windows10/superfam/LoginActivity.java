package com.example.windows10.superfam;


import android.os.AsyncTask;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.StringRequest;
import com.bumptech.glide.Glide;
import com.chabbal.slidingdotsplash.ImageViewPagerAdapter;
import com.chabbal.slidingdotsplash.OnSetImageListener;
import com.chabbal.slidingdotsplash.SlidingSplashView;
import com.chabbal.slidingdotsplash.ViewPagerAdapter;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import static android.provider.ContactsContract.CommonDataKinds.Website.URL;

public class LoginActivity extends AppCompatActivity {

    private EditText email, password;
    private Button login, register;
    private RequestQueue requestQueue;
    private static final String URL = "http://localhost/server/user_control.php";
    private StringRequest request;

//    TabLayout tabLayout;
//    //PagerAdapter mImageViewPager;

//    String URL = "http://localhost/server/index.php";

//    JSONParser jsonParser = new JSONParser();

//    int i = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);



    }

}
//        //splashDots
//        SlidingSplashView splashView  = (SlidingSplashView) findViewById(R.id.splash);
//        splashView.addOnPageChangeListener(this);


        //login and register

//        email = (EditText) findViewById(R.id.email);
//        password = (EditText) findViewById(R.id.password);

//        login = (Button) findViewById(R.id.login);
//        register = (Button) findViewById(R.id.register);

//        login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                AttemptLogin attemptLogin = new AttemptLogin();
//                attemptLogin.execute(email.getText().toString(), password.getText().toString(), "");
//            }
//        });

//        register.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {

               // if (i == 0) {
               //     i = 1;
               //     email.setVisibility(View.VISIBLE);
               //     login.setVisibility(View.GONE);
               //     register.setText("CREATE ACCOUNT");
               // } else {

               //     register.setText("REGISTER");
               //     email.setVisibility(View.GONE);
               //     login.setVisibility(View.VISIBLE);
               //     i = 0;

//                    AttemptLogin attemptLogin = new AttemptLogin();
//                    attemptLogin.execute(fullname.getText().toString(),email.getText().toString(),password.getText().toString());

//                }

//            }
//        });

//    }

//    private class AttemptLogin extends AsyncTask<String, String, JSONObject> {

//        @Override

//        protected void onPreExecute() {

//            super.onPreExecute();

//        }

//        @Override

//        protected JSONObject doInBackground(String... args) {


//            String email = args[2];
//            String password = args[1];
//            String name = args[0];

//            ArrayList params = new ArrayList();
//            params.add(new BasicNameValuePair("username", name));
//            params.add(new BasicNameValuePair("password", password));
//            if (email.length() > 0)
//                params.add(new BasicNameValuePair("email", email));

//            JSONObject json = jsonParser.makeHttpRequest(URL, "POST", params);


//            return json;

//        }

//        protected void onPostExecute(JSONObject result) {

//            // dismiss the dialog once product deleted
//            //Toast.makeText(getApplicationContext(),result,Toast.LENGTH_LONG).show();

//            try {
//                if (result != null) {
//                    Toast.makeText(getApplicationContext(), result.getString("message"), Toast.LENGTH_LONG).show();
//                } else {
//                    Toast.makeText(getApplicationContext(), "Unable to retrieve any data from server", Toast.LENGTH_LONG).show();
//                }
//            } catch (JSONException e) {
//                e.printStackTrace();
//            }

//        }
//    }

        //spalshDots lanjutan
//        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
//            Log.d("OnPageScrolled", String.valueOf(position));
//        }


//        public void onPageSelected(int position) {
//            Log.d("OnPageSelected", String.valueOf(position));

//        }


//        public void onPageScrollStateChanged(int state) {
//            Log.d("PageScrollStateChanged", String.valueOf(state));

//        }
//}
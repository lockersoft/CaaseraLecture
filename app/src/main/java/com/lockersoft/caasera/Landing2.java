package com.lockersoft.caasera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class Landing2 extends BaseActivity {
    TextView txtWebContent = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_landing2);
        txtWebContent = (TextView) findViewById(R.id.txtWebContent);

        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "https://caasera.azurewebsites.net/api/1.0/student";
        // Request a string from the URL
        StringRequest stringRequest = new StringRequest(
                Request.Method.GET,
                url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        txtWebContent.setText("Response: " + response.substring(0, 500));
                    }
                },
                new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        txtWebContent.setText("That didn't work!!!");
                    }
                }

        );
        queue.add( stringRequest );
    }
}




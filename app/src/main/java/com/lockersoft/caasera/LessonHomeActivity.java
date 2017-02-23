package com.lockersoft.caasera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LessonHomeActivity extends BaseActivity {

  ListView lessons;
  ArrayAdapter<CharSequence> adapter;
  CAASeraAPI studentInfo;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_lesson_home);
    lessons = (ListView) findViewById(R.id.lvLessons);
    adapter = ArrayAdapter.createFromResource(this,
        R.array.countries_array, android.R.layout.simple_list_item_1);
    lessons.setAdapter(adapter);

    RequestQueue queue = Volley.newRequestQueue(this);
    String url = "https://caasera.azurewebsites.net/api/1.0/student";
    // Request a string from the URL
    JsonObjectRequest jsonRequest = new JsonObjectRequest(
        url,
        null,
        new Response.Listener<JSONObject>() {
          @Override
          public void onResponse(JSONObject response) {
            Log.i("BMI", response.toString());
            //    response.get("currentSubscription").get("currentLesson").get("studentAssignments").get(0).get("title")
            //    response.get("currentSubscription").get("currentLesson").get("studentAssignments").length(
//
//            List<String> items = new ArrayList<String>();
//            try {
//              JSONArray temp = (JSONArray) (((JSONObject) ((JSONObject) response.get("currentSubscription")).get("currentLesson")).get("studentAssignments"));
//              int count = temp.length();
//              for (int i = 0; i < count; i++) {
//                items.add((String) ((JSONObject) temp.get(i)).get("title"));
//              }
//            } catch (JSONException e) {
//              e.printStackTrace();
//            }

            // Create Jackson ObjectMapper instance
            ObjectMapper objectMapper = new ObjectMapper();

// Convert json string to object
            try {
              studentInfo = objectMapper.readValue(response.toString(), CAASeraAPI.class);
              Log.i("BMI", studentInfo.getFirstName());
            } catch (IOException e){
              e.printStackTrace();
            }
//            final ArrayAdapter<String> adapter =
//                new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, items);
//
//            lessons.setAdapter(adapter);
//            lessons.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//              @Override
//              public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Log.i("BMI", "Got here:");
//                ToastIt(adapter.getItem(position).toString() + ": " + position + " id: " + id);
//              }
//            });
          }
        },
        new Response.ErrorListener() {
          @Override
          public void onErrorResponse(VolleyError error) {
            ToastIt("That didn't work!!!");
          }
        }
    ) {
      @Override
      public Map<String, String> getHeaders() throws AuthFailureError {
        Map<String, String> headers = new HashMap<String, String>();
        String credentials = "trial01:bigfoot"; //username + ":" + password;
        String auth = "Basic " + Base64.encodeToString(credentials.getBytes(), Base64.NO_WRAP);
        Log.i("BMI", auth);
        headers.put("Authorization", auth);
        return headers;
      }
    };
    queue.add(jsonRequest);
  }


}

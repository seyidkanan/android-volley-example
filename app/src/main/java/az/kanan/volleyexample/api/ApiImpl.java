package az.kanan.volleyexample.api;

import android.content.Context;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONObject;

/**
 * Created by Kanan on 4/30/2017.
 */

public class ApiImpl implements Api {

    private Context context;
    private static final String TAG = "API";

    public ApiImpl(Context context) {
        this.context = context;
    }

    @Override
    public void searchUser() {
        String url = "https://api.github.com/users/seyidkanan";
        JsonObjectRequest jsObjRequest = new JsonObjectRequest
                (Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        Log.i(TAG, "Response: " + response.toString());
                    }
                }, new Response.ErrorListener() {

                    @Override
                    public void onErrorResponse(VolleyError error) {
                        Log.i(TAG, error.toString());
                    }
                });
        MySingleton.getInstance(context).addToRequestQueue(jsObjRequest);
    }

}

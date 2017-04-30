package az.kanan.volleyexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import az.kanan.volleyexample.api.ApiImpl;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ApiImpl apiIml = new ApiImpl(this);
        apiIml.searchUser();
    }
}

package com.example.retrofit_api_calling.activitys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.example.retrofit_api_calling.api_helper.Api_Interface;
import com.example.retrofit_api_calling.R;
import com.example.retrofit_api_calling.api_helper.RetrofitClient;
import com.example.retrofit_api_calling.models.Category;
import com.example.retrofit_api_calling.models.Create;
import com.example.retrofit_api_calling.models.Data;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private Button btnGetData;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGetData = findViewById(R.id.btnGetData);
        listView = findViewById(R.id.listviewData);

        btnGetData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getDataFromAPI();
            }
        });

    }

    private void getDataFromAPI() {
        Api_Interface api_interface = RetrofitClient.getRetrofitInstance().create(Api_Interface.class);
        Call<Category> call = api_interface.dataModel("233");

        call.enqueue(new Callback<Category>() {
            @Override
            public void onResponse(Call<Category> call, Response<Category> response) {
                Log.d("TTT", "onResponse: "+response.body().getData().getCreate().get(0).getCatName());
                ArrayList<Create> data = new ArrayList<Create>();
                data = (ArrayList<Create>) response.body().getData().getCreate();
                String[] names = new String[data.size()];
                for (int i = 0; i < data.size(); i++)
                {
                    names[i] = "cat_name : " + data.get(i).getCatName() + "\ncat_type : " + data.get(i).getCatType() + "\nshort_desc : " + data.get(i).getShortDesc();
                }
                listView.setAdapter(new ArrayAdapter< String >(getApplicationContext(), android.R.layout.simple_list_item_1, names));

            }

            @Override
            public void onFailure(Call<Category> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "An error has occured", Toast.LENGTH_LONG).show();
            }
        });
    }
}
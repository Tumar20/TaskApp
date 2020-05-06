package com.geektech.taskapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import com.geektech.taskapp.models.Task;

public class FormActivity extends AppCompatActivity {
    private EditText editTitle;
    private EditText editDesc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_form);
        if (getSupportActionBar() != null) {
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
         getSupportActionBar().setTitle("Новая задача");
        }
        editTitle = findViewById(R.id.editTitle);
        editDesc = findViewById(R.id.editDesc);
    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }

    public void OnClick(View view) {
        String title = editTitle.getText().toString().trim();
        String desc = editDesc.getText().toString().trim();
        Task task =new Task(title, desc);
        Intent intent = new Intent();
        intent.putExtra("task", task);
        setResult(RESULT_OK, intent);
        finish();
    }
}

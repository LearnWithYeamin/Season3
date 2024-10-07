package com.myeamin.class3003;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    TextView tvDisplay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvDisplay = findViewById(R.id.tvDisplay);
        tvDisplay.setText("");

        Employee employee1 = new Employee();
        employee1.name = "Jubayer Hossain";
        employee1.position = "CEO";
        employee1.salary = 10000;

        Employee employee2 = new Employee();
        employee2.name = "Jhon";
        employee2.position = "Developer";
        employee2.salary = 20000;

        tvDisplay.append("\nName: " + employee1.name);
        tvDisplay.append("\nPosition: " + employee1.position);
        tvDisplay.append("\nSalary: " + employee1.salary + " USD");

        tvDisplay.append("\n\nName: " + employee2.name);
        tvDisplay.append("\nPosition: " + employee2.position);
        tvDisplay.append("\nSalary: " + employee2.salary + " USD");
    }
}
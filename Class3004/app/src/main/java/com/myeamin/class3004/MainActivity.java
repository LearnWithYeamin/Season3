package com.myeamin.class3004;

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
        employee1.setName("Jubayer Hossain");
        employee1.setPosition("CEO");
        employee1.setSalary(10000);

        Employee employee2 = new Employee();
        employee2.setName("Jhon");
        employee2.setPosition("Developer");
        employee2.setSalary(20000);

        tvDisplay.append("\nName: " + employee1.getName());
        tvDisplay.append("\nPosition: " + employee1.getPosition());
        tvDisplay.append("\nSalary: " + employee1.getSalary() + " USD");

        tvDisplay.append("\n\nName: " + employee2.getName());
        tvDisplay.append("\nPosition: " + employee2.getPosition());
        tvDisplay.append("\nSalary: " + employee2.getSalary() + " USD");
    }
}
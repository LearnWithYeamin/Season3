package com.myeamin.class3006;

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

        Employee employee1 = new Employee("Jubayer Hossain", "CEO", 10000);

        Employee employee2 = new Employee("Jhon", "Developer", 20000, 15);

        tvDisplay.append("\nName: " + employee1.getName());
        tvDisplay.append("\nPosition: " + employee1.getPosition());
        tvDisplay.append("\nSalary: " + employee1.getSalary() + " USD");

        tvDisplay.append("\n\nName: " + employee2.getName());
        tvDisplay.append("\nPosition: " + employee2.getPosition());
        tvDisplay.append("\nSalary: " + employee2.getSalary() + " USD");
    }
}
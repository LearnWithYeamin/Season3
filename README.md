<p align="center">
  <a href="https://github.com/i-rin-eam">
    <img src="https://avatars.githubusercontent.com/u/154800878?s=400&u=5d18880cc28646190a19a971bfcdbc54644eab07&v=4" alt="Logo" width="100" height="100">
  </a> 
<h1 align='center'>Class 3003: Creating Java Objects based on a Blueprint</h1>
<h3 align='center'>
  Subscribe <a href="https://www.youtube.com/watch?v=I3nGvV--2IU">Learn With Yeamin</a>
</h3>
</p>

## Step 1: Here is `activity_main.xml` code: 
```xml
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/main"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:background="@color/white"
    android:gravity="center"
    android:orientation="vertical"
    tools:context=".MainActivity">

    <TextView
        android:id="@+id/tvDisplay"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:text="Hello World!"
        android:textColor="@color/black"
        android:textSize="18sp" />

</LinearLayout>
```
## Step 2: Here is `MainActivity.java` code: 
```java
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
```
## Step 3: Here is `Employee.java` code: 
```java
package com.myeamin.class3003;

public class Employee {

    String name;
    String position;
    float salary;
}
```
## Authors

**Md Yeamin - Software Developer**

<h1 align="center">Thank You ❤️</h1>

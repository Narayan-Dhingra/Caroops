package com.example.caroops;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tv1, tv2, tv3, tv4, tv5;

    Vehicles vehicles;

    Car car;

    Mercedes mercedes;

    Motorcycle motorcycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tv1);
        tv2 = findViewById(R.id.tv2);
        tv3 = findViewById(R.id.tv3);
        tv4 = findViewById(R.id.tv4);
        tv5 = findViewById(R.id.tv5);

        vehicles = new Vehicles("Maruti", 80, 100,
                20, 4, false);
        car = new Car("Honda", 60, 200, 50,
                4, true, "red" );
        mercedes = new Mercedes("C200", 200, 300, 10,
                6, true, "Blue", "Tiger", "no", "yes");
        motorcycle = new Motorcycle("Pulsor", 150, 300, 10, 2,
            false, 2, 2 );

        tv1.setText(vehicles.toString());

        tv5.setText(motorcycle.sound() +" " +mercedes.applyBrakes());

        tv2.setText(car.toString());
        tv3.setText(mercedes.toString());
        tv4.setText(motorcycle.toString());


    }
}

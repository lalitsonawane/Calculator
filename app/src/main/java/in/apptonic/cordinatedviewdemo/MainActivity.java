package in.apptonic.cordinatedviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public EditText firstNumber;
    public EditText secondNumber;
    public Button calculate_add;
    public Button calculate_sub;
    public TextView resultDisplay;
    public Calculations calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialization block start
        firstNumber = findViewById(R.id.first_field);
        secondNumber = findViewById(R.id.second_field);
        calculate_add = findViewById(R.id.addition);
        calculate_sub = findViewById(R.id.subtraction);
        resultDisplay = findViewById(R.id.result_view);
        calculate = new Calculations();
        //Initialization block end

        calculate_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int num1 = Integer.parseInt(firstNumber.getText().toString());
                int num2 = Integer.parseInt(secondNumber.getText().toString());

                resultDisplay.setText(String.valueOf(calculate.addition(num1, num2)));
            }
        });
        calculate_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int num1 = Integer.parseInt(firstNumber.getText().toString());
                int num2 = Integer.parseInt(secondNumber.getText().toString());

                resultDisplay.setText(String.valueOf(calculate.subtraction(num1, num2)));
            }
        });
    }
}



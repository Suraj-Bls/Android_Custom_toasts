package com.careator.custom_toasts;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    btnToast= findViewById(R.id.btnToast);

    btnToast.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(MainActivity.this, "regular Toast", Toast.LENGTH_SHORT).show();

            showToast("custom toast");
        }

    });
    }

    public void showToast(String message)
    {
        View toastView= getLayoutInflater().inflate(R.layout.toast, (ViewGroup) findViewById(R.id.layout1));
        TextView textView= (TextView) toastView.findViewById(R.id.textView);
        textView.setText(message);

        Toast toast= new Toast(MainActivity.this);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(toastView);
        toast.setGravity(Gravity.CENTER_HORIZONTAL| Gravity.FILL_HORIZONTAL,0,0);
        toast.show();
    }


}

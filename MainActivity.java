package ismek.burhangok.datapassingbetweenfragments;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    EditText messageET;
    Button sendBT;

    String message="";

    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        messageET = findViewById(R.id.textarea);
        sendBT = findViewById(R.id.send);

        sendBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                message = messageET.getText().toString();

                fragmentManager = getSupportFragmentManager();
                fragmentTransaction= fragmentManager.beginTransaction();

                Bundle bundle = new Bundle();

                bundle.putString("MESSAGE",message);

               BlankFragment blankFragment = new BlankFragment();

                blankFragment.setArguments(bundle);

                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.replace(R.id.fragment_area,blankFragment);
                fragmentTransaction.commit();

            }
        });




    }
}

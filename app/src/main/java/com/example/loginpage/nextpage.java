package com.example.loginpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class nextpage extends AppCompatActivity {
    Button button1 , button2 , button3;
    FragmentManager fragmentManager;
    BlankFragment blankFragment;
    BlankFragment2 blankFragment2;
    BlankFragment3 blankFragment3;
    Intent intent;
    CheckBox checkBox;
    int c = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nextpage);
        /*intent = getIntent();

        String name = getIntent().getExtras().getString("DHRUV");
        System.out.println(name);
        Log.d("DHRUV" , name);

        Bundle bundle = new Bundle();
        bundle.getString("DHRUV" , name);*/

        button1 = findViewById(R.id.open_frag1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //while (c <= 4) {
                    switch (c) {
                        case 1:
                            blankFragment = new BlankFragment();
                            show_fragment(blankFragment, button1);
                            c++;
                            break;
                        case 2:
                            blankFragment2 = new BlankFragment2();
                            show_fragment(blankFragment2, button1);
                            c++;
                            break;
                        case 3:
                            blankFragment3 = new BlankFragment3();
                            show_fragment(blankFragment3, button1);
                            c++;
                            break;
                        default:
                            c = 1;
                    }
                //}
        }});
            /*switch (c){
                case 1:
                    blankFragment = new BlankFragment();
                    show_fragment(blankFragment , button1);
                    c++;
                    break;
                case 2:
                    blankFragment2 = new BlankFragment2();
                    show_fragment(blankFragment2 , button1);
                    c++;
                    break;
                case 3:
                    blankFragment3 = new BlankFragment3();
                    show_fragment(blankFragment3 , button1);
                    c++;
                    break;
                default:
                    c = 1;*/
        checkBox = findViewById(R.id.cb);
        checkBox.isChecked();
    }
    public void show_fragment(Fragment fragment , Button button){
        fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction()
                .replace(R.id.fragcont , fragment)
                .setReorderingAllowed(true)
                .addToBackStack(null)
                .commit();
    }
}
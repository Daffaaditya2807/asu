package com.example.tablelayout;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.inputmethod.EditorInfo;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Gajelas extends AppCompatActivity {
    FrameLayout frm1,frm2,frm3,frm4,frm5;
    Button keluar , kemana;
    EditText edt;
    AlertDialog.Builder builder;
    AutoCompleteTextView edtx;
    ArrayAdapter<CharSequence> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        HideTitleBar();
        setContentView(R.layout.activity_gajelas);
        cobaKlik();
    }
    private void HideTitleBar(){
        requestWindowFeature(Window.FEATURE_NO_TITLE); //will hide the title
        getSupportActionBar().hide(); // hide the title bar
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN); //enable full screen
    }

    public void cobaKlik(){

        frm1 = (FrameLayout) findViewById(R.id.frm1);
        frm2 = (FrameLayout) findViewById(R.id.frm2);
        frm3 = (FrameLayout) findViewById(R.id.frm3);
        frm4 = (FrameLayout) findViewById(R.id.frm4);
        frm5 = (FrameLayout) findViewById(R.id.frm5);
        keluar = (Button) findViewById(R.id.keluar);
        kemana = (Button) findViewById(R.id.kemana);

//        final EditText edt = (EditText) findViewById(R.id.cari);
        builder = new AlertDialog.Builder(this);
        keluar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        kemana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(getApplicationContext(),materialDesign.class);
                startActivity(pindah);
            }
        });


//        edt.setOnEditorActionListener(new TextView.OnEditorActionListener() {
//            @Override
//            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
//                boolean handled = false;
//                if (actionId == EditorInfo.IME_ACTION_SEND) {
//                    builder.setMessage("Maaf Pencarian atas "+edt.getText()+" tidak tersedia").setCancelable(false).setPositiveButton("YES", new DialogInterface.OnClickListener() {
//                        @Override
//                        public void onClick(DialogInterface dialogInterface, int i) {
//                            edt.setText("");
//
//                        }
//                    });
//
//                    AlertDialog alt = builder.create();
//                    alt.show();
//
//                    handled = true;
//                }
//                return handled;
//            }
//        });

        frm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),RecycleView.class);
                startActivity(i);

            }
        });
        frm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),spinnn.class);
                startActivity(i);

            }
        });
        frm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                builder.setMessage("Maaf Menu Wisata Belum Tersedia").setCancelable(false).setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                AlertDialog alt = builder.create();
                alt.show();

            }
        });
        frm4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pi =new Intent(getApplicationContext(),ScrolView.class);
                startActivity(pi);
            }
        });
        frm5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pi =new Intent(getApplicationContext(),ScrollViewHorizontal.class);
                startActivity(pi);
            }
        });
        edtx = (AutoCompleteTextView) findViewById(R.id.vieww);
        adapter = ArrayAdapter.createFromResource(this,R.array.countries_arry, android.R.layout.simple_list_item_1);
        edtx.setAdapter(adapter);
        edtx.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                boolean handled = false;
                if (i == EditorInfo.IME_ACTION_SEND) {
                    builder.setMessage("Maaf Negara  "+edtx.getText()+" Sedang Dikudeta Banteng").setCancelable(false).setPositiveButton("YES", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            edtx.setText("");


                        }
                    });

                    AlertDialog alt = builder.create();
                    alt.show();

                    handled = true;
                }
                return handled;
            }

        });
    }
}
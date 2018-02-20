package com.yevsp8.checkmanager;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class RecognisedCheckActivity extends AppCompatActivity {

    private Button buttonUpload;
    private ProgressDialog progressDialog;
    private TextView id;
    private TextView amount;
    private TextView paidto;
    private TextView paiddate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recognised_check);

        //egyenlőre demo data
        String demo_checkId = "0123456789876";
        String demo_amount = "1250";
        String demo_paidTo = "Főgáz";
        String demo_paidDate = "2017.12.02";

        TextView id = findViewById(R.id.recognised_check_id);
        TextView amount = findViewById(R.id.recognised_check_amount);
        TextView paidto = findViewById(R.id.recognised_check_paidTo);
        TextView paiddate = findViewById(R.id.recognised_check_paidDate);

        id.setText(demo_checkId);
        amount.setText(demo_amount);
        paidto.setText(demo_paidTo);
        paiddate.setText(demo_paidDate);

        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Recognise in progress...");

        buttonUpload = findViewById(R.id.button_upload);
        buttonUpload.setOnClickListener(new View.OnClickListener() {
                                            public void onClick(View v) {
                                                //TODO google api upload meghívása
                                            }
                                        }
        );

        progressDialog.show();
        callTesseractForRecognise();
        progressDialog.hide();


        //TODO Tesseract api meghívása, új adatok adatbázisba mentése
    }

    private void callTesseractForRecognise() {
        //TODO context függőségek átnézése
        //Check check;
        TessTwoApi tesseract = TessTwoApi.getInstance(getApplicationContext());
        String result = tesseract.getDataFromImage();

        //TODO egyenlőre csak ide berakja
        id.setText(result);
    }
}

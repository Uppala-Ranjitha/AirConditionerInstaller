package com.example.android.airconditionerinstaller;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SignUp extends AppCompatActivity {

    String msg;
    private Boolean flag = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }

    public void goToLogIn(View view) {
        Intent log = new Intent(this, MainActivity.class);
        startActivity(log);
    }
    public void sign(View view) {
        EditText ftname = (EditText) findViewById(R.id.first_name);
        EditText ltname = (EditText) findViewById(R.id.last_name);
        EditText email = (EditText) findViewById(R.id.email_reg);
        EditText pannum = (EditText) findViewById(R.id.pan_num);
        EditText aadharnum = (EditText) findViewById(R.id.aadhar_num);
        EditText bankname = (EditText) findViewById(R.id.bank_name);
        EditText brnchname = (EditText) findViewById(R.id.branch_name);
        EditText accnum = (EditText) findViewById(R.id.bank_acc);
        EditText ifscnum = (EditText) findViewById(R.id.ifsc_num);
        EditText pas = (EditText) findViewById(R.id.password_reg);
        EditText cpas = (EditText) findViewById(R.id.confirm_password_reg);


        String isfn = ftname.getText().toString();
        String isln = ltname.getText().toString();
        String isem = email.getText().toString();
        String ispan = pannum.getText().toString();
        String isaadhar = aadharnum.getText().toString();
        String isbname = bankname.getText().toString();
        String isbrname = brnchname.getText().toString();
        String isifsc = ifscnum.getText().toString();
        String isacc = accnum.getText().toString();
        String pasword = pas.getText().toString();
        String cpasword = cpas.getText().toString();

        Boolean sfn = TextUtils.isEmpty(isfn);
        Boolean sln = TextUtils.isEmpty(isln);
        Boolean sem =TextUtils.isEmpty(isem);
        Boolean span = TextUtils.isEmpty(ispan);
        Boolean saadhar = TextUtils.isEmpty(isaadhar);
        Boolean sbname = TextUtils.isEmpty(isbname);
        Boolean sbrname = TextUtils.isEmpty(isbrname);
        Boolean sacc = TextUtils.isEmpty(isacc);
        Boolean sifsc = TextUtils.isEmpty(isifsc);
        Boolean sp = TextUtils.isEmpty(pasword);
        Boolean scp = (TextUtils.isEmpty(cpasword)) || (!(pasword.equals(cpasword)));


        if (sfn) {
            msg = "You must enter your first name";
            TextView ln1 = (TextView) findViewById(R.id.confirm_star_fname);
            ln1.setText(msg);
        }
        else{
            msg = "*";
            TextView ln1 = (TextView) findViewById(R.id.confirm_star_fname);
            ln1.setText(msg);
        }

        if (sln) {
            msg = "You must enter your last name";
            TextView ln2 = (TextView) findViewById(R.id.confirm_star_lname);
            ln2.setText(msg);
        }
        else{
            msg = "*";
            TextView ln2 = (TextView) findViewById(R.id.confirm_star_lname);
            ln2.setText(msg);
        }

        if (sem) {
            msg = "You must enter your mail id";
            TextView mail = (TextView) findViewById(R.id.confirm_star_email);
            mail.setText(msg);
        }
        else{
            msg = "*";
            TextView mail = (TextView) findViewById(R.id.confirm_star_email);
            mail.setText(msg);
        }

        if (span) {
            msg = "You must enter your pan number";
            TextView ln3 = (TextView) findViewById(R.id.confirm_star_pan);
            ln3.setText(msg);
        }
        else{
            msg = "*";
            TextView ln3 = (TextView) findViewById(R.id.confirm_star_pan);
            ln3.setText(msg);
        }

        if (saadhar) {
            msg = "You must enter your aadhar number";
            TextView ln4 = (TextView) findViewById(R.id.confirm_star_aadhar);
            ln4.setText(msg);
        }
        else{
            msg = "*";
            TextView ln4 = (TextView) findViewById(R.id.confirm_star_aadhar);
            ln4.setText(msg);
        }

        if (sbname) {
            msg = "You must enter your bank name";
            TextView ln5 = (TextView) findViewById(R.id.confirm_star_bank_name);
            ln5.setText(msg);
        }
        else {
            msg = "*";
            TextView ln5 = (TextView) findViewById(R.id.confirm_star_bank_name);
            ln5.setText(msg);
        }

        if (sbrname) {
            msg = "You must enter your branch name";
            TextView ln6 = (TextView) findViewById(R.id.confirm_star_branch);
            ln6.setText(msg);
        }
        else {
            msg = "*";
            TextView ln6 = (TextView) findViewById(R.id.confirm_star_branch);
            ln6.setText(msg);
        }

        if (sacc) {
            msg = "You must enter your account number";
            TextView ln7 = (TextView) findViewById(R.id.confirm_star_acc);
            ln7.setText(msg);
        }
        else{
            msg = "*";
            TextView ln7 = (TextView) findViewById(R.id.confirm_star_acc);
            ln7.setText(msg);
        }

        if (sifsc) {
            msg = "You must enter your IFSC code";
            TextView ln8 = (TextView) findViewById(R.id.confirm_star_ifsc);
            ln8.setText(msg);
        }
        else {
            msg = "*";
            TextView ln8 = (TextView) findViewById(R.id.confirm_star_ifsc);
            ln8.setText(msg);
        }

        if (sp) {
            msg = "Enter password";
            TextView ln9 = (TextView) findViewById(R.id.confirm_star_password);
            ln9.setText(msg);
        }
        else{
            msg = "*";
            TextView ln9 = (TextView) findViewById(R.id.confirm_star_password);
            ln9.setText(msg);
        }

        if (scp) {
            msg = "Please confirm your password";
            TextView ln10 = (TextView) findViewById(R.id.confirm_star_cpassword);
            ln10.setText(msg);
        }
        else {
            msg = "*";
            TextView ln10 = (TextView) findViewById(R.id.confirm_star_cpassword);
            ln10.setText(msg);
        }
        if((! scp) && (! sp) && (! sifsc) && (! sacc) && (! sbrname) && (! sbname) && (! saadhar) && (! span) && (! sem) && (! sln) && (! sfn)){
            Toast.makeText(SignUp.this, "Your account details are saved",
                    Toast.LENGTH_SHORT).show();
            msg = "*";
            TextView ln10 = (TextView) findViewById(R.id.confirm_star_cpassword);
            ln10.setText(msg);
            TextView ln9 = (TextView) findViewById(R.id.confirm_star_password);
            ln9.setText(msg);
            TextView ln8 = (TextView) findViewById(R.id.confirm_star_ifsc);
            ln8.setText(msg);
            TextView ln7 = (TextView) findViewById(R.id.confirm_star_acc);
            ln7.setText(msg);
            TextView ln6 = (TextView) findViewById(R.id.confirm_star_branch);
            ln6.setText(msg);
            TextView ln5 = (TextView) findViewById(R.id.confirm_star_bank_name);
            ln5.setText(msg);
            TextView ln4 = (TextView) findViewById(R.id.confirm_star_aadhar);
            ln4.setText(msg);
            TextView mail = (TextView) findViewById(R.id.confirm_star_email);
            mail.setText(msg);
            TextView ln3 = (TextView) findViewById(R.id.confirm_star_pan);
            ln3.setText(msg);
            TextView ln2 = (TextView) findViewById(R.id.confirm_star_lname);
            ln2.setText(msg);
            TextView ln1 = (TextView) findViewById(R.id.confirm_star_fname);
            ln1.setText(msg);

        }

    }
}

package org.bubulescu.recapdialogs;

import android.app.Dialog;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CustomDialog extends DialogFragment {

    private EditText etIme;
    private Button btnIspis;

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View customDialog = inflater.inflate(R.layout.custom_dialog, null);

        builder.setTitle("Ovo je naslov");

        builder.setView(customDialog);

        etIme = customDialog.findViewById(R.id.etIme);
        btnIspis = customDialog.findViewById(R.id.btnIspis);

        btnIspis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String input = etIme.getText().toString();
                Toast.makeText(getActivity(), "Pozdrav " + input, Toast.LENGTH_SHORT).show();
                dismiss();
            }
        });

        AlertDialog custom = builder.create();
        return custom;

    }
}


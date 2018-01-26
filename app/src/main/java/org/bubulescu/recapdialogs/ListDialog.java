package org.bubulescu.recapdialogs;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;

/**
 * Created by marij on 24/01/2018.
 */

public class ListDialog extends DialogFragment {

    private String languages[];
    private String selectedLanguages = "";

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        languages = getResources().getStringArray(R.array.languages);
    }

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setTitle("Odaberi jezik");
/*        builder.setItems(languages, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String language = languages[which];
                MainActivity mainActivity = (MainActivity) getActivity();
                mainActivity.setLanguageTextViev(language);
            }
        });*/

        builder.setMultiChoiceItems(languages, null, new DialogInterface.OnMultiChoiceClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which, boolean isChecked) {
                selectedLanguages += languages[which] + ", ";
            }
        });

        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getActivity(), selectedLanguages, Toast.LENGTH_SHORT).show();
                dismiss();
            }
        });

        AlertDialog listDialog = builder.create();
        return listDialog;
    }
}

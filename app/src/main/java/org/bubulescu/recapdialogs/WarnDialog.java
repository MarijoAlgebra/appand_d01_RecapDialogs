package org.bubulescu.recapdialogs;

import android.app.Dialog;
import android.support.v4.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;

/**
 * Created by marij on 24/01/2018.
 */

public class WarnDialog extends DialogFragment {

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {

        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        builder.setMessage("Poruka o problemu!");
        builder.setTitle("Problem");
        builder.setIconAttribute(android.R.attr.alertDialogIcon);
        builder.setNeutralButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dismiss();
            }
        });

        AlertDialog warningDialog = builder.create();
        return warningDialog;
    }
}

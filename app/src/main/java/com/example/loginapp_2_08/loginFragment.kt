package com.example.loginapp_2_08

import android.content.DialogInterface
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.Fragment

class loginFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_layout,
            container, false)

        val button: Button = view.findViewById(R.id.button)

        button.setOnClickListener { v: View -> showDialOk(v)}

        return view
    }

    fun showDialOk(view: View){

        // build alert dialog
        val dialogBuilder = android.app.AlertDialog.Builder(getActivity())

        // set message of alert dialog
        dialogBuilder.setMessage("Logging in...")
            // if the dialog is cancelable
            .setCancelable(false)
            // positive button text and action
            .setPositiveButton("Ok", DialogInterface.OnClickListener {
                    dialog, id -> dialog.cancel()
            })

        // create dialog box
        val alert = dialogBuilder.create()
        // set title for alert dialog box
        alert.setTitle("Logging In")
        // show alert dialog
        alert.show()
    }
}

//updated code
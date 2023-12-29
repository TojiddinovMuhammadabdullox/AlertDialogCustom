package com.example.alertdialog

import android.content.DialogInterface
import android.content.DialogInterface.OnClickListener
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.alertdialog.databinding.ActivityMainBinding
import com.example.alertdialog.databinding.CustomDialogViewBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private var checkedItemPosition = 0
    private val checkedList = BooleanArray(3)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.dialogBrn.setOnClickListener {
            val dialogViewBinding = CustomDialogViewBinding.inflate(layoutInflater, null, false)
            val dialog = AlertDialog.Builder(this)
                .setView(dialogViewBinding.root)
                .setPositiveButton("Sign in") { _, _ ->
                    Log.d(
                        "dialog",
                        ":${dialogViewBinding.userNameEt.text} ${dialogViewBinding.userEmailEt.text}"
                    )
                }
                .setNegativeButton("Cancel"){_,_->}
                .create()

            dialog.show()
        }

    }
}
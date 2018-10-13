package htlperg.ac.at.androidform

import android.app.Activity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class FormActivity : Activity() {

    private var submitButton : Button? = null
    private var firstNameInput : TextView? = null
    private var nameInput : TextView? = null
    private var locationInput : TextView? = null
    private var plzInput : TextView? = null

    private val TAG = "RESULT_TAG"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.setContentView(R.layout.activity_form)
        this.initComponents()
    }
    private fun initComponents(){
        this.submitButton = this.findViewById(R.id.submitButton)
        this.firstNameInput = this.findViewById(R.id.editTextFirstname)
        this.nameInput = this.findViewById(R.id.editTextName)
        this.locationInput = this.findViewById(R.id.editTextLocation)
        this.plzInput = this.findViewById(R.id.editTextPLZ)

        this.submitButton!!.setOnClickListener({
            val msg = """Vorname = ${this.firstNameInput!!.text} Nachname = ${this.nameInput!!.text} Ort = ${this.locationInput!!.text} PLZ = ${this.locationInput!!.text}"""
            Log.d(TAG,msg)
            Toast.makeText(this,msg,Toast.LENGTH_LONG).show()
        })
    }
}

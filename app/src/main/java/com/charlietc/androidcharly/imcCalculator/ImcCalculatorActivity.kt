package com.charlietc.androidcharly.imcCalculator

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.charlietc.androidcharly.R

class ImcCalculatorActivity : AppCompatActivity() {

    private var isMaleSelected:Boolean = true
    private var isFemaleSelected:Boolean = false

    private lateinit var viewMale:CardView
    private lateinit var viewFemale:CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_imc_calculator)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets


        }
    // Inicializa los componentes
    initComponents()
    initListeners()
        initUI()

    }

    // función para inicializar los componetes de viewMale y viewFemale
    private fun initComponents() {
        viewMale = findViewById(R.id.viewMale)
        viewFemale = findViewById(R.id.viewFemale)

    }

    // Función para clickear cardView
    private fun initListeners() {
        viewMale.setOnClickListener{
            changeGender()
            setGenderColor()}

        viewFemale.setOnClickListener{
            changeGender()
            setGenderColor()}
    }
    private fun changeGender(){
        isMaleSelected = !isMaleSelected
        isFemaleSelected = !isFemaleSelected
    }

    // Función para cambiar el color de genero
    private fun setGenderColor(){

        viewMale.setCardBackgroundColor(getBackgroundColor(isMaleSelected))
        viewFemale.setCardBackgroundColor(getBackgroundColor(isFemaleSelected))
    }

    private fun getBackgroundColor(isSelectedComponent: Boolean ) : Int{
        val colorReference = if (isSelectedComponent){
            R.color.background_component_selected
        }else{
            R.color.background_component
        }
        return ContextCompat.getColor(this, colorReference)
    }

    private fun initUI() {
        setGenderColor()
    }
}
package com.aplicativo.cidadesustentavel

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.aplicativo.cidadesustentavel.databinding.ActivityMainBinding

/**
 * Main Activity - Menu Inicial
 *
 * @constructor Activity do Menu inicial do Aplicativo
 */
class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    /**
     * @constructor Implementação das bindings que definem as interações de clicks nos botões do Aplicativo
     *
     * @author Mayara Nicochelli
     * */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonPontosDeColeta.setOnClickListener(this)
        binding.buttonDicasSustentabilidade.setOnClickListener(this)
        binding.buttonSugestoes.setOnClickListener(this)
    }

    /**
     * Implementação das funções dos botões por Id do Aplicativo no Menu Principal
     *
     * @author Mayara Nicochelli
     * */
    override fun onClick(view: View) {
        if (view.id == R.id.button_pontos_de_coleta) {
            /**
             * Redireciona para o Maps com os pontos de coleta de reciclaveis
             * */
            startActivity(Intent(this, MapsActivity::class.java))
        } else if (view.id == R.id.button_dicas_sustentabilidade) {
            /**
             * Redireciona para Dicas de Reciclagem
             * */
            startActivity(Intent(this, ClueActivity::class.java))
        } else if (view.id == R.id.button_sugestoes) {
            /**
             * Redireciona para o Formulário de sugestões do Aplicativo
             * */
            startActivity(Intent(this, FormActivity::class.java))
        }
    }
}
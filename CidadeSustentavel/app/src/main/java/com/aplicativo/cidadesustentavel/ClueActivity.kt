package com.aplicativo.cidadesustentavel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.aplicativo.cidadesustentavel.databinding.ActivityDicasBinding

/**
 * Clue Activity - Dicas de Reciclagem
 *
 * @constructor Activity contendo Dicas de Reciclagem
 */
class ClueActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityDicasBinding

    /**
     * @constructor Implementação da função Dicas de como reciclar
     *
     * @author Mayara Nicochelli
     * */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        binding = ActivityDicasBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onClick(view: View) {
        // Função de click vazia pois a pagina não possui botoes
    }

}
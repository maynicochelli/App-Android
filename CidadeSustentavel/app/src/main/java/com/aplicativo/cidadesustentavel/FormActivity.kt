package com.aplicativo.cidadesustentavel

import android.os.Bundle
import android.util.Log
import android.util.Log.*
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.aplicativo.cidadesustentavel.databinding.ActivityFormBinding
import com.google.firebase.firestore.FieldValue
import com.google.firebase.firestore.FirebaseFirestore
import java.util.*

/**
 * Form Activity - Formulário de Sugestões
 *
 * @constructor Activity de Formulário de sugestões do Aplicativo
 */
class FormActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityFormBinding

    private val database = FirebaseFirestore.getInstance()

    /**
     * @constructor Implementação da função Formulário de sugestões
     *
     * @author Mayara Nicochelli
     * */
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()

        binding = ActivityFormBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /**
         * Interação do botão Enviar
         * */
        binding.buttonEnviar.setOnClickListener(this)
    }

    override fun onClick(view: View) {
        if (view.id == R.id.button_enviar) {
            /**
             * O method handleValidation possui as regras de negocios como validações
             * e a função de armazenar os dados do formulário no Banco de Dados
             * */
            handleValidation()
        }
    }

    /**
     * Implementação das validações dos campos em branco do formulário
     * Implementação do salvamento no Banco de Dados do Firebase
     *
     * @author Mayara Nicochelli
     * */
    private fun handleValidation() {
        val name = binding.editName.text.toString()
        val email = binding.editEmail.text.toString()
        val texto = binding.editSugestao.text.toString()

        /**
         * Validação se os campos forem vazios ou nulos mandar alerta para a função Toast
         * Caso os campos estiverem preenchidos as informações serão armazenadas no Banco de Dados
         * */
        if (name.isNullOrBlank()) {
            Toast.makeText(this, R.string.validation_nome, Toast.LENGTH_SHORT).show()
        } else if (email.isNullOrBlank()) {
            Toast.makeText(this, R.string.validation_email, Toast.LENGTH_SHORT).show()
        } else if (texto.isNullOrBlank()) {
            Toast.makeText(this, R.string.validation_sugestao, Toast.LENGTH_SHORT).show()
        } else {
            /**
             * Criação de lista(hashMap) que possui uma chave e valor para armazenar no Banco de Dados
             * */
            val usuarios = hashMapOf(
                "nome" to name,
                "email" to email,
                "sugestao" to texto
            )

            /**
             * Criação de timestamp que será o id de cada sugestão armazenada no Banco de Dados
             * */
            val calendar = Calendar.getInstance(Locale.getDefault())
            val timeStamp =
                android.text.format.DateFormat.format("yyyy:hh:mm:ss-", calendar).toString()

            database.collection("users").document(timeStamp + email).set(usuarios)
                .addOnCompleteListener {
                    /**
                     * Alerta e log para a sugestão enviada e salva,
                     * após enviado é feito limpeza dos campos do formulário
                     * */
                    Log.d("bancoDados", "Sucesso ao salvar sugestão no Banco de Dados")

                    Toast.makeText(this, R.string.validation_enviado, Toast.LENGTH_SHORT).show()
                    binding.editName.text.clear()
                    binding.editEmail.text.clear()
                    binding.editSugestao.text.clear()
                }.addOnFailureListener {
                    /**
                     * Alerta caso ocorra algum erro ao salvar os dados no Banco de Dados
                     * */
                    Log.d("bancoDados", "Erro ao salvar sugestão no Banco de Dados")
                }

        }
    }
}
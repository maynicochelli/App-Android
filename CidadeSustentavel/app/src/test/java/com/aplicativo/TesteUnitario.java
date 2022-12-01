package com.aplicativo;

import static org.junit.Assert.assertEquals;

import android.widget.Button;

import com.aplicativo.cidadesustentavel.BuildConfig;
import com.aplicativo.cidadesustentavel.FormActivity;
import com.aplicativo.cidadesustentavel.MainActivity;
import com.aplicativo.cidadesustentavel.R;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.annotation.Config;

/**
 * Classe de Teste Unitario
 *
 */
@RunWith(RobolectricTestRunner.class)
public class TesteUnitario {

    @Test
    public void testButtonClick() throws Exception {
        //Instancia da classe MainActivity
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);

        //O botao acionado no teste é o button_sugestoes do Menu Principal do Aplicativo
        Button button = (Button) activity.findViewById(R.id.button_sugestoes);
        button.performClick();

        //O resultado esperado
        assertEquals("Sugestões",button.getText());
    }

}

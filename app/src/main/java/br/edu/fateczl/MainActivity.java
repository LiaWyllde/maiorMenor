package br.edu.fateczl;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import br.edu.fateczl.controller.MaiorMenor;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button calcular;
    private Button limpar;
    private Button maiorMenor;

    private TextView mostraSoma;
    private TextView mostraMaior;
    private TextView mostraMenor;

    MaiorMenor testes = new MaiorMenor();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        num1 = findViewById(R.id.etNum1);
        num2 = findViewById(R.id.etNum2);
        calcular = findViewById(R.id.btCalcular);
        limpar = findViewById(R.id.bLimpar);
        maiorMenor = findViewById(R.id.btMaiorMenor);

        mostraSoma = findViewById(R.id.tvResultado);
        mostraMenor = findViewById(R.id.tvmostraMenor);
        mostraMaior = findViewById(R.id.mostraMaior);

        maiorMenor.setOnClickListener(click -> testezinhoFofo());
        calcular.setOnClickListener(click -> mostraSoma.setText(testes.somatoria(num1, num2)));
        limpar.setOnClickListener(click -> limpar());
    }

    public void testezinhoFofo (){
        mostraMaior.setText(testes.verificaMaior(num1, num2));
        mostraMenor.setText(testes.verificaMenor(num1, num2));
    }

    private void limpar() {
        Intent intent = new Intent(this, MainActivity.class);
        this.startActivity(intent);
        this.finish();
    }
}
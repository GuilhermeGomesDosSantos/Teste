import javafx.animation.RotateTransition;
import javafx.animation.SequentialTransition;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.ColumnConstraints;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.stage.Stage;
import javafx.util.Duration;

public class Calculadora extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		GridPane grid = new GridPane();
		Scene scn = new Scene(grid, 500, 250);
		
		TextField txtCE = new TextField();
		Button botao_CE = new Button("CE");
		
		
		//Botões dos Numeros
		Button botao_Zero = new Button("0");
		Button botao_01 = new Button("1");
		Button botao_02 = new Button("2");		
		Button botao_03 = new Button("3");		
		Button botao_04 = new Button("4");
		Button botao_05 = new Button("5");
		Button botao_06 = new Button("6");
		Button botao_07 = new Button("7");
		Button botao_08 = new Button("8");
		Button botao_09 = new Button("9");
		Button botao_Mais = new Button("+");
		Button botao_Sub = new Button("-");
		Button botao_Multi = new Button("*");
		Button botao_Div = new Button("/");
		Button botao_Igual = new Button("=");
		Button botao_Ponto = new Button(".");
		
		
		grid.add(txtCE, 0, 0);
		grid.add(botao_CE, 1, 0);
		
		grid.add(botao_01, 0, 1);
		grid.add(botao_02, 1, 1);
		grid.add(botao_03, 2, 1);
		grid.add(botao_Mais, 3, 1);
		grid.add(botao_04, 0, 2);
		grid.add(botao_05, 1, 2);
		grid.add(botao_06, 2, 2);
		grid.add(botao_Sub, 3, 2);
		grid.add(botao_07, 0, 3);
		grid.add(botao_08, 1, 3);
		grid.add(botao_09, 2, 3);
		grid.add(botao_Multi, 3, 3);
		grid.add(botao_Zero, 1, 4);
		grid.add(botao_Igual, 2, 4);
		grid.add(botao_Div, 3, 4);
		grid.add(botao_Ponto, 0, 4);
		
		
		stage.setScene(scn);
		stage.setTitle("Calculadora");
		stage.show();
	}
	
	public static void main(String[] args) {
		Application.launch(Calculadora.class, args);
	}

}
;
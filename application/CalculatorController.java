package application;

import java.util.ArrayList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import ExpressionUtilities.*;

public class CalculatorController {

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    @FXML
    private Button button0;
    
    @FXML
    private Button plus;

    @FXML
    private Button buttonminus;

    @FXML
    private Button buttonmult;

    @FXML
    private Button buttondiv;

    @FXML
    private Button buttonsquare;

    @FXML
    private Label output;
    
    int num;
    String num_string = "";
    ArrayList<Integer> numbers = new ArrayList<>();
    ParanthesisHandler handler = new ParanthesisHandler();

    @FXML
    void clicked1(MouseEvent event) {
    	/*button1.setOnMouseClicked(new Click1());*/
    	System.out.println("premuto mouse");
    	num = num*10 + 1;
    	num_string = num_string.concat("1");
    	output.setText(num_string);
    }

    @FXML
    void pressed1(KeyEvent event) {
    	/*button1.setOnKeyPressed(new Key());*/
    	System.out.println("premuto key");
    	
    	String value = event.getText();
    	
    	if(event.getCode() == KeyCode.ENTER) {
    		output.setText( String.valueOf( handler.CalculateResult(handler.InnermostParenthesis(num_string), numbers, num) ) );
    		num_string = "";
    		num = 0;
    		numbers.clear();
    		return;
    	}
    	
    	if (value.equals("+")) {
    		numbers.add(num);
    		num = 0;
    		num_string = num_string.concat(" + ");
    		output.setText(num_string);
    		return;
    	}
    	
    	if( value.equals("-")) {
    		numbers.add(num);
    		num = 0;
    		num_string = num_string.concat(" - ");
    		output.setText(num_string);
    		return;
    	}
    	
    	if( value.equals("x")) {
    		numbers.add(num);
    		num = 0;
    		num_string = num_string.concat(" x ");
    		output.setText(num_string);
    		return;
    	}
    	
    	if( value.equals(":")) {
    		numbers.add(num);
    		num = 0;
    		num_string = num_string.concat(" : ");
    		output.setText(num_string);
    		return;
    	}
    	
    	if( value.equals("=")) {
    		output.setText(String.valueOf(handler.CalculateResult(num_string, numbers, num)));
    	}
    	
    	
    	num = num*10 + Integer.parseInt(value);
    	System.out.println(num);
    	num_string = num_string.concat(value);
    	output.setText(num_string);
    }
    
    @FXML
    void click0(MouseEvent event) {
    	num = num*10 + 0;
    	num_string = num_string.concat("0");
    	output.setText(num_string);
    }

    @FXML
    void click2(MouseEvent event) {
    	num = num*10 + 2;
    	num_string = num_string.concat("2");
    	output.setText(num_string);
    }

    @FXML
    void click3(MouseEvent event) {
    	
    	num = num*10 + 3;
    	num_string = num_string.concat("3");
    	output.setText(num_string);

    }

    @FXML
    void click4(MouseEvent event) {
    	num = num*10 + 4;
    	num_string = num_string.concat("4");
    	output.setText(num_string);
    }

    @FXML
    void click5(MouseEvent event) {
    	num = num*10 + 5;
    	num_string = num_string.concat("5");
    	output.setText(num_string);
    }

    @FXML
    void click6(MouseEvent event) {
    	num = num*10 + 6;
    	num_string = num_string.concat("6");
    	output.setText(num_string);
    }

    @FXML
    void click7(MouseEvent event) {
    	num = num*10 + 7;
    	num_string = num_string.concat("7");
    	output.setText(num_string);
    }

    @FXML
    void click8(MouseEvent event) {
    	num = num*10 + 8;
    	num_string = num_string.concat("8");
    	output.setText(num_string);
    }

    @FXML
    void click9(MouseEvent event) {
    	num = num*10 + 9;
    	num_string = num_string.concat("9");
    	output.setText(num_string);
    }
    
    @FXML
    void pressminus(MouseEvent event) {
    	numbers.add(num);
		num = 0;
		num_string = num_string.concat(" - ");
		output.setText(num_string);
    }
    
    @FXML
    void pressequal(MouseEvent event) {
    	output.setText(String.valueOf(handler.CalculateResult(num_string, numbers, num)));
    	num_string = "";
    	num = 0;
    	numbers.clear();
    }

    @FXML
    void pressplus(MouseEvent event) {
    	numbers.add(num);
		num = 0;
		num_string = num_string.concat(" + ");
		output.setText(num_string);
    }
    
    @FXML
    void clickparenthesisopen(MouseEvent event) {
    	num_string = num_string.concat(" ( ");
    	output.setText(num_string);
    }
    
    @FXML
    void clickparenthesisclose(MouseEvent event) {
    	num_string = num_string.concat(" ) ");
    	output.setText(num_string);
    }
    
    
    

}

class Click1 implements EventHandler<MouseEvent>{

	@Override
	public void handle(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
class Key implements EventHandler<KeyEvent>{
	
	@Override
	public void handle(KeyEvent e) {
		// TODO Auto-generated method stub
		
		if( e.getCode() == KeyCode.DIGIT1);
	}
			
}
	


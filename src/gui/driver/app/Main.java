package gui.driver.app;
import java.util.ArrayList;

//import gui.driver.shaharTesting.ListViewTesting;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class Main extends Application {
	static Scene scene;
	Stage window;
	
	
	public static Class<? extends AbstractWindow> getLastWindowClass(ArrayList<AbstractWindow> prevWindows){
		switch (prevWindows.get(prevWindows.size() - 1).windowEnum) {
		case CHOOSE_ACTION:
			return ChooseAction.class;
		case GET_PASS_BY_MAIL:
			return GetPassByMail.class;
		case MY_DETAILS:
			return MyDetails.class;
		case MY_DETAILS_EDIT:
			return MyDetailsEdit.class;
	//	case OPENING: 
	//		return Opening.class; 
		default:
			return null;
		}
	}

	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		//ListViewTesting.display("listy", "hello");
		Opening opening = new Opening(); 
	//	ChooseAction chooseActionObject = new ChooseAction();
	//	ArrayList<AbstractWindow> prevWindows = new ArrayList<AbstractWindow>();
	//	prevWindows.add(chooseActionObject);
	//	chooseActionObject.display(primaryStage, WindowEnum.NONE, prevWindows);
		opening.start(primaryStage);
		
//		if (!ConfirmBox.display("Choose Action", "would you like to get password?"))
//			AlertBox.display("Goodbye!", "Hope you enjoyed!");
//		else
//			GetPassByMail.display(primaryStage, WindowEnum.NONE);
		
		
		
		//primaryStage.close();
		//VHBoxesExperiment.display(primaryStage);
	}

}

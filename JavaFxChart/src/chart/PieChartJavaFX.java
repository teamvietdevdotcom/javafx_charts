package chart;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author TVD
 */
public class PieChartJavaFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("JavaFX Pie Chart - Team Viet Dev (teamvietdev.com)");
        StackPane pane = new StackPane();
        pane.getChildren().add(createChart());
        stage.setScene(new Scene(pane, 600, 400));
        stage.show();
    }

    public PieChart createChart() {
        ObservableList<PieChart.Data> data = FXCollections.observableArrayList();
        data.addAll(new PieChart.Data("Africa", 30370000),
                new PieChart.Data("Antarctica", 14000000),
                new PieChart.Data("Asia", 44579000),
                new PieChart.Data("Europe", 10180000),
                new PieChart.Data("North America", 24709000),
                new PieChart.Data("Australia/Oceania", 8600000),
                new PieChart.Data("South America", 17840000));

        PieChart chart = new PieChart();
        chart.setData(data);
        chart.setTitle("The chart summarizes the area of each continent.");
        return chart;
    }

}

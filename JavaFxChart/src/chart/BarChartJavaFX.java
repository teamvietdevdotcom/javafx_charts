package chart;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author TVD
 */
public class BarChartJavaFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("JavaFX Bar Chart - Team Viet Dev (teamvietdev.com)");
        StackPane pane = new StackPane();
        pane.getChildren().add(createChart());
        stage.setScene(new Scene(pane, 600, 400));
        stage.show();
    }

    public BarChart createChart() {
        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setLabel("Region");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Area (km²)");

        XYChart.Series dataSeries = new XYChart.Series();
        dataSeries.setName("Region");
        dataSeries.getData().add(new XYChart.Data("Africa", 30370000));
        dataSeries.getData().add(new XYChart.Data("Antarctica", 14000000));
        dataSeries.getData().add(new XYChart.Data("Asia", 44579000));
        dataSeries.getData().add(new XYChart.Data("Europe", 10180000));
        dataSeries.getData().add(new XYChart.Data("North America", 24709000));
        dataSeries.getData().add(new XYChart.Data("Australia", 8600000));
        dataSeries.getData().add(new XYChart.Data("South America", 17840000));

        BarChart chart = new BarChart(xAxis, yAxis);
        chart.getData().add(dataSeries);
        chart.setTitle("The chart summarizes the area of each continent.");
        return chart;
    }

}

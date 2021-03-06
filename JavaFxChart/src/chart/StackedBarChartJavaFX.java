package chart;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author TVD
 */
public class StackedBarChartJavaFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("JavaFX Stacked Bar Chart - Team Viet Dev (teamvietdev.com)");
        StackPane pane = new StackPane();
        pane.getChildren().add(createChart());
        stage.setScene(new Scene(pane, 600, 400));
        stage.show();
    }

    public StackedBarChart createChart() {
        CategoryAxis xAxis = new CategoryAxis();
        xAxis.setLabel("Programming Languages");

        NumberAxis yAxis = new NumberAxis();
        yAxis.setLabel("Ratings (%)");

        XYChart.Series dataSeries1 = new XYChart.Series();
        dataSeries1.setName("Java");
        dataSeries1.getData().add(new XYChart.Data("2010", 16.01));
        dataSeries1.getData().add(new XYChart.Data("2012", 18.90));
        dataSeries1.getData().add(new XYChart.Data("2014", 17.05));
        dataSeries1.getData().add(new XYChart.Data("2016", 16.06));
        dataSeries1.getData().add(new XYChart.Data("2018", 20.22));
        dataSeries1.getData().add(new XYChart.Data("2020", 23.22));
        
        XYChart.Series dataSeries2 = new XYChart.Series();
        dataSeries2.setName("C");
        dataSeries2.getData().add(new XYChart.Data("2010", 16.41));
        dataSeries2.getData().add(new XYChart.Data("2012", 20.33));
        dataSeries2.getData().add(new XYChart.Data("2014", 15.05));
        dataSeries2.getData().add(new XYChart.Data("2016", 10.26));
        dataSeries2.getData().add(new XYChart.Data("2018", 6.56));
        dataSeries2.getData().add(new XYChart.Data("2020", 4.45));
        
        XYChart.Series dataSeries3 = new XYChart.Series();
        dataSeries3.setName("Python");
        dataSeries3.getData().add(new XYChart.Data("2010", 5.41));
        dataSeries3.getData().add(new XYChart.Data("2012", 3.20));
        dataSeries3.getData().add(new XYChart.Data("2014", 2.25));
        dataSeries3.getData().add(new XYChart.Data("2016", 3.22));
        dataSeries3.getData().add(new XYChart.Data("2018", 5.77));
        dataSeries3.getData().add(new XYChart.Data("2020", 8.12));

        StackedBarChart chart = new StackedBarChart(xAxis, yAxis);
        chart.getData().addAll(dataSeries1, dataSeries2, dataSeries3);
        chart.setTitle("Top Programming Languages");
        return chart;
    }

}

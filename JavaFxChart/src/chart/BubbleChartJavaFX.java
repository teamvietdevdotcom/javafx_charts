package chart;

import java.util.Random;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.BubbleChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.chart.XYChart.Series;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author TVD
 */
public class BubbleChartJavaFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("JavaFX Bubble Chart - Team Viet Dev (teamvietdev.com)");
        StackPane pane = new StackPane();
        pane.getChildren().add(createChart());
        stage.setScene(new Scene(pane, 600, 400));
        stage.show();
    }

    public BubbleChart createChart() {
        Series<Integer, Double> as = new Series<>();
        Series<Integer, Double> bs = new Series<>();
        Series<Integer, Double> cs = new Series<>();
        as.setName("Java");
        bs.setName("C");
        cs.setName("Python");

        Random r = new Random();

        for (int i = 2000; i <= 2018; i++) {
            double d = r.nextDouble();
            as.getData().add(new XYChart.Data<>(i, r.nextInt(32) + r.nextDouble(), 2 * d));
            bs.getData().add(new XYChart.Data<>(i, r.nextInt(32) + r.nextDouble(), 4 * d));
            cs.getData().add(new XYChart.Data<>(i, r.nextInt(32) + r.nextDouble(), 3 * d));
        }

        NumberAxis xAxis = new NumberAxis();
        NumberAxis yAxis = new NumberAxis();
        yAxis.setAutoRanging(false);
        yAxis.setLowerBound(0);
        yAxis.setUpperBound(30);

        xAxis.setAutoRanging(false);
        xAxis.setLowerBound(2000);
        xAxis.setUpperBound(2018);
        xAxis.setTickUnit(10);

        BubbleChart chart = new BubbleChart(xAxis, yAxis);
        chart.getData().addAll(as, bs, cs);
        chart.setTitle("Top Programming Languages");
        return chart;
    }

}

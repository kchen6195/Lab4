/**
 * Author: Kelvin Chen
 * Date: 12/22/2017
 * Lab 4.2
 */
package lab4_2;

import java.util.Arrays;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.scene.Scene;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;
 
public class StackedBarChartSample extends Application {
 
    final static String tech = "BROOKLYN TECH";
    final static String stuy = "STUYVESANT";
    final static String bronx = "BRONX SCI";
    final static String latin = "BROOKLYN LATIN";
    final static String staten = "STATEN ISLAND TECH";
    final CategoryAxis xAxis = new CategoryAxis();
    final NumberAxis yAxis = new NumberAxis();
    final StackedBarChart<String, Number> sbc =
            new StackedBarChart<String, Number>(xAxis, yAxis);
    final XYChart.Series<String, Number> series1 =
            new XYChart.Series<String, Number>();
 
    @Override
    public void start(Stage stage) {
        stage.setTitle("SAT SCORES");
        sbc.setTitle("AVERAGE SAT");
        xAxis.setLabel("SCHOOL");
        xAxis.setCategories(FXCollections.<String>observableArrayList(
                Arrays.asList(tech, stuy, bronx, latin, staten)));
        yAxis.setLabel("SAT SCORE");
        series1.setName("2012 test");
        series1.getData().add(new XYChart.Data<String, Number>(tech, 1833));
        series1.getData().add(new XYChart.Data<String, Number>(stuy, 2096));
        series1.getData().add(new XYChart.Data<String, Number>(bronx, 1969));
        series1.getData().add(new XYChart.Data<String, Number>(latin, 1740));
        series1.getData().add(new XYChart.Data<String, Number>(staten, 1953));
        
        Scene scene = new Scene(sbc, 800, 600);
        sbc.getData().addAll(series1);
        stage.setScene(scene);
        stage.show();
    }
 
    public static void main(String[] args) {
        launch(args);
    }
}
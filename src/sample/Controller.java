package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import math.ConverterUtils;

public class Controller {


    public TextField txtCelsius;
    public TextField txtFahrenheit;

    public void convertir(ActionEvent actionEvent) {
        double celsiusf = 0;
        double farenheitf = 0;

        System.out.println("Evento Convertir");

        String celsius = this.txtCelsius.getText();
        System.out.println("Grados Celsius " + celsius);

        try {
            celsiusf = Double.parseDouble(celsius);
            farenheitf = ConverterUtils.convierteCelsiusaFarenheit(celsiusf);
        } catch (NumberFormatException e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Error de Tipo");
            alert.setContentText("El tipo de dato deberá ser un numérico");
            alert.show();
            e.printStackTrace();
        }

        System.out.println("Resultado :" + farenheitf);

        this.txtFahrenheit.setText(Double.toString(farenheitf));

    }

}

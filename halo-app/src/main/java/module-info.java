module nl.dreamteam {
    requires javafx.controls;
    requires javafx.fxml;

    opens nl.dreamteam to javafx.fxml;
    exports nl.dreamteam;
}

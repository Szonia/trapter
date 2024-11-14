module szsz {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens szsz to javafx.fxml;
    exports szsz;
}

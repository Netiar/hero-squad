module com.herosquad.herosquad {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens com.herosquad.herosquad to javafx.fxml;
    exports com.herosquad.herosquad;
}
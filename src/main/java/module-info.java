
module MediTrack {

    requires transitive javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;

    opens MediTrack to javafx.fxml;
    
    exports MediTrack;
}
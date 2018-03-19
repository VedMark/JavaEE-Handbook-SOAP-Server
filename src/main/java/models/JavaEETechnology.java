package models;

import javafx.beans.property.SimpleStringProperty;

public class JavaEETechnology {
    private Integer id = null;
    private final SimpleStringProperty name;
    private final JavaEETechnologyVersions versions;
    private final SimpleStringProperty description;

    public JavaEETechnology(String name, JavaEETechnologyVersions versions, String description) {
        this.name = new SimpleStringProperty(name);
        this.versions = versions;
        this.description = new SimpleStringProperty(description);
    }

    public JavaEETechnology(Integer id, String name, JavaEETechnologyVersions versions, String description) {
        this.id = id;
        this.name = new SimpleStringProperty(name);
        this.versions = versions;
        this.description = new SimpleStringProperty(description);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name.get();
    }

    public void setName(String rName) {
        this.name.set(rName);
    }

    public String getVersionForJava4() {
        return versions.getVersionForJava4();
    }

    public void setVersionForJava4(String v4) {
        this.versions.setVersionForJava4(v4);
    }

    public String getVersionForJava5() {
        return versions.getVersionForJava5();
    }

    public void setVersionForJava5(String v5) {
        this.versions.setVersionForJava5(v5);
    }

    public String getVersionForJava6() {
        return versions.getVersionForJava6();
    }

    public void setVersionForJava6(String v6) {
        this.versions.setVersionForJava6(v6);
    }

    public String getVersionForJava7() {
        return versions.getVersionForJava7();
    }

    public void setVersionForJava7(String v7) {
        this.versions.setVersionForJava7(v7);
    }

    public String getVersionForJava8() {
        return versions.getVersionForJava8();
    }

    public void setVersionForJava8(String v8) {
        this.versions.setVersionForJava8(v8);
    }

    public String getDescription() {
        return description.get();
    }

    public void setDescription(String rDescription) {
        this.description.set(rDescription);
    }
}

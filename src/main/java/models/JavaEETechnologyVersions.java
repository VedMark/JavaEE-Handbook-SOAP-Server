package models;

import javafx.beans.property.SimpleStringProperty;

public class JavaEETechnologyVersions {
    private SimpleStringProperty versionForJava4;
    private SimpleStringProperty versionForJava5;
    private SimpleStringProperty versionForJava6;
    private SimpleStringProperty versionForJava7;
    private SimpleStringProperty versionForJava8;

    public JavaEETechnologyVersions(String v4, String v5, String v6, String v7, String v8) {
        this.versionForJava4 = new SimpleStringProperty(v4);
        this.versionForJava5 = new SimpleStringProperty(v5);
        this.versionForJava6 = new SimpleStringProperty(v6);
        this.versionForJava7 = new SimpleStringProperty(v7);
        this.versionForJava8 = new SimpleStringProperty(v8);
    }

    public String getVersionForJava4() {
        return versionForJava4.get();
    }

    public void setVersionForJava4(String rVForJava4) {
        this.versionForJava4.set(rVForJava4);
    }

    public String getVersionForJava5() {
        return versionForJava5.get();
    }

    public void setVersionForJava5(String rVForJava5) {
        this.versionForJava5.set(rVForJava5);
    }

    public String getVersionForJava6() {
        return versionForJava6.get();
    }

    public void setVersionForJava6(String rVForJava6) {
        this.versionForJava6.set(rVForJava6);
    }

    public String getVersionForJava7() {
        return versionForJava7.get();
    }

    public void setVersionForJava7(String rVForJava7) {
        this.versionForJava7.set(rVForJava7);
    }

    public String getVersionForJava8() {
        return versionForJava8.get();
    }

    public void setVersionForJava8(String rVForJava8) {
        this.versionForJava8.set(rVForJava8);
    }

    public void set(JavaEETechnologyVersions versions) {
        this.versionForJava4.set(versions.getVersionForJava4());
        this.versionForJava5.set(versions.getVersionForJava5());
        this.versionForJava6.set(versions.getVersionForJava6());
        this.versionForJava7.set(versions.getVersionForJava7());
        this.versionForJava8.set(versions.getVersionForJava8());
    }
}

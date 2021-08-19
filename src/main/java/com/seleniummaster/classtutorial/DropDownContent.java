package com.seleniummaster.classtutorial;

public enum DropDownContent {
    INDIA("India"),
    RUSSIA("Russia"),
    NORTH_AMERICA("North America");

    private String displayName;
    private String dev_url="https://www.devcubecart.com";

    DropDownContent(String displayName) {
        this.displayName = displayName;
    }


}

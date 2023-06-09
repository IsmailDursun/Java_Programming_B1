package day39_b_exception;

public class Image implements WebElement{

    public String extension;

    @Override
    public void click() {

    }

    @Override
    public String getText() {
        return getText();
    }

    @Override
    public void sendKeys(String txt) {

    }
    public String extension(String image){

        extension = image.substring(image.indexOf("."));
        return extension;

    }
}

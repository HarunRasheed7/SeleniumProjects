package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class POM extends CommonActions {
public POM() {
	PageFactory.initElements(driver, this);
}
@FindBy(xpath="(//input[@type='text'])[1]")
private WebElement search;

@FindBy(xpath="(//input[@type='submit'])[1]")
private WebElement button;
public WebElement getSearch() {
	return search;
}
public WebElement getTitle() {
	return title;
}
public WebElement getButton() {
	return button;
}
public WebElement getPhone() {
	return phone;
}
@FindBy(xpath="(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")
private WebElement phone;
@FindBy(id="productTitle")
private WebElement title;


}




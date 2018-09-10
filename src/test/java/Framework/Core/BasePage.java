package Framework.Core;




import Framework.DriverFactories.WebDrivers_Local;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by mdrahman on 9/8/18.
 * Spring 2018
 */
public class BasePage {

    WebDriver driver = WebDrivers_Local.getDriver();

    public void getPageTitle(){
        driver.getTitle();
    }

    public void getCurrentURL(){
        driver.getCurrentUrl();
    }

    public void clickOn(By locator){
        driver.findElement(locator).click();
    }

    public void enterText(By locator, String text){
        driver.findElement(locator).sendKeys(text);
    }
    public String getText(By locator){
        return driver.findElement(locator).getText();
    }

    public boolean isClickable(By locator){
        return driver.findElement(locator).isEnabled();
    }
    public boolean isSelectable(By locator){
        return driver.findElement(locator).isSelected();
    }
    public boolean isVisible(By locator){
        return driver.findElement(locator).isDisplayed();
    }

    public void selectByVisibleText(By locator, String text){
        WebElement ddm = driver.findElement(locator);
        Select select = new Select(ddm);
        select.selectByVisibleText(text);
    }
    public void selectByIndex(By locator, int num){
        WebElement ddm = driver.findElement(locator);
        Select select = new Select(ddm);
        select.selectByIndex(num);
    }
    public void selectByValue(By locator, String value){
        WebElement ddm = driver.findElement(locator);
        Select select = new Select(ddm);
        select.selectByValue(value);
    }

    public void options(By locator, String text){
        WebElement ddm = driver.findElement(locator);
        Select select = new Select(ddm);
        List <WebElement> options = select.getOptions();
        for (WebElement O: options){
         if(O.getText().contains(text)){
             System.out.println("Found");
             }
        }
    }

    public void mouseHoaver(By locator){
        WebElement element = driver.findElement(locator);
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
    }
    public void doubleClick(By locator){
        WebElement element = driver.findElement(locator);
        Actions action = new Actions(driver);
        action.doubleClick(element).build().perform();
    }
    public void contextClick(By locator){
        WebElement element = driver.findElement(locator);
        Actions action = new Actions(driver);
        action.contextClick(element).build().perform();
    }
    public void dragAndDrop(By locator1, By locator2){
        WebElement element1 = driver.findElement(locator1);
        WebElement element2 = driver.findElement(locator2);
        Actions action = new Actions(driver);
        action.dragAndDrop(element1, element2).build().perform();
    }

    public void alertAccept(){
        driver.switchTo().alert().accept();
    }
    public void alertDismiss(){
        driver.switchTo().alert().dismiss();
    }
    public void alertGetText(){
        driver.switchTo().alert().getText();
    }

    public void alertSendText(String text){
        driver.switchTo().alert().sendKeys(text);
    }
    public void refresh(){
        driver.navigate().refresh();
    }
    public void moveForward(){
        driver.navigate().forward();
    }
    public void moveBack(){
        driver.navigate().back();
    }

    public void switchFrameNumber(int frameNum){
        driver.switchTo().frame(frameNum);
    }

    public void switchFrameName(String frameName){
        driver.switchTo().frame(frameName);
    }

    public void switchWindows(){
        String parent = driver.getWindowHandle();
        Set <String> set = driver.getWindowHandles();
        Iterator <String> iterator = set.iterator();
        while(iterator.hasNext()){
            String child = iterator.next();
            if(parent!=child){
                driver.switchTo().window(child);
            }
        }
    }

    public void impliciteWait(int second){
        driver.manage().timeouts().implicitlyWait(second, TimeUnit.SECONDS);
    }

    public void sleep(int seconds) throws InterruptedException {
        Thread.sleep(seconds);
    }

    public void wait4ExpectedCondition(int seconds, By locator){
        WebDriverWait wait = new WebDriverWait(driver, seconds);
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

    public void getXYCoordinator(By locator){
        WebElement element = driver.findElement(locator);
        Point point = element.getLocation();
        int xCord = point.getX();
        int yCord = point.getY();

    }

    public void js_Click(By locator){
        WebElement element = driver.findElement(locator);
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
    }

    public void scrollByPoint(){
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(400,400)");
    }

    public void f10e(){

    }
    public void f10fe(){

    }
    public void f1h0e(){

    }





}

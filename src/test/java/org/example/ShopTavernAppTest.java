package org.example;

import jdk.dynalink.linker.support.*;

import MainWindows.ShopTavernApp;
import javafx.stage.Stage;
import org.junit.Before;
import org.junit.Test;
import org.testfx.api.FxRobot;
import org.testfx.api.FxToolkit;



import static org.testfx.api.FxAssert.verifyThat;
import static org.testfx.matcher.base.NodeMatchers.isVisible;

public class ShopTavernAppTest {

    @Before
    public void setUp() throws Exception {
        FxToolkit.registerPrimaryStage();
        FxToolkit.setupApplication(ShopTavernApp.class);
    }

    @Test
    public void testBuyButton() {
        new FxRobot().clickOn("#buyButton");
        verifyThat("#buyWindow", isVisible());
    }

      @Test
   public void testSellButton() {
          new FxRobot().clickOn("#sellButton");
          verifyThat("#sellWindow", isVisible());
      }

    @Test
    public void testExitButton() {
        FxRobot robot = new FxRobot();
        robot.clickOn("#exitButton");

    }
}

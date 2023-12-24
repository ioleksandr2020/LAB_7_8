package org.example;

import MainWindows.OpenBuyWindowCommand;
import org.junit.jupiter.api.Test;
import org.testfx.api.FxRobot;

import java.util.concurrent.TimeoutException;

import static org.testfx.api.FxAssert.verifyThat;
import static org.testfx.api.FxToolkit.registerPrimaryStage;
import static org.testfx.api.FxToolkit.setupApplication;
import static org.testfx.matcher.base.NodeMatchers.isVisible;
import static org.testfx.util.WaitForAsyncUtils.waitForFxEvents;

public class OpenBuyWindowCommandTest {

    @Test
    public void testArmorButton() throws TimeoutException {
        FxRobot robot = new FxRobot();
        registerPrimaryStage();

        OpenBuyWindowCommand openBuyWindowCommand = new OpenBuyWindowCommand(null); // Передайте null, оскільки не потрібен primaryStage для цього тесту
        openBuyWindowCommand.execute();

        robot.clickOn("#armorButton");
        waitForFxEvents();

        verifyThat("#buyArmorWindow", isVisible());
    }

    @Test
    public void testWeaponButton() throws TimeoutException {
        FxRobot robot = new FxRobot();
        registerPrimaryStage();

        OpenBuyWindowCommand openBuyWindowCommand = new OpenBuyWindowCommand(null);
        openBuyWindowCommand.execute();

        robot.clickOn("#weaponButton");
        waitForFxEvents();

        verifyThat("#buyWeaponWindow", isVisible());
    }

    @Test
    public void testPetsButton() throws TimeoutException {
        FxRobot robot = new FxRobot();
        registerPrimaryStage();

        OpenBuyWindowCommand openBuyWindowCommand = new OpenBuyWindowCommand(null);
        openBuyWindowCommand.execute();

        robot.clickOn("#petsButton");
        waitForFxEvents();

        verifyThat("#buyPetsWindow", isVisible());
    }

    @Test
    public void testCartButton() throws TimeoutException {
        FxRobot robot = new FxRobot();
        registerPrimaryStage();

        OpenBuyWindowCommand openBuyWindowCommand = new OpenBuyWindowCommand(null);
        openBuyWindowCommand.execute();

        robot.clickOn("#cartButton");
        waitForFxEvents();

        verifyThat("#cartWindow", isVisible());
    }

    @Test
    public void testBackButton() throws TimeoutException {
        FxRobot robot = new FxRobot();
        registerPrimaryStage();

        OpenBuyWindowCommand openBuyWindowCommand = new OpenBuyWindowCommand(null);
        openBuyWindowCommand.execute();

        robot.clickOn("#backButton");
        waitForFxEvents();

        // Перевірте, чи викликано новий екземпляр ShopTavernApp
        // і чи закритий попередній primaryStage
        // Також, перевірте, чи списки armors, weapons та petss очищені
    }
}

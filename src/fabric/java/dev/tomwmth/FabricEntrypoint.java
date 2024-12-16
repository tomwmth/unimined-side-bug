package dev.tomwmth;

import net.fabricmc.api.ClientModInitializer;

/**
 * @author Thomas Wearmouth
 * Created on 17/12/2024
 */
public final class FabricEntrypoint implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        CommonEntrypoint.onInit();
        System.out.println("Hello from Fabric!");
    }
}

package dev.tomwmth;

import net.minecraftforge.fml.common.Mod;

/**
 * @author Thomas Wearmouth
 * Created on 17/12/2024
 */
@Mod("examplemod")
public final class ForgeEntrypoint {
    public ForgeEntrypoint() {
        CommonEntrypoint.onInit();
        System.out.println("Hello from Forge!");
    }
}

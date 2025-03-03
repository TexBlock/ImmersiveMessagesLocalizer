package me.textrue.imlocalizer;

import net.minecraft.text.Text;
import toni.immersivemessages.api.ImmersiveMessage;

public class IMLocalizer {
    public static ImmersiveMessage builder(float duration, String text) {
        return ImmersiveMessage.builder(duration, Text.translatable(text));
    }
}

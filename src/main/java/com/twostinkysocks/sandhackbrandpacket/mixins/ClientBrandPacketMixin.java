package com.twostinkysocks.sandhackbrandpacket.mixins;

import net.minecraft.client.ClientBrandRetriever;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ClientBrandRetriever.class)
public class ClientBrandPacketMixin {
    @Inject(at = @At("HEAD"), method = "getClientModName", remap = false, cancellable = true)
    private static void inject(CallbackInfoReturnable<String> cir) {
        cir.setReturnValue("sandhack");
    }
}

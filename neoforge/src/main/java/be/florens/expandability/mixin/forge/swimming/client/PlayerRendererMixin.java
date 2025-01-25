package be.florens.expandability.mixin.forge.swimming.client;

import be.florens.expandability.EventDispatcher;
import be.florens.expandability.Util;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.player.AbstractClientPlayer;
import net.minecraft.client.renderer.entity.player.PlayerRenderer;
import net.minecraft.client.renderer.entity.state.PlayerRenderState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(PlayerRenderer.class)
public class PlayerRendererMixin {

    // todo: not sure if needed?
    //@ModifyExpressionValue(method = "setupRotations", require = 0 /* rendering only */, at = @At(value = "INVOKE", target = "Lnet/minecraft/client/player/AbstractClientPlayer;isInFluidType(Ljava/util/function/BiPredicate;)Z"))
    //private boolean setInFluidType(boolean original, PlayerRenderState arg, PoseStack arg2, float g, float h) {
    //    return Util.processEventResult(EventDispatcher.onPlayerSwim(player), original);
    //}
}

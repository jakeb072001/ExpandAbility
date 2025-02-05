package be.florens.expandability.test.fabric.mixin;

import carpet.patches.EntityPlayerMPFake;
import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.gametest.framework.StructureUtils;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.level.levelgen.structure.BoundingBox;
import net.minecraft.world.phys.AABB;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;

@Mixin(StructureUtils.class)
public class StructureUtilsMixin {

    @ModifyExpressionValue(method = "clearSpaceForStructure", at = @At(value = "INVOKE", target = "Lnet/minecraft/world/phys/AABB;of(Lnet/minecraft/world/level/levelgen/structure/BoundingBox;)Lnet/minecraft/world/phys/AABB;"))
    private static AABB clearFakePlayers(AABB aabb, BoundingBox boundingBox, ServerLevel serverLevel) {
        serverLevel.getEntitiesOfClass(EntityPlayerMPFake.class, aabb, p -> true)
                .forEach((fakePlayer) -> fakePlayer.kill(Component.empty()));

        return aabb;
    }
}

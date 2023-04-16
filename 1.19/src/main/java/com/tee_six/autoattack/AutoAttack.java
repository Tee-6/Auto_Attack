package com.tee_six.autoattack;

import net.fabricmc.api.Environment;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.minecraft.entity.Entity;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.fabricmc.api.EnvType;

@Environment(EnvType.CLIENT)
public class AutoAttack implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		ClientTickEvents.END_CLIENT_TICK.register(client -> {
			if (client.options.attackKey.isPressed() && client.player != null && client.player.getAttackCooldownProgress(0) >= 1) {
				if (client.crosshairTarget != null && client.crosshairTarget.getType() == HitResult.Type.ENTITY) {
					Entity entity = ((EntityHitResult)client.crosshairTarget).getEntity();
					if (entity.isAlive() && entity.isAttackable()) {
						client.interactionManager.attackEntity(client.player, entity);
					}
				}
			}
		});
	}
}

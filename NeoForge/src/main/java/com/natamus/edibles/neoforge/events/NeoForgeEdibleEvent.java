package com.natamus.edibles.neoforge.events;

import com.natamus.edibles.events.EdibleEvent;
import net.neoforged.neoforge.event.entity.player.PlayerInteractEvent;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;

@EventBusSubscriber
public class NeoForgeEdibleEvent {
	@SubscribeEvent
	public static void onBlockRightClick(PlayerInteractEvent.RightClickBlock e) {
		if (!EdibleEvent.onBlockRightClick(e.getLevel(), e.getEntity(), e.getHand(), e.getPos(), e.getHitVec())) {
			e.setCanceled(true);
		}
	}
	
	@SubscribeEvent
	public static void onClickEmpty(PlayerInteractEvent.RightClickItem e) {
		EdibleEvent.onClickEmpty(e.getEntity(), e.getLevel(), e.getHand());
	}
}
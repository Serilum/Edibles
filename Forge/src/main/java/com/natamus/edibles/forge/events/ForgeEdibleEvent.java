package com.natamus.edibles.forge.events;

import com.natamus.edibles.events.EdibleEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;

public class ForgeEdibleEvent {
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
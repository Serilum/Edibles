package com.natamus.edibles.forge.events;

import com.natamus.edibles.events.EdibleEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;

@EventBusSubscriber
public class ForgeEdibleEvent {
	@SubscribeEvent
	public void onBlockRightClick(PlayerInteractEvent.RightClickBlock e) {
		if (!EdibleEvent.onBlockRightClick(e.getLevel(), e.getEntity(), e.getHand(), e.getPos(), e.getHitVec())) {
			e.setCanceled(true);
		}
	}
	
	@SubscribeEvent
	public void onClickEmpty(PlayerInteractEvent.RightClickItem e) {
		EdibleEvent.onClickEmpty(e.getEntity(), e.getLevel(), e.getHand());
	}
}
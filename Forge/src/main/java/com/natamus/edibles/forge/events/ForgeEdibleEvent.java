package com.natamus.edibles.forge.events;

import com.natamus.edibles.events.EdibleEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.bus.BusGroup;
import net.minecraftforge.eventbus.api.listener.SubscribeEvent;

import java.lang.invoke.MethodHandles;

public class ForgeEdibleEvent {
	public static void registerEventsInBus() {
		BusGroup.DEFAULT.register(MethodHandles.lookup(), ForgeEdibleEvent.class);
	}

	@SubscribeEvent
	public static boolean onBlockRightClick(PlayerInteractEvent.RightClickBlock e) {
		if (!EdibleEvent.onBlockRightClick(e.getLevel(), e.getEntity(), e.getHand(), e.getPos(), e.getHitVec())) {
			return true;
		}
		return false;
	}
	
	@SubscribeEvent
	public static void onClickEmpty(PlayerInteractEvent.RightClickItem e) {
		EdibleEvent.onClickEmpty(e.getEntity(), e.getLevel(), e.getHand());
	}
}
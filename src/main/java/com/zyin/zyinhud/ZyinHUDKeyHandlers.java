package com.zyin.zyinhud;

import net.minecraft.client.settings.KeyBinding;

import com.zyin.zyinhud.keyhandlers.AnimalInfoKeyHandler;
import com.zyin.zyinhud.keyhandlers.CoordinatesKeyHandler;
import com.zyin.zyinhud.keyhandlers.DistanceMeasurerKeyHandler;
import com.zyin.zyinhud.keyhandlers.EatingAidKeyHandler;
import com.zyin.zyinhud.keyhandlers.EnderPearlAidKeyHandler;
import com.zyin.zyinhud.keyhandlers.PlayerLocatorKeyHandler;
import com.zyin.zyinhud.keyhandlers.PotionAidKeyHandler;
import com.zyin.zyinhud.keyhandlers.QuickDepositKeyHandler;
import com.zyin.zyinhud.keyhandlers.SafeOverlayKeyHandler;
import com.zyin.zyinhud.keyhandlers.WeaponSwapperKeyHandler;
import com.zyin.zyinhud.keyhandlers.ZyinHUDOptionsKeyHandler;

import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.InputEvent.KeyInputEvent;

public class ZyinHUDKeyHandlers
{
    private KeyBinding key_animalInfo = new KeyBinding(AnimalInfoKeyHandler.HotkeyDescription, AnimalInfoKeyHandler.Hotkey, ZyinHUD.MODNAME);
    private KeyBinding key_coordinates = new KeyBinding(CoordinatesKeyHandler.HotkeyDescription, CoordinatesKeyHandler.Hotkey, ZyinHUD.MODNAME);
    private KeyBinding key_distanceMeasurer = new KeyBinding(DistanceMeasurerKeyHandler.HotkeyDescription, DistanceMeasurerKeyHandler.Hotkey, ZyinHUD.MODNAME);
    private KeyBinding key_eatingAid = new KeyBinding(EatingAidKeyHandler.HotkeyDescription, EatingAidKeyHandler.Hotkey, ZyinHUD.MODNAME);
    private KeyBinding key_enderPearlAid = new KeyBinding(EnderPearlAidKeyHandler.HotkeyDescription, EnderPearlAidKeyHandler.Hotkey, ZyinHUD.MODNAME);
    private KeyBinding key_playerLocator = new KeyBinding(PlayerLocatorKeyHandler.HotkeyDescription, PlayerLocatorKeyHandler.Hotkey, ZyinHUD.MODNAME);
    private KeyBinding key_potionAid = new KeyBinding(PotionAidKeyHandler.HotkeyDescription, PotionAidKeyHandler.Hotkey, ZyinHUD.MODNAME);
    private KeyBinding key_quickDeposit = new KeyBinding(QuickDepositKeyHandler.HotkeyDescription, QuickDepositKeyHandler.Hotkey, ZyinHUD.MODNAME);
    private KeyBinding key_safeOverlay = new KeyBinding(SafeOverlayKeyHandler.HotkeyDescription, SafeOverlayKeyHandler.Hotkey, ZyinHUD.MODNAME);
    private KeyBinding key_weaponSwapper = new KeyBinding(WeaponSwapperKeyHandler.HotkeyDescription, WeaponSwapperKeyHandler.Hotkey, ZyinHUD.MODNAME);
    private KeyBinding key_zyinHUDOptions = new KeyBinding(ZyinHUDOptionsKeyHandler.HotkeyDescription, ZyinHUDOptionsKeyHandler.Hotkey, ZyinHUD.MODNAME);
    
	public ZyinHUDKeyHandlers()
	{
		ClientRegistry.registerKeyBinding(key_animalInfo);
		ClientRegistry.registerKeyBinding(key_coordinates);
		ClientRegistry.registerKeyBinding(key_distanceMeasurer);
		ClientRegistry.registerKeyBinding(key_eatingAid);
		ClientRegistry.registerKeyBinding(key_enderPearlAid);
		ClientRegistry.registerKeyBinding(key_playerLocator);
		ClientRegistry.registerKeyBinding(key_potionAid);
		ClientRegistry.registerKeyBinding(key_quickDeposit);
		ClientRegistry.registerKeyBinding(key_safeOverlay);
		ClientRegistry.registerKeyBinding(key_weaponSwapper);
		ClientRegistry.registerKeyBinding(key_zyinHUDOptions);
	}

	@SubscribeEvent
	public void KeyInputEvent(KeyInputEvent event) 
	{
		if(key_animalInfo.getIsKeyPressed())
			AnimalInfoKeyHandler.Pressed(event);
		if(key_coordinates.getIsKeyPressed())
			CoordinatesKeyHandler.Pressed(event);
		if(key_distanceMeasurer.getIsKeyPressed())
			DistanceMeasurerKeyHandler.Pressed(event);
		if(key_eatingAid.getIsKeyPressed())
			EatingAidKeyHandler.Pressed(event);
		if(key_enderPearlAid.getIsKeyPressed())
			EnderPearlAidKeyHandler.Pressed(event);
		if(key_playerLocator.getIsKeyPressed())
			PlayerLocatorKeyHandler.Pressed(event);
		if(key_potionAid.getIsKeyPressed())
			PotionAidKeyHandler.Pressed(event);
		if(key_quickDeposit.getIsKeyPressed())
			QuickDepositKeyHandler.Pressed(event);
		if(key_safeOverlay.getIsKeyPressed())
			SafeOverlayKeyHandler.Pressed(event);
		if(key_weaponSwapper.getIsKeyPressed())
			WeaponSwapperKeyHandler.Pressed(event);
		if(key_zyinHUDOptions.getIsKeyPressed())
			ZyinHUDOptionsKeyHandler.Pressed(event);
	}
}
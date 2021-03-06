package com.zyin.zyinhud.gui.buttons;

import org.lwjgl.input.Keyboard;

import com.zyin.zyinhud.keyhandlers.QuickDepositKeyHandler;

public class GuiQuickDepositHotkeyButton extends GuiHotkeyButton
{
	public GuiQuickDepositHotkeyButton(int id, int x, int y, int width,int height, String hotkey)
	{
		super(id, x, y, width, height, hotkey);
	}

	@Override
	protected void SetHotkey(String hotkey)
	{
		QuickDepositKeyHandler.Hotkey = Keyboard.getKeyIndex(hotkey);
	}

	@Override
	protected String GetHotkeyDescription()
	{
		return QuickDepositKeyHandler.HotkeyDescription;
	}
}

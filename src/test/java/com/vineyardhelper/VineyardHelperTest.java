package com.vineyardhelper;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class VineyardHelperTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(VineyardHelperPlugin.class);
		RuneLite.main(args);
	}
}
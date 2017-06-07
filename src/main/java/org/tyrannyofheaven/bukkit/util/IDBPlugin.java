package org.tyrannyofheaven.bukkit.util;

import org.bukkit.plugin.Plugin;

import com.avaje.ebean.EbeanServer;

public interface IDBPlugin extends Plugin {
	EbeanServer getDatabase();
}

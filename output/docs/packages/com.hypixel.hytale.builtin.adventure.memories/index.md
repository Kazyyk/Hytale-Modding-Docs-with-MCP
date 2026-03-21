---
title: "com.hypixel.hytale.builtin.adventure.memories"
kind: "package"
package: "com.hypixel.hytale.builtin.adventure.memories"
fqcn: "com.hypixel.hytale.builtin.adventure.memories"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "adventure"
  - "memories"
---

**Package:** `com.hypixel.hytale.builtin.adventure.memories`

Core memories system for Hytale's adventure mode. Provides the plugin lifecycle, gameplay configuration, memory recording and persistence, and player setup ECS systems.

## Types

| Type | Kind | Description |
|---|---|---|
| [MemoriesGameplayConfig](MemoriesGameplayConfig.md) | class | Gameplay config for memories thresholds and particles |
| [MemoriesPlugin](MemoriesPlugin.md) | class | Main plugin managing memories lifecycle and persistence |
| [MemoriesPlugin.MemoriesPluginConfig](MemoriesPlugin.MemoriesPluginConfig.md) | class | Plugin config holding collection radius map |
| [MemoriesPlugin.PlayerAddedSystem](MemoriesPlugin.PlayerAddedSystem.md) | class | ECS system sending memories feature status to players |

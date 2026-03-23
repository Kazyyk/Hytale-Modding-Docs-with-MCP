---
title: "interaction"
kind: "index"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction"
api_surface: false
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "interaction"
  - "index"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction`

Interaction system core types -- cooldown management, asset packet generators for interactions and root interactions, and unarmed interaction configuration.

## Types

| Type | Kind | Description |
|---|---|---|
| [CooldownHandler](CooldownHandler.md) | class | Manages interaction cooldowns with charge-based timers. Tracks per-interaction c... |
| [InteractionPacketGenerator](InteractionPacketGenerator.md) | class | Generates `UpdateInteractions` packets for synchronizing `Interaction` assets to... |
| [RootInteractionPacketGenerator](RootInteractionPacketGenerator.md) | class | Generates `UpdateRootInteractions` packets for synchronizing `RootInteraction` a... |
| [UnarmedInteractions](UnarmedInteractions.md) | class | JSON asset defining unarmed (empty-hand) interactions mapped by `InteractionType... |
| [UnarmedInteractionsPacketGenerator](UnarmedInteractionsPacketGenerator.md) | class | Generates `UpdateUnarmedInteractions` packets for synchronizing unarmed interact... |

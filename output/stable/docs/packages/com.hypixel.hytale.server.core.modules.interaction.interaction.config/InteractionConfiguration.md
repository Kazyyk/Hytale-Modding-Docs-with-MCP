---
title: "InteractionConfiguration"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.InteractionConfiguration"
api_surface: true
extends: ~
implements: ["NetworkSerializable<com.hypixel.hytale.protocol.InteractionConfiguration>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "interaction"
  - "config"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config`

```java
public class InteractionConfiguration implements NetworkSerializable<com.hypixel.hytale.protocol.InteractionConfiguration>
```

Configuration for interaction display settings including outlines, use distance per game mode, and priority mapping.

## Constants

| Type | Name |
|---|---|
| `InteractionConfiguration` | `DEFAULT` |
| `InteractionConfiguration` | `DEFAULT_WEAPON` |
| `BuilderCodec<InteractionConfiguration>` | `CODEC` |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `int` | `getPriorityFor(InteractionType interactionType, PrioritySlot slot)` |
| `public` | `float` | `getUseDistance(GameMode mode)` |
| `public` | `com.hypixel.hytale.protocol.InteractionConfiguration` | `toPacket()` |

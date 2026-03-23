---
title: "RemoveEntityInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.none.simple"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.none.simple.RemoveEntityInteraction"
api_surface: false
extends: "SimpleInstantInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "interaction"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.none.simple`

```java
public class RemoveEntityInteraction extends SimpleInstantInteraction
```

Interaction handler extending `SimpleInstantInteraction`.

## Fields

| Field | Type | Description |
|---|---|---|
| `entityTarget` | `InteractionTarget` | InteractionTarget field. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)` | `void` | protected method. |
| `simulateFirstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)` | `void` | protected method. |
| `generatePacket()` | `Interaction` | protected method. |
| `configurePacket(Interaction packet)` | `void` | protected method. |
| `toString()` | `String` | public method. |

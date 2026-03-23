---
title: "IncreaseBackpackCapacityInteraction"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server"
fqcn: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.server.IncreaseBackpackCapacityInteraction"
api_surface: false
extends: "com.hypixel.hytale.server.core.modules.interaction.interaction.config.SimpleInstantInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T12:00:00Z"
tags:
  - "interaction"
  - "inventory"
  - "server"
---

**Package:** `com.hypixel.hytale.server.core.modules.interaction.interaction.config.server`

```java
public class IncreaseBackpackCapacityInteraction extends SimpleInstantInteraction
```

Increases the player's backpack capacity by a configured amount. Resizes the backpack, sends a confirmation message to the player, and consumes one of the held item. Waits for server data.

## Codec Properties

| Key | Type | Required | Default | Description |
|---|---|---|---|---|
| `Capacity` | `short` | No (inherited) | `1` | The amount by which the backpack capacity is increased. Minimum value: 1. |

## Fields

| Type | Name | Default | Description |
|---|---|---|---|
| `short` | `capacity` | `1` | Amount to increase backpack capacity. |

## Methods

```java
@Nonnull
@Override
public WaitForDataFrom getWaitForDataFrom()
```

Returns `WaitForDataFrom.Server`.

```java
@Override
protected void firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler)
```

Gets the `Player` component, calculates new backpack capacity, calls `Inventory.resizeBackpack`, sends a translated size message, and removes one item from the held slot.

```java
@Override
public String toString()
```

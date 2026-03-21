---
title: "DeathItemLoss"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.entity.damage"
fqcn: "com.hypixel.hytale.server.core.modules.entity.damage.DeathItemLoss"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "damage"
  - "death"
  - "items"
  - "codec"
---

**Package:** `com.hypixel.hytale.server.core.modules.entity.damage`

```java
public class DeathItemLoss
```

Encapsulates the item loss configuration for a death event: which loss mode is active, the specific items lost, and the percentage-based loss values for item amounts and durability. Serializable via `BuilderCodec`. Used by [DeathComponent](DeathComponent.md) to pass loss data to the death/respawn screen.

## Static Fields

| Field | Type | Description |
|---|---|---|
| `CODEC` | `BuilderCodec<DeathItemLoss>` | Builder codec for JSON serialization. |

## Static Methods

```java
public static DeathItemLoss noLossMode()
```

Returns a singleton `DeathItemLoss` configured for no item loss (mode `NONE`, empty items, 0% loss).

## Constructor

```java
public DeathItemLoss(DeathConfig.ItemsLossMode lossMode, ItemStack[] itemsLost, double amountLossPercentage, double durabilityLossPercentage)
```

Creates a death item loss configuration with the given parameters.

## Methods

```java
public DeathConfig.ItemsLossMode getLossMode()
```

Returns the items loss mode (`ALL`, `CONFIGURED`, or `NONE`).

```java
public ItemStack[] getItemsLost()
```

Returns the array of items lost. Returns `ItemStack.EMPTY_ARRAY` if null.

```java
public double getAmountLossPercentage()
```

Returns the percentage of item quantities lost.

```java
public double getDurabilityLossPercentage()
```

Returns the percentage of item durability lost.

## Related Types

- [DeathComponent](DeathComponent.md) -- creates `DeathItemLoss` instances via `getDeathItemLoss()`
- [DeathSystems.DropPlayerDeathItems](DeathSystems.DropPlayerDeathItems.md) -- system that processes item drops

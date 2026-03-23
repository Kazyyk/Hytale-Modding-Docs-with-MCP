---
title: "GiveItemInteraction"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.shop"
fqcn: "com.hypixel.hytale.builtin.adventure.shop.GiveItemInteraction"
api_surface: false
extends: "ChoiceInteraction"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "adventure"
  - "shop"
---

**Package:** `com.hypixel.hytale.builtin.adventure.shop`

```java
public class GiveItemInteraction extends ChoiceInteraction
```

Interaction handler extending `ChoiceInteraction`.

## Fields

| Field | Type | Description |
|---|---|---|
| `itemId` | `String` | String field. |
| `quantity` | `int` | int field. |

## Constructors

| Constructor | Description |
|---|---|
| `GiveItemInteraction(String itemId, int quantity)` | Creates a new GiveItemInteraction instance. |
| `GiveItemInteraction()` | Creates a new GiveItemInteraction instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `getItemId()` | `String` | public method. |
| `getQuantity()` | `int` | public method. |
| `run(@Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef)` | `void` | public method. |
| `toString()` | `String` | public method. |

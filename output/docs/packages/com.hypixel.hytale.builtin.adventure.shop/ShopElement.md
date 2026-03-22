---
title: "ShopElement"
kind: "class"
package: "com.hypixel.hytale.builtin.adventure.shop"
fqcn: "com.hypixel.hytale.builtin.adventure.shop.ShopElement"
api_surface: false
extends: "ChoiceElement"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "adventure"
  - "shop"
---

**Package:** `com.hypixel.hytale.builtin.adventure.shop`

```java
public class ShopElement extends ChoiceElement
```

Concrete implementation extending `ChoiceElement`.

## Fields

| Field | Type | Description |
|---|---|---|
| `cost` | `int` | int field. |
| `iconPath` | `String` | String field. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `addButton(@Nonnull UICommandBuilder commandBuilder, UIEventBuilder eventBuilder, String selector, PlayerRef playerRef)` | `void` | public method. |
| `canFulfillRequirements(@Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef)` | `boolean` | public method. |

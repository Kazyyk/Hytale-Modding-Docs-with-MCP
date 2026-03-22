---
title: "HotbarManager"
kind: "class"
package: "com.hypixel.hytale.server.core.entity.entities.player"
fqcn: "com.hypixel.hytale.server.core.entity.entities.player.HotbarManager"
api_surface: true
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "player"
  - "entity"
---

**Package:** `com.hypixel.hytale.server.core.entity.entities.player`

```java
public class HotbarManager
```

Manages saved hotbar presets for a player. Supports up to 10 hotbar slots (indices 0-9). Save and load operations are restricted to Creative game mode. Serialized via `BuilderCodec` with keys `"SavedHotbars"` and `"CurrentHotbar"`.

## Fields

| Field | Type | Description |
|---|---|---|
| `HOTBARS_MAX` | `int` | Maximum number of hotbar slots (10). |
| `CODEC` | `BuilderCodec<HotbarManager>` | Serialization codec for saved hotbars and current index. |
| `savedHotbars` | `ItemContainer[]` | Array of saved hotbar item containers. |
| `currentHotbar` | `int` | Index of the currently active hotbar. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `saveHotbar(@Nonnull Ref<EntityStore> playerRef, short hotbarIndex, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` | `void` | Saves the player's current hotbar to the specified slot. Requires Creative mode; sends error message otherwise. |
| `loadHotbar(@Nonnull Ref<EntityStore> playerRef, short hotbarIndex, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` | `void` | Loads a saved hotbar into the player's active hotbar. Requires Creative mode. |
| `getCurrentHotbarIndex()` | `int` | Returns the index of the currently active hotbar. |
| `getIsCurrentlyLoadingHotbar()` | `boolean` | Returns true if a hotbar load is currently in progress. |

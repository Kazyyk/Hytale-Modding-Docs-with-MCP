---
title: "CraftingManager.ChestLookupResult"
kind: "record"
package: "com.hypixel.hytale.builtin.crafting.component"
fqcn: "com.hypixel.hytale.builtin.crafting.component.CraftingManager.ChestLookupResult"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "crafting"
  - "builtin"
---

**Package:** `com.hypixel.hytale.builtin.crafting.component`

```java
protected record ChestLookupResult(List<ItemContainer> containers, List<ItemContainerState> states, List<ItemContainerState> spatialResults, List<ItemContainerState> filteredOut, Vector3d benchCenteredPos)
```

Record holding the results of a spatial query for item containers around a crafting bench. Used by `feedExtraResourcesSection` to locate nearby chests for material access.

## Components

| Component | Type | Description |
|---|---|---|
| `containers` | `List<ItemContainer>` | Item containers within range. |
| `states` | `List<ItemContainerState>` | Block states of matched containers. |
| `spatialResults` | `List<ItemContainerState>` | All spatial query results before distance filtering. |
| `filteredOut` | `List<ItemContainerState>` | Results outside the search radius. |
| `benchCenteredPos` | `Vector3d` | Bench block position as a double vector. |

---
title: "MaterialExtraResourcesSection"
kind: "class"
package: "com.hypixel.hytale.server.core.entity.entities.player.windows"
fqcn: "com.hypixel.hytale.server.core.entity.entities.player.windows.MaterialExtraResourcesSection"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "core"
  - "entity"
  - "entities"
  - "player"
  - "windows"
  - "class"
---

**Package:** `com.hypixel.hytale.server.core.entity.entities.player.windows`

```java
public class MaterialExtraResourcesSection
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `boolean` | `valid` |
| `private` | `ItemContainer` | `itemContainer` |
| `private` | `ItemQuantity[]` | `extraMaterials` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `setExtraMaterials(ItemQuantity[] extraMaterials)` |
| `public` | `boolean` | `isValid()` |
| `public` | `void` | `setValid(boolean valid)` |
| `public` | `ExtraResources` | `toPacket()` |
| `public` | `ItemContainer` | `getItemContainer()` |
| `public` | `void` | `setItemContainer(ItemContainer itemContainer)` |

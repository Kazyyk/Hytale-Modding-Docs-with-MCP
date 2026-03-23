---
title: "CraftingRecipe"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.item.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.item.config.CraftingRecipe"
api_surface: true
extends: ~
implements: 
  - "JsonAssetWithMap<String, DefaultAssetMap<String, CraftingRecipe>>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "item"
  - "config"
  - "asset"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.item.config`

```java
public class CraftingRecipe implements JsonAssetWithMap<String, DefaultAssetMap<String, CraftingRecipe>>
```

Crafting recipe asset definition. Specifies input materials, output items, bench requirements, crafting time, knowledge requirements, memory level requirements, and fieldcraft category. Loaded from JSON and registered in a `DefaultAssetMap` for runtime lookup.

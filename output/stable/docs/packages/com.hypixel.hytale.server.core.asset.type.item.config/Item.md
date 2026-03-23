---
title: "Item"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.item.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.item.config.Item"
api_surface: true
extends: ~
implements: 
  - "JsonAssetWithMap<String, DefaultAssetMap<String, Item>>"
  - "NetworkSerializable<ItemBase>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "item"
  - "config"
  - "asset"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.item.config`

```java
public class Item implements JsonAssetWithMap<String, DefaultAssetMap<String, Item>>, NetworkSerializable<ItemBase>
```

Primary item asset definition. Central configuration class for all items in the game, loaded from JSON via `BuilderCodec`. Defines item identity, appearance, behavior (weapon, tool, armor, glider, utility), interactions, sounds, models, resource types, crafting categories, and placement rules. Provides static asset map access for runtime lookup by string ID or integer index.

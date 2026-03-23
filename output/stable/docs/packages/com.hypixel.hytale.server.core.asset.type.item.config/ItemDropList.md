---
title: "ItemDropList"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.item.config"
fqcn: "com.hypixel.hytale.server.core.asset.type.item.config.ItemDropList"
api_surface: false
extends: ~
implements: 
  - "JsonAssetWithMap<String, DefaultAssetMap<String, ItemDropList>>"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "item"
  - "config"
  - "asset"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.item.config`

```java
public class ItemDropList implements JsonAssetWithMap<String, DefaultAssetMap<String, ItemDropList>>
```

Named drop list asset. A reusable collection of `ItemDropContainer` entries that can be referenced by ID across multiple drop sources. Loaded from JSON and registered in a `DefaultAssetMap`.

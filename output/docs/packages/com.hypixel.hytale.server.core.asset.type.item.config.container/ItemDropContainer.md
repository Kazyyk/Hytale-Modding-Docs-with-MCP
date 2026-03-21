---
title: "ItemDropContainer"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.item.config.container"
fqcn: "com.hypixel.hytale.server.core.asset.type.item.config.container.ItemDropContainer"
api_surface: false
extends: ~
implements: 
  - "IWeightedElement"
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "item"
  - "drop-container"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.item.config.container`

```java
public abstract class ItemDropContainer implements IWeightedElement
```

Abstract base for all item drop containers. Provides weighted selection support and the `populateDrops` API for generating item drops. Defines the polymorphic `CODEC` (`CodecMapCodec`) used to deserialize container subtypes by `"Type"` key.

## Fields

| Field | Type | Description |
|---|---|---|
| `weight` | `double` | Selection weight (default 100.0). |
| `CODEC` | `CodecMapCodec<ItemDropContainer>` | Polymorphic codec dispatching by "Type" key. |
| `EMPTY_ARRAY` | `ItemDropContainer[]` | Empty container array constant. |


---
title: "MultipleItemDropContainer"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.item.config.container"
fqcn: "com.hypixel.hytale.server.core.asset.type.item.config.container.MultipleItemDropContainer"
api_surface: false
extends: "ItemDropContainer"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags:
  - "item"
  - "drop-container"
---

**Package:** `com.hypixel.hytale.server.core.asset.type.item.config.container`

```java
public class MultipleItemDropContainer extends ItemDropContainer
```

Drop container producing a random count of drops from child containers. Selects between `minCount` and `maxCount` children to evaluate.

## Fields

| Field | Type | Description |
|---|---|---|
| `containers` | `ItemDropContainer[]` | Child containers to select from. |
| `minCount` | `int` | Minimum number of children to evaluate (default 1). |
| `maxCount` | `int` | Maximum number of children to evaluate (default 1). |


---
title: "ChoiceItemDropContainer"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.item.config.container"
fqcn: "com.hypixel.hytale.server.core.asset.type.item.config.container.ChoiceItemDropContainer"
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
public class ChoiceItemDropContainer extends ItemDropContainer
```

Drop container that randomly selects from weighted child containers. Supports multiple rolls per evaluation via `rollsMin`/`rollsMax`.

## Fields

| Field | Type | Description |
|---|---|---|
| `containers` | `IWeightedMap<ItemDropContainer>` | Weighted map of child containers. |
| `rollsMin` | `int` | Minimum rolls (default 1). |
| `rollsMax` | `int` | Maximum rolls (default 1). |


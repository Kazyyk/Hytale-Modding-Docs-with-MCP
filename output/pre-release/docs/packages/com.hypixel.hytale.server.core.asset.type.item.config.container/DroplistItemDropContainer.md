---
title: "DroplistItemDropContainer"
kind: "class"
package: "com.hypixel.hytale.server.core.asset.type.item.config.container"
fqcn: "com.hypixel.hytale.server.core.asset.type.item.config.container.DroplistItemDropContainer"
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
public class DroplistItemDropContainer extends ItemDropContainer
```

Drop container that delegates to a named `ItemDropList` asset by ID. Tracks visited droplists to prevent circular references.

## Fields

| Field | Type | Description |
|---|---|---|
| `droplistId` | `String` | ID of the referenced ItemDropList asset. |


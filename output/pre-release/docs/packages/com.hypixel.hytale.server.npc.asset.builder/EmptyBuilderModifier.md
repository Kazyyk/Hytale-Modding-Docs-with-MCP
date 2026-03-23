---
title: "EmptyBuilderModifier"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.EmptyBuilderModifier"
api_surface: false
extends: "BuilderModifier"
implements: ~
generator_version: "2.0.0"
generated_at: "2026-03-20T00:00:00Z"
tags:
  - "npc"
  - "asset"
  - "builder"
---

**Package:** `com.hypixel.hytale.server.npc.asset.builder`

```java
public class EmptyBuilderModifier extends BuilderModifier
```

A singleton null-object implementation of [BuilderModifier](BuilderModifier.md). Used when a `"Modify"` block is absent or empty. `isEmpty()` returns `true`, `exportedStateCount()` returns `0`, and `applyComponentStateMap`/`popComponentStateMap` throw `UnsupportedOperationException`.

## Fields

| Field | Type | Description |
|---|---|---|
| `INSTANCE` | `EmptyBuilderModifier` | The singleton instance. |

## Related Types

- [BuilderModifier](BuilderModifier.md) -- parent class

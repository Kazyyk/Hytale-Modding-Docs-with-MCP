---
title: "BlockSelection"
kind: "class"
package: "com.hypixel.hytale.server.core.prefab.selection.standard"
fqcn: "com.hypixel.hytale.server.core.prefab.selection.standard.BlockSelection"
api_surface: false
extends: ~
implements:
  - "NetworkSerializable<EditorBlocksChange>"
  - "MetricProvider"
generator_version: "2.0.0"
generated_at: "2026-03-22T21:20:55Z"
tags:
  - "prefab"
  - "selection"
  - "block"
---

**Package:** `com.hypixel.hytale.server.core.prefab.selection.standard`

```java
public class BlockSelection implements NetworkSerializable<EditorBlocksChange>, MetricProvider
```

Core data structure representing a 3D selection of blocks, fluids, and entities. Supports placing into worlds, rotating, flipping, iterating blocks/fluids/entities, anchor positioning, and clipboard operations. Thread-safe with read-write locks for both block and entity data.
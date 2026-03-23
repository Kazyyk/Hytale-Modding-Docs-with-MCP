---
title: "BlockArray"
kind: "interface"
package: "com.hypixel.hytale.server.worldgen.util"
fqcn: "com.hypixel.hytale.server.worldgen.util.BlockArray"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "util"
  - "interface"
---

**Package:** `com.hypixel.hytale.server.worldgen.util`

```java
public interface BlockArray
```

Defines the contract for BlockArray operations. Provides access to an array of block IDs with containment checks.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| | `int[]` | `getBlocks()` |
| | `int` | `size()` |
| | `boolean` | `contains(int var1)` |

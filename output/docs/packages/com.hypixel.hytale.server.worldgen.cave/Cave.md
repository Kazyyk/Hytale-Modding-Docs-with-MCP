---
title: "Cave"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.cave"
fqcn: "com.hypixel.hytale.server.worldgen.cave.Cave"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "worldgen"
  - "cave"
---

**Package:** `com.hypixel.hytale.server.worldgen.cave`

```java
public class Cave
```

Represents a generated cave structure containing cave nodes organized by chunk index, with bounds tracking.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `long` | `getNodeCount()` |
| `public` | `CaveType` | `getCaveType()` |
| `public` | `WorldBounds` | `getBounds()` |
| `public` | `void` | `addNode(@Nonnull CaveNode element)` |
| `public` | `boolean` | `contains(long chunkIndex)` |
| `public` | `CaveNode[]` | `getCaveNodes(long chunkIndex)` |
| `public` | `void` | `compile()` |
| `public` | `String` | `toString()` |

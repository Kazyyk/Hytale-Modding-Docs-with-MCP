---
title: "BlockPriorityModifier"
kind: "interface"
package: "com.hypixel.hytale.server.worldgen.chunk"
fqcn: "com.hypixel.hytale.server.worldgen.chunk.BlockPriorityModifier"
api_surface: false
extends: "null"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "chunk"
  - "interface"
---

**Package:** `com.hypixel.hytale.server.worldgen.chunk`

```java
public interface BlockPriorityModifier
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `` | `BlockPriorityModifier` | `NONE` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `` | `public byte` | `modifyCurrent(byte current, byte target)` |
| `` | `public byte` | `modifyTarget(byte original, byte target)` |
| `` | `byte` | `modifyCurrent(byte var1, byte var2)` |
| `` | `byte` | `modifyTarget(byte var1, byte var2)` |

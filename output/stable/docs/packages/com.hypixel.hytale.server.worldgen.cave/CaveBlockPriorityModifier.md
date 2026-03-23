---
title: "CaveBlockPriorityModifier"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.cave"
fqcn: "com.hypixel.hytale.server.worldgen.cave.CaveBlockPriorityModifier"
api_surface: false
extends: ~
implements: ["BlockPriorityModifier"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "worldgen"
  - "cave"
---

**Package:** `com.hypixel.hytale.server.worldgen.cave`

```java
public class CaveBlockPriorityModifier implements BlockPriorityModifier
```

Modifies block priority values during cave carving to handle transitions between cave and non-cave blocks.

## Constants

| Type | Name |
|---|---|
| `BlockPriorityModifier` | `INSTANCE` |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `byte` | `modifyCurrent(byte current, byte target)` |
| `public` | `byte` | `modifyTarget(byte current, byte target)` |

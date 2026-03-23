---
title: "PrefabPasteUtil"
kind: "class"
package: "com.hypixel.hytale.server.worldgen.prefab"
fqcn: "com.hypixel.hytale.server.worldgen.prefab.PrefabPasteUtil"
api_surface: false
extends: ~
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "server"
  - "worldgen"
  - "prefab"
  - "class"
---

**Package:** `com.hypixel.hytale.server.worldgen.prefab`

```java
public class PrefabPasteUtil
```

Utility class for pasting prefabs into generated chunks during world generation. Handles block placement, entity placement, rotation, heightmap fitting, seed inheritance, and recursive child prefab generation (up to depth 10).

## Fields

| Modifier | Type | Field | Description |
|---|---|---|---|
| `public static final` | `int` | `MAX_RECURSION_DEPTH` | Maximum child prefab nesting depth (10) |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `void` | `generate(PrefabPasteBuffer buffer, PrefabRotation rotation, WorldGenPrefabSupplier supplier, int x, int y, int z, int cx, int cz)` |

## Inner Types

### PrefabPasteBuffer

```java
public static class PrefabPasteUtil.PrefabPasteBuffer extends PrefabBufferCall
```

Mutable buffer holding state during prefab pasting including world/chunk positions, seed, rotation, height conditions, and block mask.

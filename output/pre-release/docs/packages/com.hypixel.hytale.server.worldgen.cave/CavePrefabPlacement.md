---
title: "CavePrefabPlacement"
kind: "enum"
package: "com.hypixel.hytale.server.worldgen.cave"
fqcn: "com.hypixel.hytale.server.worldgen.cave.CavePrefabPlacement"
api_surface: true
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
public enum CavePrefabPlacement
```

Enumeration of prefab placement strategies within cave nodes: ceiling, floor, or default (center).

## Enum Constants

- `CEILING` -- Places prefabs at the ceiling of a cave node.
- `FLOOR` -- Places prefabs at the floor of a cave node.
- `DEFAULT` -- Places prefabs at the vertical center of a cave node.

## Constants

| Type | Name |
|---|---|
| `int` | `NO_HEIGHT` |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `CavePrefabPlacement.PrefabPlacementFunction` | `getFunction()` |

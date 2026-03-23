---
title: "CaveYawMode"
kind: "enum"
package: "com.hypixel.hytale.server.worldgen.cave"
fqcn: "com.hypixel.hytale.server.worldgen.cave.CaveYawMode"
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
public enum CaveYawMode
```

Enumeration controlling how a child node's yaw combines with the parent node's yaw and prefab rotation.

## Enum Constants

- `NODE` -- Uses the parent node's yaw directly.
- `SUM` -- Adds the parent prefab rotation's yaw to the parent node's yaw.
- `PREFAB` -- Uses only the parent prefab rotation's yaw, ignoring the parent node's yaw.

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public abstract` | `float` | `combine(float parentYaw, @Nullable PrefabRotation parentRotation)` |

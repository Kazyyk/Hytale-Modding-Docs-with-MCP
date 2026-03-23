---
title: "ReturnType"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.density.nodes.positions.returntypes"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.density.nodes.positions.returntypes.ReturnType"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "density"
  - "nodes"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.density.nodes.positions.returntypes`

```java
public abstract class ReturnType
```

Abstract base class providing shared logic for ReturnType implementations.

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `protected` | `double` | `maxDistance` | `Double.MAX_VALUE` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public abstract` | `double` | `get(double var1, double var3, @Nonnull Vector3d var5, @Nullable Vector3d var6, @Nullable Vector3d var7, @Nullable Density.Context var8)` |
| `public` | `void` | `setMaxDistance(double maxDistance)` |

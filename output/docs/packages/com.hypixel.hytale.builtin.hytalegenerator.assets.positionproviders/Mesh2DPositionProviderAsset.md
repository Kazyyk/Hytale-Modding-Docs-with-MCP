---
title: "Mesh2DPositionProviderAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.positionproviders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.positionproviders.Mesh2DPositionProviderAsset"
api_surface: false
extends: "PositionProviderAsset"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "hytalegenerator"
  - "assets"
  - "positionproviders"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.positionproviders`

```java
public class Mesh2DPositionProviderAsset extends PositionProviderAsset
```

A position provider asset used in world generation to define placement positions.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `PointGeneratorAsset` | `pointGeneratorAsset` |
| `private` | `int` | `y` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `PositionProvider` | `build(@Nonnull PositionProviderAsset.Argument argument)` |

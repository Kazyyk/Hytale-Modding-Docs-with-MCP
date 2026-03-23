---
title: "Mesh2DPositionProvider"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.positionproviders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.positionproviders.Mesh2DPositionProvider"
api_surface: false
extends: "PositionProvider"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "positionproviders"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.positionproviders`

```java
public class Mesh2DPositionProvider extends PositionProvider
```

Provider supplying Mesh2DPosition values based on context.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `PointProvider` | `pointGenerator` |
| `private final` | `int` | `y` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `Mesh2DPositionProvider(@Nonnull PointProvider positionProvider, int y)` |
| `@Override public` | `void` | `positionsIn(@Nonnull PositionProvider.Context context)` |

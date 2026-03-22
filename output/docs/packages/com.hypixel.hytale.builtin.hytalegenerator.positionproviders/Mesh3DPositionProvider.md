---
title: "Mesh3DPositionProvider"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.positionproviders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.positionproviders.Mesh3DPositionProvider"
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
public class Mesh3DPositionProvider extends PositionProvider
```

Provider supplying Mesh3DPosition values based on context.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `PointProvider` | `pointGenerator` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `Mesh3DPositionProvider(@Nonnull PointProvider positionProvider)` |
| `@Override public` | `void` | `positionsIn(@Nonnull PositionProvider.Context context)` |

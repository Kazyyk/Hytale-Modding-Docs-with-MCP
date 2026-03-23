---
title: "BoundPositionProvider"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.positionproviders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.positionproviders.BoundPositionProvider"
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
public class BoundPositionProvider extends PositionProvider
```

Provider supplying BoundPosition values based on context.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `PositionProvider` | `positionProvider` |
| `private final` | `Bounds3d` | `bounds` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `BoundPositionProvider(@Nonnull PositionProvider positionProvider, @Nonnull Bounds3d bounds)` |
| `@Override public` | `void` | `positionsIn(@Nonnull PositionProvider.Context context)` |

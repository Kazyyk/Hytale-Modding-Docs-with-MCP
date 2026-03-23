---
title: "OffsetPositionProvider"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.positionproviders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.positionproviders.OffsetPositionProvider"
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
public class OffsetPositionProvider extends PositionProvider
```

Provider supplying OffsetPosition values based on context.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `Vector3i` | `offset3i` |
| `@Nonnull private final` | `Vector3d` | `offset3d` |
| `@Nonnull private final` | `PositionProvider` | `positionProvider` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `OffsetPositionProvider(@Nonnull Vector3i offset, @Nonnull PositionProvider positionProvider)` |
| `public` | | `OffsetPositionProvider(@Nonnull Vector3d offset, @Nonnull PositionProvider positionProvider)` |
| `@Override public` | `void` | `positionsIn(@Nonnull PositionProvider.Context context)` |

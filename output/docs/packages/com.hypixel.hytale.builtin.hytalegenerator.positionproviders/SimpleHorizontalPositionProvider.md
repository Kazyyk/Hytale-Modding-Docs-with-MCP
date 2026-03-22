---
title: "SimpleHorizontalPositionProvider"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.positionproviders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.positionproviders.SimpleHorizontalPositionProvider"
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
public class SimpleHorizontalPositionProvider extends PositionProvider
```

Provider supplying SimpleHorizontalPosition values based on context.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `RangeDouble` | `rangeY` |
| `@Nonnull private final` | `PositionProvider` | `positionProvider` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `SimpleHorizontalPositionProvider(@Nonnull RangeDouble rangeY, @Nonnull PositionProvider positionProvider)` |
| `@Override public` | `void` | `positionsIn(@Nonnull PositionProvider.Context context)` |

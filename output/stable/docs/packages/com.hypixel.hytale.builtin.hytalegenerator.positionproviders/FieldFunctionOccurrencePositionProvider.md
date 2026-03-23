---
title: "FieldFunctionOccurrencePositionProvider"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.positionproviders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.positionproviders.FieldFunctionOccurrencePositionProvider"
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
public class FieldFunctionOccurrencePositionProvider extends PositionProvider
```

Provider supplying FieldFunctionOccurrencePosition values based on context.

## Constants

| Modifier | Type | Name | Value |
|---|---|---|---|
| `public static final` | `double` | `FP_RESOLUTION` | `100.0` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `Density` | `field` |
| `@Nonnull private final` | `PositionProvider` | `positionProvider` |
| `@Nonnull private final` | `SeedGenerator` | `seedGenerator` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `FieldFunctionOccurrencePositionProvider(@Nonnull Density field, @Nonnull PositionProvider positionProvider, int seed)` |
| `@Override public` | `void` | `positionsIn(@Nonnull PositionProvider.Context context)` |

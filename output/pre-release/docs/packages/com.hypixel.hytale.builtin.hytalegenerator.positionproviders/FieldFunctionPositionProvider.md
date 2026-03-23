---
title: "FieldFunctionPositionProvider"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.positionproviders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.positionproviders.FieldFunctionPositionProvider"
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
public class FieldFunctionPositionProvider extends PositionProvider
```

Provider supplying FieldFunctionPosition values based on context.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `Density` | `field` |
| `@Nonnull private final` | `List<FieldFunctionPositionProvider.Delimiter>` | `delimiters` |
| `@Nonnull private final` | `PositionProvider` | `positionProvider` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `FieldFunctionPositionProvider(@Nonnull Density field, @Nonnull PositionProvider positionProvider)` |
| `public` | `void` | `addDelimiter(double min, double max)` |
| `@Override public` | `void` | `positionsIn(@Nonnull PositionProvider.Context context)` |

---
title: "BaseHeightPositionProvider"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.positionproviders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.positionproviders.BaseHeightPositionProvider"
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
public class BaseHeightPositionProvider extends PositionProvider
```

Provider supplying BaseHeightPosition values based on context.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `double` | `baseHeight` |
| `private final` | `double` | `maxYInput` |
| `private final` | `double` | `minYInput` |
| `@Nonnull private final` | `PositionProvider` | `positionProvider` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `BaseHeightPositionProvider(double baseHeight, @Nonnull PositionProvider positionProvider, double minYInput, double maxYInput)` |
| `@Override public` | `void` | `positionsIn(@Nonnull PositionProvider.Context context)` |

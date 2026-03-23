---
title: "SpherePositionProvider"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.positionproviders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.positionproviders.SpherePositionProvider"
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
public class SpherePositionProvider extends PositionProvider
```

Provider supplying SpherePosition values based on context.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull private final` | `PositionProvider` | `positionProvider` |
| `private final` | `double` | `range` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `SpherePositionProvider(@Nonnull PositionProvider positionProvider, double range)` |
| `@Override public` | `void` | `positionsIn(@Nonnull PositionProvider.Context context)` |

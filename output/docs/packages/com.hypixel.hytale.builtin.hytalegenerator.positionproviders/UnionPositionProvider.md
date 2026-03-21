---
title: "UnionPositionProvider"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.positionproviders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.positionproviders.UnionPositionProvider"
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
public class UnionPositionProvider extends PositionProvider
```

Provider supplying UnionPosition values based on context.

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `@Nonnull private final` | `List<PositionProvider>` | `positionProviders` | `new ArrayList<>()` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `UnionPositionProvider(@Nonnull List<PositionProvider> positionProviders)` |
| `@Override public` | `void` | `positionsIn(@Nonnull PositionProvider.Context context)` |

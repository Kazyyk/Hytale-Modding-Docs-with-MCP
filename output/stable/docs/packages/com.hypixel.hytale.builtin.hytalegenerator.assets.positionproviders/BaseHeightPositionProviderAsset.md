---
title: "BaseHeightPositionProviderAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.positionproviders"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.positionproviders.BaseHeightPositionProviderAsset"
api_surface: false
extends: "PositionProviderAsset"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "hytalegenerator"
  - "assets"
  - "positionproviders"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.positionproviders`

```java
public class BaseHeightPositionProviderAsset extends PositionProviderAsset
```

A position provider asset used in world generation to define placement positions.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private` | `double` | `minYRead` |
| `private` | `double` | `maxYRead` |
| `private` | `String` | `baseHeightName` |
| `private` | `PositionProviderAsset` | `positionProviderAsset` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `PositionProvider` | `build(@Nonnull PositionProviderAsset.Argument argument)` |
| `` | `return new` | `BaseHeightPositionProvider(baseHeight, positionProvider, this.minYRead, this.maxYRead)` |
| `@Override public` | `void` | `cleanUp()` |

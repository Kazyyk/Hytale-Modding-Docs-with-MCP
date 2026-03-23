---
title: "PrefabPropAsset"
kind: "class"
package: "com.hypixel.hytale.builtin.hytalegenerator.assets.props.prefabprop"
fqcn: "com.hypixel.hytale.builtin.hytalegenerator.assets.props.prefabprop.PrefabPropAsset"
api_surface: false
extends: "PropAsset"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "hytalegenerator"
  - "assets"
  - "props"
---

**Package:** `com.hypixel.hytale.builtin.hytalegenerator.assets.props.prefabprop`

```java
public class PrefabPropAsset extends PropAsset
```

Asset definition for PrefabProp configuration data.

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `private` | `PrefabPropAsset.WeightedPathAsset[]` | `weightedPrefabPathAssets` | `new PrefabPropAsset.WeightedPathAsset[0]` |
| `private` | `boolean` | `legacyPath` | `false` |
| `private` | `boolean` | `loadEntities` | `true` |
| `private` | `DirectionalityAsset` | `directionalityAsset` | `new StaticDirectionalityAsset()` |
| `private` | `ScannerAsset` | `scannerAsset` | `new OriginScannerAsset()` |
| `private` | `BlockMaskAsset` | `blockMaskAsset` | `new BlockMaskAsset()` |
| `private` | `MoldingDirection` | `moldingDirectionName` | `MoldingDirection.NONE` |
| `private` | `ScannerAsset` | `moldingScannerAsset` | `new OriginScannerAsset()` |
| `private` | `PatternAsset` | `moldingPatternAsset` | `new ConstantPatternAsset()` |
| `private` | `boolean` | `moldChildren` | `false` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `void` | `cleanUp()` |
| `@Nonnull @Override public` | `Prop` | `build(@Nonnull PropAsset.Argument argument)` |
| `@Nullable private` | `List<PrefabBuffer>` | `loadPrefabBuffersFrom(@Nonnull String path)` |

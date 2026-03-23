---
title: "PrefabRootDirectory"
kind: "enum"
package: "com.hypixel.hytale.builtin.buildertools.prefabeditor.enums"
fqcn: "com.hypixel.hytale.builtin.buildertools.prefabeditor.enums.PrefabRootDirectory"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "buildertools"
  - "prefabeditor"
  - "enums"
  - "enum"
---

**Package:** `com.hypixel.hytale.builtin.buildertools.prefabeditor.enums`

```java
public enum PrefabRootDirectory
```

Enumerates PrefabRootDirectory values: `SERVER`, `ASSET`, `WORLDGEN`, `ASSET_ROOT`.

## Enum Constants

| Constant |
|---|
| `SERVER` |
| `ASSET` |
| `WORLDGEN` |
| `ASSET_ROOT` |

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private final` | `Supplier<Path>` | `prefabPath` |
| `private final` | `String` | `localizationString` |
| `private final` | `boolean` | `supportsMultiPack` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `Path` | `getPrefabPath()` |
| `public` | `String` | `getLocalizationString()` |
| `public` | `boolean` | `supportsMultiPack()` |
| `@Nonnull public` | `List<PrefabStore.AssetPackPrefabPath>` | `getAllPrefabPaths()` |

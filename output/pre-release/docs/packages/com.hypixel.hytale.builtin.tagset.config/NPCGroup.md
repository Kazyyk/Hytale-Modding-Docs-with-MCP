---
title: "NPCGroup"
kind: "class"
package: "com.hypixel.hytale.builtin.tagset.config"
fqcn: "com.hypixel.hytale.builtin.tagset.config.NPCGroup"
api_surface: false
extends: null
implements: ["JsonAssetWithMap", "TagSet"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "tagset"
  - "config"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.tagset.config`

```java
public class NPCGroup implements JsonAssetWithMap, TagSet
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `AssetBuilderCodec<String,NPCGroup>` | `CODEC` |
| `public static final` | `Codec<String>` | `CHILD_ASSET_CODEC` |
| `public static final` | `Codec<String[]>` | `CHILD_ASSET_CODEC_ARRAY` |
| `public static final` | `ValidatorCache<String>` | `VALIDATOR_CACHE` |
| `private static` | `AssetStore<String,NPCGroup,IndexedLookupTableAssetMap<String,NPCGroup>>` | `ASSET_STORE` |
| `protected` | `AssetExtraInfo.Data` | `data` |
| `protected` | `String` | `id` |
| `protected` | `String[]` | `includedGroupTags` |
| `protected` | `String[]` | `excludedGroupTags` |
| `protected` | `String[]` | `includedRoles` |
| `protected` | `String[]` | `excludedRoles` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `AssetStore<String,NPCGroup,IndexedLookupTableAssetMap<String,NPCGroup>>` | `getAssetStore()` |
| `public static` | `IndexedLookupTableAssetMap<String,NPCGroup>` | `getAssetMap()` |
| `public` | `String` | `getId()` |
| `@Override public` | `String[]` | `getIncludedTagSets()` |
| `@Override public` | `String[]` | `getExcludedTagSets()` |
| `@Override public` | `String[]` | `getIncludedTags()` |
| `@Override public` | `String[]` | `getExcludedTags()` |

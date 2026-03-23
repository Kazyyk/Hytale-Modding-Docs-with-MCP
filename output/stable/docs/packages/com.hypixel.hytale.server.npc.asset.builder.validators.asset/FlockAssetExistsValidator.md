---
title: "FlockAssetExistsValidator"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder.validators.asset"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.validators.asset.FlockAssetExistsValidator"
api_surface: false
extends: "AssetValidator"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "server"
  - "npc"
  - "asset"
  - "builder"
  - "validators"
  - "class"
---

**Package:** `com.hypixel.hytale.server.npc.asset.builder.validators.asset`

```java
public class FlockAssetExistsValidator extends AssetValidator
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `FlockAssetExistsValidator` | `DEFAULT_INSTANCE` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override @Nonnull public` | `String` | `getDomain()` |
| `@Override public` | `boolean` | `test(String flockAsset)` |
| `@Override @Nonnull public` | `String` | `errorMessage(String flockAsset, String attribute)` |
| `@Override @Nonnull public` | `String` | `getAssetName()` |
| `public static` | `FlockAssetExistsValidator` | `required()` |
| `@Nonnull public static` | `FlockAssetExistsValidator` | `withConfig(EnumSet<AssetValidator.Config> config)` |

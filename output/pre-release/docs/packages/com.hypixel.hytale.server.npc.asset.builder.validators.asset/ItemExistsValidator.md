---
title: "ItemExistsValidator"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder.validators.asset"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.validators.asset.ItemExistsValidator"
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
public class ItemExistsValidator extends AssetValidator
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `ItemExistsValidator` | `DEFAULT_INSTANCE` |
| `public static final` | `String` | `DROPLIST_PREFIX` |
| `private` | `boolean` | `requireBlock` |
| `private` | `boolean` | `allowDroplist` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override @Nonnull public` | `String` | `getDomain()` |
| `@Override public` | `boolean` | `test(String item)` |
| `@Override @Nonnull public` | `String` | `errorMessage(String item, String attributeName)` |
| `@Override @Nonnull public` | `String` | `getAssetName()` |
| `public static` | `ItemExistsValidator` | `required()` |
| `@Nonnull public static` | `ItemExistsValidator` | `requireBlock()` |
| `@Nonnull public static` | `ItemExistsValidator` | `orDroplist()` |
| `@Nonnull public static` | `ItemExistsValidator` | `withConfig(EnumSet<AssetValidator.Config> config)` |
| `@Nonnull public static` | `ItemExistsValidator` | `orDroplistWithConfig(EnumSet<AssetValidator.Config> config)` |

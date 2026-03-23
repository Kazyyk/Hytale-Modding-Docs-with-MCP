---
title: "EntityStatExistsValidator"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder.validators.asset"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.validators.asset.EntityStatExistsValidator"
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
public class EntityStatExistsValidator extends AssetValidator
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `EntityStatExistsValidator` | `DEFAULT_INSTANCE` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override @Nonnull public` | `String` | `getDomain()` |
| `@Override public` | `boolean` | `test(String entityStat)` |
| `@Override @Nonnull public` | `String` | `errorMessage(String entityStat, String attributeName)` |
| `@Override @Nonnull public` | `String` | `getAssetName()` |
| `public static` | `EntityStatExistsValidator` | `required()` |
| `@Nonnull public static` | `EntityStatExistsValidator` | `withConfig(EnumSet<AssetValidator.Config> config)` |

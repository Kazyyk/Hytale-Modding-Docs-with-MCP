---
title: "EnvironmentExistsValidator"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder.validators.asset"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.validators.asset.EnvironmentExistsValidator"
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
public class EnvironmentExistsValidator extends AssetValidator
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `EnvironmentExistsValidator` | `DEFAULT_INSTANCE` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override @Nonnull public` | `String` | `getDomain()` |
| `@Override public` | `boolean` | `test(String envName)` |
| `@Override @Nonnull public` | `String` | `errorMessage(String envName, String attribute)` |
| `@Override @Nonnull public` | `String` | `getAssetName()` |
| `public static` | `EnvironmentExistsValidator` | `required()` |
| `@Nonnull public static` | `EnvironmentExistsValidator` | `withConfig(EnumSet<AssetValidator.Config> config)` |

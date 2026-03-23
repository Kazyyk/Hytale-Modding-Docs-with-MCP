---
title: "WeatherExistsValidator"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder.validators.asset"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.validators.asset.WeatherExistsValidator"
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
public class WeatherExistsValidator extends AssetValidator
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `WeatherExistsValidator` | `DEFAULT_INSTANCE` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override @Nonnull public` | `String` | `getDomain()` |
| `@Override public` | `boolean` | `test(String value)` |
| `@Override @Nonnull public` | `String` | `errorMessage(String value, String attribute)` |
| `@Override @Nonnull public` | `String` | `getAssetName()` |
| `public static` | `WeatherExistsValidator` | `required()` |
| `@Nonnull public static` | `WeatherExistsValidator` | `withConfig(EnumSet<AssetValidator.Config> config)` |

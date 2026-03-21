---
title: "BeaconSpawnExistsValidator"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder.validators.asset"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.validators.asset.BeaconSpawnExistsValidator"
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
public class BeaconSpawnExistsValidator extends AssetValidator
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static final` | `BeaconSpawnExistsValidator` | `DEFAULT_INSTANCE` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override @Nonnull public` | `String` | `getDomain()` |
| `@Override public` | `boolean` | `test(String beacon)` |
| `@Override @Nonnull public` | `String` | `errorMessage(String beacon, String attributeName)` |
| `@Override @Nonnull public` | `String` | `getAssetName()` |
| `public static` | `BeaconSpawnExistsValidator` | `required()` |
| `@Nonnull public static` | `BeaconSpawnExistsValidator` | `withConfig(EnumSet<AssetValidator.Config> config)` |

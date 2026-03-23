---
title: "AssetArrayHolder"
kind: "class"
package: "com.hypixel.hytale.server.npc.asset.builder.holder"
fqcn: "com.hypixel.hytale.server.npc.asset.builder.holder.AssetArrayHolder"
api_surface: false
extends: "StringArrayHolder"
implements:
  []
generator_version: "2.0.0"
generated_at: "2026-03-21T06:16:36Z"
tags:
  - "server"
  - "npc"
---
**Package:** `com.hypixel.hytale.server.npc.asset.builder.holder`

```java
public class AssetArrayHolder extends StringArrayHolder
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `protected` | `AssetValidator` | `assetValidator` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `readJSON( @Nonnull JsonElement requiredJsonElement, int minLength, int maxLength, AssetValidator validator, String name, @Nonnull BuilderParameters builderParameters )` |
| `public` | `void` | `readJSON( JsonElement optionalJsonElement, int minLength, int maxLength, String[] defaultValue, AssetValidator validator, String name, @Nonnull BuilderParameters builderParameters )` |
| `public` | `String[]` | `get(ExecutionContext executionContext)` |
| `public` | `String[]` | `rawGet(ExecutionContext executionContext)` |
| `public` | `void` | `staticValidate()` |

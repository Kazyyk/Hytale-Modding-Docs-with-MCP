---
title: "CosmeticsModule"
kind: "class"
package: "com.hypixel.hytale.server.core.cosmetics"
fqcn: "com.hypixel.hytale.server.core.cosmetics.CosmeticsModule"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "cosmetics"
---

**Package:** `com.hypixel.hytale.server.core.cosmetics`

```java
public class CosmeticsModule extends JavaPlugin
```

Module that initializes and manages the cosmetics subsystem.

## Constants

| Type | Name |
|---|---|
| `PluginManifest` | `MANIFEST` |

## Key Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `protected` | `void` | `setup()` |
| `public` | `CosmeticRegistry` | `getRegistry()` |
| `public` | `Model` | `createRandomModel(@Nonnull Random random)` |
| `public` | `Model` | `createModel(@Nonnull com.hypixel.hytale.protocol.PlayerSkin skin)` |
| `public` | `Model` | `createModel(@Nonnull com.hypixel.hytale.protocol.PlayerSkin skin, float scale)` |
| `public` | `void` | `validateSkin(@Nonnull com.hypixel.hytale.protocol.PlayerSkin skin)` |
| `public static` | `CosmeticsModule` | `get()` |
| `public` | `com.hypixel.hytale.protocol.PlayerSkin` | `generateRandomSkin(@Nonnull Random random)` |
| `public` | `String` | `getPartType()` |
| `public` | `String` | `getPartId()` |

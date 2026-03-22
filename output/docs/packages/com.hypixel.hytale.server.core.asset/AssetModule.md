---
title: "AssetModule"
kind: "class"
package: "com.hypixel.hytale.server.core.asset"
fqcn: "com.hypixel.hytale.server.core.asset.AssetModule"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "asset"
  - "core"
---

**Package:** `com.hypixel.hytale.server.core.asset`

```java
public class AssetModule extends JavaPlugin
```

Core plugin managing asset pack discovery, registration, loading, validation, and file monitoring. Orchestrates the server's asset pipeline from boot through runtime hot-reload. Loads packs from command-line paths, the `mods/` directory, and plugin JARs.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `AssetModule` | `get()` |
| `@Nonnull public` | `AssetPack` | `getBaseAssetPack()` |
| `@Nonnull public` | `List<AssetPack>` | `getAssetPacks()` |
| `@Nullable public` | `AssetMonitor` | `getAssetMonitor()` |
| `@Nullable public` | `AssetPack` | `findAssetPackForPath(Path path)` |
| `public` | `boolean` | `isWithinPackSubDir(@Nonnull Path path, @Nonnull String subDir)` |
| `public` | `boolean` | `isAssetPathImmutable(@Nonnull Path path)` |
| `public` | `void` | `registerPack(@Nonnull String name, @Nonnull Path path, @Nonnull PluginManifest manifest, boolean ignoreIfExists)` |
| `public` | `void` | `unregisterPack(@Nonnull String name)` |
| `@Nullable public` | `AssetPack` | `getAssetPack(@Nonnull String name)` |
| `public` | `void` | `initPendingStores()` |

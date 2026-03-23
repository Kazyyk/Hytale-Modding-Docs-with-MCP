---
title: "CreativeHubPlugin"
kind: "class"
package: "com.hypixel.hytale.builtin.creativehub"
fqcn: "com.hypixel.hytale.builtin.creativehub.CreativeHubPlugin"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "creative-hub"
---

**Package:** `com.hypixel.hytale.builtin.creativehub`

```java
public class CreativeHubPlugin extends JavaPlugin
```

Plugin that registers systems, commands, interactions for the builtin subsystem.

## Fields

| Field | Type | Description |
|---|---|---|
| `instance` | `CreativeHubPlugin` | Static CreativeHubPlugin field. |
| `creativeHubEntityConfigComponentType` | `ComponentType<EntityStore, CreativeHubEntityConfig>` | ComponentType<EntityStore, CreativeHubEntityConfig> field. |

## Constructors

| Constructor | Description |
|---|---|
| `CreativeHubPlugin(@Nonnull JavaPluginInit init)` | Creates a new CreativeHubPlugin instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `get()` | `CreativeHubPlugin` | static public method. |
| `getOrSpawnHubInstance(@Nonnull World parentWorld, @Nonnull CreativeHubWorldConfig hubConfig, @Nonnull Transform returnPoint)` | `World` | public method. |
| `getActiveHubInstance(@Nonnull World parentWorld)` | `World` | public method. |
| `clearHubInstance(@Nonnull UUID parentWorldUuid)` | `void` | public method. |
| `spawnPermanentWorldFromTemplate(@Nonnull String instanceAssetName, @Nonnull String permanentWorldName)` | `CompletableFuture<World>` | public method. |
| `getCreativeHubEntityConfigComponentType()` | `ComponentType<EntityStore, CreativeHubEntityConfig>` | public method. |
| `setup()` | `void` | protected method. |
| `onWorldRemove(@Nonnull RemoveWorldEvent event)` | `void` | static private method. |
| `onPlayerConnect(@Nonnull PlayerConnectEvent event)` | `void` | static private method. |
| `onPlayerAddToWorld(@Nonnull AddPlayerToWorldEvent event)` | `void` | static private method. |

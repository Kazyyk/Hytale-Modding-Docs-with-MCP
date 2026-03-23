---
title: "InstancesPlugin"
kind: "class"
package: "com.hypixel.hytale.builtin.instances"
fqcn: "com.hypixel.hytale.builtin.instances.InstancesPlugin"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T16:20:05Z"
tags:
  - "builtin"
  - "instances"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.instances`

```java
public class InstancesPlugin extends JavaPlugin
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `private static` | `InstancesPlugin` | `instance` |
| `public static final` | `String` | `INSTANCE_PREFIX` |
| `public static final` | `String` | `CONFIG_FILENAME` |
| `private ResourceType<ChunkStore,` | `InstanceDataResource>` | `instanceDataResourceType` |
| `private ComponentType<EntityStore,` | `InstanceEntityConfig>` | `instanceEntityConfigComponentType` |
| `private ComponentType<ChunkStore,` | `InstanceBlock>` | `instanceBlockComponentType` |
| `private ComponentType<ChunkStore,` | `ConfigurableInstanceBlock>` | `configurableInstanceBlockComponentType` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `InstancesPlugin` | `get()` |
| `@Override protected` | `void` | `setup()` |
| `@Nonnull public` | `CompletableFuture<World>` | `spawnInstance(@Nonnull String name, @Nonnull World forWorld, @Nonnull Transform returnPoint)` |
| `@Nonnull public` | `CompletableFuture<World>` | `spawnInstance(@Nonnull String name, @Nullable String worldName, @Nonnull World forWorld, @Nonnull Transform returnPoint)` |
| `public static` | `void` | `teleportPlayerToLoadingInstance( @Nonnull Ref<EntityStore> entityRef, @Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull CompletableFuture<World> worldFuture, @Nullable Transform overrideReturn )` |
| `public static` | `void` | `teleportPlayerToInstance( @Nonnull Ref<EntityStore> playerRef, @Nonnull ComponentAccessor<EntityStore> componentAccessor, @Nonnull World targetWorld, @Nullable Transform overrideReturn )` |
| `public static` | `CompletableFuture<Void>` | `exitInstance(@Nonnull Ref<EntityStore> targetRef, @Nonnull ComponentAccessor<EntityStore> componentAccessor)` |
| `public static` | `void` | `safeRemoveInstance(@Nonnull String worldName)` |
| `public static` | `void` | `safeRemoveInstance(@Nonnull UUID worldUUID)` |
| `public static` | `void` | `safeRemoveInstance(@Nullable World instanceWorld)` |
| `@Nonnull public static` | `Path` | `getInstanceAssetPath(@Nonnull String name)` |
| `public static` | `boolean` | `doesInstanceAssetExist(@Nonnull String name)` |
| `@Nonnull public static` | `CompletableFuture<World>` | `loadInstanceAssetForEdit(@Nonnull String name)` |
| `@Nonnull public` | `List<String>` | `getInstanceAssets()` |
| `@Nonnull public` | `FileVisitResult` | `preVisitDirectory(@Nonnull Path dir, @Nonnull BasicFileAttributes attrs)` |
| `private static` | `void` | `onPlayerConnect(@Nonnull PlayerConnectEvent event)` |
| `private static` | `void` | `onPlayerAddToWorld(@Nonnull AddPlayerToWorldEvent event)` |
| `private static` | `void` | `onPlayerReady(@Nonnull PlayerReadyEvent event)` |
| `private static` | `void` | `showInstanceDiscovery( @Nonnull Ref<EntityStore> ref, @Nonnull Store<EntityStore> store, @Nonnull UUID instanceUuid, @Nonnull InstanceDiscoveryConfig discoveryConfig )` |
| `private static` | `void` | `onPlayerDrainFromWorld(@Nonnull DrainPlayerFromWorldEvent event)` |
| `private static` | `void` | `generateSchema(@Nonnull GenerateSchemaEvent event)` |
| `private` | `void` | `validateInstanceAssets(@Nonnull LoadAssetEvent event)` |
| `@Nonnull public static` | `String` | `safeName(@Nonnull String name)` |
| `@Nonnull public` | `ResourceType<ChunkStore, InstanceDataResource>` | `getInstanceDataResourceType()` |
| `@Nonnull public` | `ComponentType<EntityStore, InstanceEntityConfig>` | `getInstanceEntityConfigComponentType()` |
| `@Nonnull public` | `ComponentType<ChunkStore, InstanceBlock>` | `getInstanceBlockComponentType()` |
| `@Nonnull public` | `ComponentType<ChunkStore, ConfigurableInstanceBlock>` | `getConfigurableInstanceBlockComponentType()` |

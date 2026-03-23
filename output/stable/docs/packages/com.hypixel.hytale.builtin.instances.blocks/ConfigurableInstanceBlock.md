---
title: "ConfigurableInstanceBlock"
kind: "class"
package: "com.hypixel.hytale.builtin.instances.blocks"
fqcn: "com.hypixel.hytale.builtin.instances.blocks.ConfigurableInstanceBlock"
api_surface: false
extends: null
implements: ["Component<ChunkStore>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "builtin"
  - "instances"
  - "blocks"
---

**Package:** `com.hypixel.hytale.builtin.instances.blocks`

```java
public class ConfigurableInstanceBlock implements Component<ChunkStore>
```

A `ChunkStore` component storing ConfigurableInstanceBlock-related data on chunks.

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `protected` | `UUID` | `worldUUID` |  |
| `protected` | `CompletableFuture<World>` | `worldFuture` |  |
| `protected` | `boolean` | `closeOnRemove` | `true` |
| `private` | `String` | `instanceName` |  |
| `private` | `String` | `instanceKey` |  |
| `@Nullable private` | `Vector3d` | `positionOffset` |  |
| `@Nullable private` | `Vector3f` | `rotation` |  |
| `private` | `boolean` | `personalReturnPoint` | `false` |
| `private` | `double` | `removeBlockAfter` | `-1.0` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `ConfigurableInstanceBlock()` |
| `public` | | `ConfigurableInstanceBlock(UUID worldUUID,
        boolean closeOnRemove,
        String instanceName,
        String instanceKey,
        @Nullable Vector3d positionOffset,
        @Nullable Vector3f rotation,
        boolean personalReturnPoint,
        double removeBlockAfter)` |
| `@Nonnull public static` | `ComponentType<ChunkStore, ConfigurableInstanceBlock>` | `getComponentType()` |
| `public` | `UUID` | `getWorldUUID()` |
| `public` | `void` | `setWorldUUID(UUID worldUUID)` |
| `public` | `CompletableFuture<World>` | `getWorldFuture()` |
| `public` | `void` | `setWorldFuture(CompletableFuture<World> worldFuture)` |
| `public` | `boolean` | `isCloseOnRemove()` |
| `public` | `void` | `setCloseOnRemove(boolean closeOnRemove)` |
| `public` | `String` | `getInstanceName()` |
| `public` | `void` | `setInstanceName(@Nonnull String instanceName)` |
| `public` | `String` | `getInstanceKey()` |
| `public` | `void` | `setInstanceKey(@Nonnull String instanceKey)` |
| `@Nullable public` | `Vector3d` | `getPositionOffset()` |
| `public` | `void` | `setPositionOffset(@Nullable Vector3d positionOffset)` |
| `@Nullable public` | `Vector3f` | `getRotation()` |
| `public` | `void` | `setRotation(@Nullable Vector3f rotation)` |
| `public` | `boolean` | `isPersonalReturnPoint()` |
| `public` | `void` | `setPersonalReturnPoint(boolean personalReturnPoint)` |
| `public` | `double` | `getRemoveBlockAfter()` |
| `public` | `void` | `setRemoveBlockAfter(double removeBlockAfter)` |
| `@Nullable @Override public` | `Component<ChunkStore>` | `clone()` |

---
title: "InstanceBlock"
kind: "class"
package: "com.hypixel.hytale.builtin.instances.blocks"
fqcn: "com.hypixel.hytale.builtin.instances.blocks.InstanceBlock"
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
public class InstanceBlock implements Component<ChunkStore>
```

A `ChunkStore` component storing InstanceBlock-related data on chunks.

## Fields

| Modifier | Type | Name | Default |
|---|---|---|---|
| `protected` | `UUID` | `worldUUID` |  |
| `protected` | `CompletableFuture<World>` | `worldFuture` |  |
| `protected` | `boolean` | `closeOnRemove` | `true` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | | `InstanceBlock()` |
| `public` | | `InstanceBlock(UUID worldUUID, boolean closeOnRemove)` |
| `@Nonnull public static` | `ComponentType<ChunkStore, InstanceBlock>` | `getComponentType()` |
| `public` | `UUID` | `getWorldUUID()` |
| `public` | `void` | `setWorldUUID(UUID worldUUID)` |
| `public` | `CompletableFuture<World>` | `getWorldFuture()` |
| `public` | `void` | `setWorldFuture(CompletableFuture<World> worldFuture)` |
| `public` | `boolean` | `isCloseOnRemove()` |
| `public` | `void` | `setCloseOnRemove(boolean closeOnRemove)` |
| `@Nullable @Override public` | `Component<ChunkStore>` | `clone()` |

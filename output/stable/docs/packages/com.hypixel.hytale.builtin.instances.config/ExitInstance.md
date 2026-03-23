---
title: "ExitInstance"
kind: "class"
package: "com.hypixel.hytale.builtin.instances.config"
fqcn: "com.hypixel.hytale.builtin.instances.config.ExitInstance"
api_surface: false
extends: ~
implements: ["RespawnController"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "builtin"
  - "instances"
  - "config"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.instances.config`

```java
public class ExitInstance implements RespawnController
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull public static final` | `BuilderCodec<ExitInstance>` | `CODEC` |
| `@Nonnull private` | `RespawnController` | `fallback` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `@Override public` | `CompletableFuture<Void>` | `respawnPlayer(@Nonnull World world, @Nonnull Ref<EntityStore> playerReference, @Nonnull ComponentAccessor<EntityStore> commandBuffer)` |

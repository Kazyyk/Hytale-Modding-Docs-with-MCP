---
title: "PhysicsConfig"
kind: "interface"
package: "com.hypixel.hytale.server.core.modules.projectile.config"
fqcn: "com.hypixel.hytale.server.core.modules.projectile.config.PhysicsConfig"
api_surface: false
extends: null
implements:
  - "NetworkSerializable<com.hypixel.hytale.protocol.PhysicsConfig>"
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "projectile"
  - "physics"
  - "config"
---

**Package:** `com.hypixel.hytale.server.core.modules.projectile.config`

```java
public interface PhysicsConfig implements NetworkSerializable<com.hypixel.hytale.protocol.PhysicsConfig>
```

Interface for projectile physics configurations. Defines how physics forces are applied to a projectile entity. Supports codec-based polymorphism via `CodecMapCodec`.

## Fields

| Modifier | Type | Name |
|---|---|---|
| `public static final` | `CodecMapCodec<PhysicsConfig>` | `CODEC` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `apply(@Nonnull Holder<EntityStore> var1, @Nullable Ref<EntityStore> var2, @Nonnull Vector3d var3, @Nonnull ComponentAccessor<EntityStore> var4, boolean var5)` |
| `default` | `double` | `getGravity()` |

---
title: "BounceConsumer"
kind: "interface"
package: "com.hypixel.hytale.server.core.modules.projectile.config"
fqcn: "com.hypixel.hytale.server.core.modules.projectile.config.BounceConsumer"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "projectile"
  - "bounce"
  - "callback"
---

**Package:** `com.hypixel.hytale.server.core.modules.projectile.config`

```java
public interface BounceConsumer
```

Functional interface invoked when a projectile bounces off a surface. Receives the projectile entity reference, bounce position, and command buffer.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `onBounce(@Nonnull Ref<EntityStore> var1, @Nonnull Vector3d var2, @Nonnull CommandBuffer<EntityStore> var3)` |

---
title: "ImpactConsumer"
kind: "interface"
package: "com.hypixel.hytale.server.core.modules.projectile.config"
fqcn: "com.hypixel.hytale.server.core.modules.projectile.config.ImpactConsumer"
api_surface: false
extends: null
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T12:00:00Z"
tags:
  - "projectile"
  - "impact"
  - "callback"
---

**Package:** `com.hypixel.hytale.server.core.modules.projectile.config`

```java
public interface ImpactConsumer
```

Functional interface invoked when a projectile impacts a surface or entity. Receives the projectile reference, impact position, optional target entity reference, collision detail name, and command buffer.

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public` | `void` | `onImpact(@Nonnull Ref<EntityStore> var1, @Nonnull Vector3d var2, @Nullable Ref<EntityStore> var3, @Nullable String var4, @Nonnull CommandBuffer<EntityStore> var5)` |

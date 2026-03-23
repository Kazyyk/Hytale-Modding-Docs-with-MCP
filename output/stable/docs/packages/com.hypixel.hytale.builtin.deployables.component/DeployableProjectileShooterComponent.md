---
title: "DeployableProjectileShooterComponent"
kind: "class"
package: "com.hypixel.hytale.builtin.deployables.component"
fqcn: "com.hypixel.hytale.builtin.deployables.component.DeployableProjectileShooterComponent"
api_surface: false
extends: ~
implements: ["Component<EntityStore>"]
generator_version: "2.0.0"
generated_at: "2026-03-21T18:30:00Z"
tags:
  - "builtin"
  - "deployables"
  - "component"
  - "class"
---

**Package:** `com.hypixel.hytale.builtin.deployables.component`

```java
public class DeployableProjectileShooterComponent implements Component<EntityStore>
```

## Fields

| Modifier | Type | Name |
|---|---|---|
| `@Nonnull protected final` | `List<Ref<EntityStore>>` | `projectiles` |
| `@Nonnull protected final` | `List<Ref<EntityStore>>` | `projectilesForRemoval` |
| `protected` | `Ref<EntityStore>` | `activeTarget` |

## Methods

| Modifier | Return Type | Signature |
|---|---|---|
| `public static` | `ComponentType<EntityStore, DeployableProjectileShooterComponent>` | `getComponentType()` |
| `public` | `void` | `spawnProjectile(Ref<EntityStore> entityRef,
        @Nonnull CommandBuffer<EntityStore> commandBuffer,
        @Nonnull ProjectileConfig projectileConfig,
        @Nonnull UUID ownerUuid,
        @Nonnull Vector3d spawnPos,
        @Nonnull Vector3d direction)` |
| `@Nonnull public` | `List<Ref<EntityStore>>` | `getProjectiles()` |
| `@Nonnull public` | `List<Ref<EntityStore>>` | `getProjectilesForRemoval()` |
| `public` | `Ref<EntityStore>` | `getActiveTarget()` |
| `public` | `void` | `setActiveTarget(Ref<EntityStore> target)` |
| `@Override public` | `Component<EntityStore>` | `clone()` |

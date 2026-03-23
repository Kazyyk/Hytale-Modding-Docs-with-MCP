---
title: "ProjectileModule"
kind: "class"
package: "com.hypixel.hytale.server.core.modules.projectile"
fqcn: "com.hypixel.hytale.server.core.modules.projectile.ProjectileModule"
api_surface: false
extends: "JavaPlugin"
implements: []
generator_version: "2.0.0"
generated_at: "2026-03-21T00:00:00Z"
tags: 
  - "projectile"
---

**Package:** `com.hypixel.hytale.server.core.modules.projectile`

```java
public class ProjectileModule extends JavaPlugin
```

Server module providing modules functionality.

## Fields

| Field | Type | Description |
|---|---|---|
| `instance` | `ProjectileModule` | Static ProjectileModule field. |
| `projectileComponentType` | `ComponentType<EntityStore, Projectile>` | ComponentType<EntityStore, Projectile> field. |
| `standardPhysicsProviderComponentType` | `ComponentType<EntityStore, StandardPhysicsProvider>` | ComponentType<EntityStore, StandardPhysicsProvider> field. |
| `predictedProjectileComponentType` | `ComponentType<EntityStore, PredictedProjectile>` | ComponentType<EntityStore, PredictedProjectile> field. |

## Constructors

| Constructor | Description |
|---|---|
| `ProjectileModule(@Nonnull JavaPluginInit init)` | Creates a new ProjectileModule instance. |

## Methods

| Method | Return Type | Description |
|---|---|---|
| `get()` | `ProjectileModule` | static public method. |
| `setup()` | `void` | protected method. |
| `onProjectileSpawnInteraction(@Nonnull Ref<EntityStore> ref, @Nonnull Ref<EntityStore> creatorRef, @Nonnull Store<EntityStore> store)` | `void` | static private method. |
| `getProjectileComponentType()` | `ComponentType<EntityStore, Projectile>` | public method. |
| `getStandardPhysicsProviderComponentType()` | `ComponentType<EntityStore, StandardPhysicsProvider>` | public method. |
| `getPredictedProjectileComponentType()` | `ComponentType<EntityStore, PredictedProjectile>` | public method. |

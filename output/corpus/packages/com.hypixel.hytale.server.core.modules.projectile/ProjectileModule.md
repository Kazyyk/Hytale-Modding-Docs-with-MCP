# ProjectileModule

Type: class | Package: com.hypixel.hytale.server.core.modules.projectile | Extends: JavaPlugin

public class ProjectileModule extends JavaPlugin

Server module providing modules functionality.

## Fields

- instance | ProjectileModule | Static ProjectileModule field.
- projectileComponentType | ComponentType<EntityStore, Projectile> | ComponentType<EntityStore, Projectile> field.
- standardPhysicsProviderComponentType | ComponentType<EntityStore, StandardPhysicsProvider> | ComponentType<EntityStore, StandardPhysicsProvider> field.
- predictedProjectileComponentType | ComponentType<EntityStore, PredictedProjectile> | ComponentType<EntityStore, PredictedProjectile> field.

## Constructors

- ProjectileModule(@Nonnull JavaPluginInit init) | Creates a new ProjectileModule instance.

## Methods

- get() | ProjectileModule | static public method.
- setup() | void | protected method.
- onProjectileSpawnInteraction(@Nonnull Ref<EntityStore> ref, @Nonnull Ref<EntityStore> creatorRef, @Nonnull Store<EntityStore> store) | void | static private method.
- getProjectileComponentType() | ComponentType<EntityStore, Projectile> | public method.
- getStandardPhysicsProviderComponentType() | ComponentType<EntityStore, StandardPhysicsProvider> | public method.
- getPredictedProjectileComponentType() | ComponentType<EntityStore, PredictedProjectile> | public method.

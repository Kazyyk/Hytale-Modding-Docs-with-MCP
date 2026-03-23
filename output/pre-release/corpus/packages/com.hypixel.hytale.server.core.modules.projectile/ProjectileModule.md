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

Complete API:
  public static ProjectileModule get()
  protected void setup()
  public Ref<EntityStore> spawnProjectile(Ref<EntityStore> creatorRef, CommandBuffer<EntityStore> commandBuffer, ProjectileConfig config, Vector3d position, Vector3d direction)
  public Ref<EntityStore> spawnProjectile(UUID predictionId, Ref<EntityStore> creatorRef, CommandBuffer<EntityStore> commandBuffer, ProjectileConfig config, Vector3d position, Vector3d direction)
  private static void onProjectileSpawnInteraction(Ref<EntityStore> ref, Ref<EntityStore> creatorRef, Store<EntityStore> store)
  public ComponentType<EntityStore,Projectile> getProjectileComponentType()
  public ComponentType<EntityStore,StandardPhysicsProvider> getStandardPhysicsProviderComponentType()
  public ComponentType<EntityStore,PredictedProjectile> getPredictedProjectileComponentType()

Fields:
public static final PluginManifest MANIFEST
private static ProjectileModule instance
private ComponentType<EntityStore,Projectile> projectileComponentType
private ComponentType<EntityStore,StandardPhysicsProvider> standardPhysicsProviderComponentType
private ComponentType<EntityStore,PredictedProjectile> predictedProjectileComponentType

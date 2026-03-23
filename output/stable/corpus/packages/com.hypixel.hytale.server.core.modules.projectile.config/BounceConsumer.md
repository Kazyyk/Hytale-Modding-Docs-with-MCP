# BounceConsumer

Type: interface | Package: com.hypixel.hytale.server.core.modules.projectile.config

public interface BounceConsumer

Functional interface invoked when a projectile bounces off a surface. Receives the projectile entity reference, bounce position, and command buffer.

## Methods

- public void onBounce(@Nonnull Ref<EntityStore> var1, @Nonnull Vector3d var2, @Nonnull CommandBuffer<EntityStore> var3)

Also in this package: BallisticData, BallisticDataProvider, ImpactConsumer, PhysicsConfig, ProjectileConfig, ProjectileConfigPacketGenerator, STATE, StandardPhysicsConfig, StandardPhysicsProvider

Complete API:
  void onBounce(Ref<EntityStore> var1, Vector3d var2, CommandBuffer<EntityStore> var3)

# ImpactConsumer

Type: interface | Package: com.hypixel.hytale.server.core.modules.projectile.config

public interface ImpactConsumer

Functional interface invoked when a projectile impacts a surface or entity. Receives the projectile reference, impact position, optional target entity reference, collision detail name, and command buffer.

## Methods

- public void onImpact(@Nonnull Ref<EntityStore> var1, @Nonnull Vector3d var2, @Nullable Ref<EntityStore> var3, @Nullable String var4, @Nonnull CommandBuffer<EntityStore> var5)

Also in this package: BallisticData, BallisticDataProvider, BounceConsumer, PhysicsConfig, ProjectileConfig, ProjectileConfigPacketGenerator, STATE, StandardPhysicsConfig, StandardPhysicsProvider

Complete API:
  void onImpact(Ref<EntityStore> var1, Vector3d var2, Ref<EntityStore> var3, String var4, CommandBuffer<EntityStore> var5)

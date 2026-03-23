# PhysicsConfig

Type: interface | Package: com.hypixel.hytale.server.core.modules.projectile.config | Implements: NetworkSerializable<com.hypixel.hytale.protocol.PhysicsConfig>

public interface PhysicsConfig implements NetworkSerializable<com.hypixel.hytale.protocol.PhysicsConfig>

Interface for projectile physics configurations. Defines how physics forces are applied to a projectile entity. Supports codec-based polymorphism via `CodecMapCodec`.

## Fields

- public static final CodecMapCodec<PhysicsConfig> CODEC

## Methods

- public void apply(@Nonnull Holder<EntityStore> var1, @Nullable Ref<EntityStore> var2, @Nonnull Vector3d var3, @Nonnull ComponentAccessor<EntityStore> var4, boolean var5)
- default double getGravity()

Known implementors: StandardPhysicsConfig

Also in this package: BallisticData, BallisticDataProvider, BounceConsumer, ImpactConsumer, ProjectileConfig, ProjectileConfigPacketGenerator, STATE, StandardPhysicsConfig, StandardPhysicsProvider

Complete API:
  void apply(Holder<EntityStore> var1, Ref<EntityStore> var2, Vector3d var3, ComponentAccessor<EntityStore> var4, boolean var5)
  default double getGravity()

Fields:
CodecMapCodec<PhysicsConfig> CODEC

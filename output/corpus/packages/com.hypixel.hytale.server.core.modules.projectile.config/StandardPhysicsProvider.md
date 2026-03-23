# StandardPhysicsProvider

Type: class | Package: com.hypixel.hytale.server.core.modules.projectile.config | Implements: IBlockCollisionConsumer, Component<EntityStore>

public class StandardPhysicsProvider implements IBlockCollisionConsumer, Component<EntityStore>

Runtime physics provider component for projectiles using standard physics. Manages per-tick physics simulation including block collision handling, fluid interaction, bounce/impact consumers, body rotation, and sliding behavior. Attached to projectile entities when `StandardPhysicsConfig.apply()` is called.

## Fields

- public static final int WATER_DETECTION_EXTREMA_COUNT
- public static final double MIN_BOUNCE_EPSILON

## Methods

- public static ComponentType<EntityStore, StandardPhysicsProvider> getComponentType()
- public IBlockCollisionConsumer.Result onCollision(int blockX, int blockY, int blockZ, @Nonnull Vector3d direction, @Nonnull BlockContactData contactData, @Nonnull BlockData blockData, @Nonnull Box collider)
- public void finishTick(@Nonnull TransformComponent position, @Nonnull Velocity velocity)
- public void rotateBody(double dt, @Nonnull Vector3f bodyRotation)
- public boolean isOnGround()
- public boolean isSwimming()
- public StandardPhysicsProvider.STATE getState()
- public void setState(@Nonnull StandardPhysicsProvider.STATE state)
- public Component<EntityStore> clone()

## Inner Types

- StandardPhysicsProvider.STATE -- lifecycle state enum (ACTIVE, RESTING, INACTIVE)

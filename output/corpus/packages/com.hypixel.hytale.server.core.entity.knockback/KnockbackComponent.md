# KnockbackComponent

Type: class | Package: com.hypixel.hytale.server.core.entity.knockback | Implements: Component<EntityStore>

public class KnockbackComponent implements Component<EntityStore>

An `EntityStore` component storing KnockbackComponent-related data on entities.

## Fields

- @Nonnull private Vector3d velocity
- private ChangeVelocityType velocityType
- @Nullable private VelocityConfig velocityConfig
- @Nonnull private DoubleList modifiers
- private float duration
- private float timer

## Methods

- public static ComponentType<EntityStore, KnockbackComponent> getComponentType()
- @Nonnull public Vector3d getVelocity()
- public void setVelocity(@Nonnull Vector3d velocity)
- public ChangeVelocityType getVelocityType()
- public void setVelocityType(ChangeVelocityType velocityType)
- @Nullable public VelocityConfig getVelocityConfig()
- public void setVelocityConfig(@Nullable VelocityConfig velocityConfig)
- public void addModifier(double modifier)
- public void applyModifiers()
- public float getDuration()
- public void setDuration(float duration)
- public float getTimer()
- public void incrementTimer(float time)
- public void setTimer(float time)
- @Nonnull @Override public Component<EntityStore> clone()

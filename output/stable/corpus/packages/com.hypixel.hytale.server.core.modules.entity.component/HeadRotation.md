# HeadRotation

Type: class | Package: com.hypixel.hytale.server.core.modules.entity.component | Implements: Component

public class HeadRotation implements Component<EntityStore>

An `EntityStore` component.

## Methods

- public static ComponentType<EntityStore, HeadRotation> getComponentType()
- @Nonnull public Vector3f getRotation()
- public void setRotation(@Nonnull Vector3f rotation)
- public Vector3d getDirection()
- @Nonnull public Vector3i getAxisDirection()
- @Nonnull public Vector3i getAxisDirection(@Nonnull Vector3i result)
- @Nonnull public Vector3i getHorizontalAxisDirection()
- @Nonnull public Axis getAxis()
- @Nonnull public static Vector3i getAxisDirection(float pitch, float yaw, @Nonnull Vector3i result)
- throw new IllegalStateException("Pitch can't be NaN")
- throw new IllegalStateException("Yaw can't be NaN")
- @Nonnull private static Vector3d getDirection(float pitch, float yaw, @Nonnull Vector3d result)
- public void teleportRotation(@Nonnull Vector3f rotation)

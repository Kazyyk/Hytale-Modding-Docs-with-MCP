# Projectile

Type: class | Package: com.hypixel.hytale.server.core.modules.projectile.component | Implements: Component

public class Projectile implements Component<EntityStore>

ECS component stored in `EntityStore`. Serialized via `BuilderCodec`.

## Accessors

- getComponentType() | ComponentType<EntityStore, Projectile> | Accessor method.

Also in this package: PredictedProjectile

Complete API:
  public static ComponentType<EntityStore,Projectile> getComponentType()
  public Component<EntityStore> clone()

Fields:
public static Projectile INSTANCE
public static final BuilderCodec<Projectile> CODEC

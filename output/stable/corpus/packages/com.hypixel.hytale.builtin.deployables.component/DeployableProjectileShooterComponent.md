# DeployableProjectileShooterComponent

Type: class | Package: com.hypixel.hytale.builtin.deployables.component | Implements: Component<EntityStore>

public class DeployableProjectileShooterComponent implements Component<EntityStore>

## Fields

- @Nonnull protected final List<Ref<EntityStore>> projectiles
- @Nonnull protected final List<Ref<EntityStore>> projectilesForRemoval
- protected Ref<EntityStore> activeTarget

## Methods

- public static ComponentType<EntityStore, DeployableProjectileShooterComponent> getComponentType()
- public void spawnProjectile(Ref<EntityStore> entityRef,
        @Nonnull CommandBuffer<EntityStore> commandBuffer,
        @Nonnull ProjectileConfig projectileConfig,
        @Nonnull UUID ownerUuid,
        @Nonnull Vector3d spawnPos,
        @Nonnull Vector3d direction)` |
| `@Nonnull public` | `List<Ref<EntityStore>>` | `getProjectiles()` |
| `@Nonnull public` | `List<Ref<EntityStore>>` | `getProjectilesForRemoval()` |
| `public` | `Ref<EntityStore>` | `getActiveTarget()` |
| `public` | `void` | `setActiveTarget(Ref<EntityStore> target)` |
| `@Override public` | `Component<EntityStore>` | `clone()` |

Also in this package: DeployableComponent, DeployableFlag, DeployableOwnerComponent, DeployableProjectileComponent

Complete API:
  public static ComponentType<EntityStore,DeployableProjectileShooterComponent> getComponentType()
  public void spawnProjectile(Ref<EntityStore> entityRef, CommandBuffer<EntityStore> commandBuffer, ProjectileConfig projectileConfig, UUID ownerUuid, Vector3d spawnPos, Vector3d direction)
  public List<Ref<EntityStore>> getProjectiles()
  public List<Ref<EntityStore>> getProjectilesForRemoval()
  public Ref<EntityStore> getActiveTarget()
  public void setActiveTarget(Ref<EntityStore> target)
  public Component<EntityStore> clone()

Fields:
protected final List<Ref<EntityStore>> projectiles
protected final List<Ref<EntityStore>> projectilesForRemoval
protected Ref<EntityStore> activeTarget

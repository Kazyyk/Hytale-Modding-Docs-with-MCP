# DeployableProjectileComponent

Type: class | Package: com.hypixel.hytale.builtin.deployables.component | Implements: Component<EntityStore>

public class DeployableProjectileComponent implements Component<EntityStore>

## Fields

- @Nonnull protected Vector3d previousTickPosition

## Constructors

- public DeployableProjectileComponent()
- public DeployableProjectileComponent(@Nonnull Vector3d previousTickPosition)

## Methods

- public static ComponentType<EntityStore, DeployableProjectileComponent> getComponentType()
- @Override public Component<EntityStore> clone()
- @Nonnull public Vector3d getPreviousTickPosition()
- public void setPreviousTickPosition(@Nonnull Vector3d pos)

Also in this package: DeployableComponent, DeployableFlag, DeployableOwnerComponent, DeployableProjectileShooterComponent

Complete API:
  public static ComponentType<EntityStore,DeployableProjectileComponent> getComponentType()
  public Component<EntityStore> clone()
  public Vector3d getPreviousTickPosition()
  public void setPreviousTickPosition(Vector3d pos)

Fields:
protected Vector3d previousTickPosition

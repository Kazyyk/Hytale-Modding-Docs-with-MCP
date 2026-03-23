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

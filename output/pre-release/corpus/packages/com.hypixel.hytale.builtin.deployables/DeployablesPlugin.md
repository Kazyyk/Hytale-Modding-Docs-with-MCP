# DeployablesPlugin

Type: class | Package: com.hypixel.hytale.builtin.deployables | Extends: JavaPlugin

public class DeployablesPlugin extends JavaPlugin

## Fields

- private static DeployablesPlugin instance
- private ComponentType<EntityStore, DeployableComponent> deployableComponentType
- private ComponentType<EntityStore, DeployableOwnerComponent> deployableOwnerComponentType
- private ComponentType<EntityStore, DeployableProjectileShooterComponent> deployableProjectileShooterComponentType
- private ComponentType<EntityStore, DeployableProjectileComponent> deployableProjectileComponentType

## Constructors

- public DeployablesPlugin(@Nonnull JavaPluginInit init)

## Methods

- public static DeployablesPlugin get()
- @Override protected void setup()
- public ComponentType<EntityStore, DeployableComponent> getDeployableComponentType()
- public ComponentType<EntityStore, DeployableOwnerComponent> getDeployableOwnerComponentType()
- public ComponentType<EntityStore, DeployableProjectileShooterComponent> getDeployableProjectileShooterComponentType()
- public ComponentType<EntityStore, DeployableProjectileComponent> getDeployableProjectileComponentType()

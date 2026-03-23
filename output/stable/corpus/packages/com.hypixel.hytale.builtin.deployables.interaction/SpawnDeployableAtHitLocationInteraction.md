# SpawnDeployableAtHitLocationInteraction

Type: class | Package: com.hypixel.hytale.builtin.deployables.interaction | Extends: SimpleInstantInteraction

public class SpawnDeployableAtHitLocationInteraction extends SimpleInstantInteraction

Interaction handler extending `SimpleInstantInteraction`.

## Fields

- config | DeployableConfig | DeployableConfig field.

## Methods

- needsRemoteSync() | boolean | public method.
- firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler) | void | protected method.

Also in this package: SpawnDeployableFromRaycastInteraction

Complete API:
  public boolean needsRemoteSync()
  protected void firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)

Fields:
public static final BuilderCodec<SpawnDeployableAtHitLocationInteraction> CODEC
private DeployableConfig config

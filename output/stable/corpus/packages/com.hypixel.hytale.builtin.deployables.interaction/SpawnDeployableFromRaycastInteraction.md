# SpawnDeployableFromRaycastInteraction

Type: class | Package: com.hypixel.hytale.builtin.deployables.interaction | Extends: SimpleInstantInteraction

public class SpawnDeployableFromRaycastInteraction extends SimpleInstantInteraction

Interaction handler extending `SimpleInstantInteraction`.

## Fields

- unknownEntityStats | Object2FloatMap<String> | Object2FloatMap<String> field.
- entityStats | Int2FloatMap | Int2FloatMap field.
- maxPlacementDistance | float | float field.
- config | DeployableConfig | DeployableConfig field.

## Methods

- processConfig() | void | private method.
- isSurface(@Nonnull Vector3f normal) | boolean | static private method.
- needsRemoteSync() | boolean | public method.
- getWaitForDataFrom() | WaitForDataFrom | public method.
- firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler) | void | protected method.
- canAfford(@Nonnull Ref<EntityStore> entityRef, @Nonnull ComponentAccessor<EntityStore> componentAccessor) | boolean | protected method.
- generatePacket() | Interaction | protected method.
- configurePacket(Interaction packet) | void | protected method.

Also in this package: SpawnDeployableAtHitLocationInteraction

Complete API:
  private void processConfig()
  private static boolean isSurface(Vector3f normal)
  public boolean needsRemoteSync()
  public WaitForDataFrom getWaitForDataFrom()
  protected void firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  protected boolean canAfford(Ref<EntityStore> entityRef, ComponentAccessor<EntityStore> componentAccessor)
  protected Interaction generatePacket()
  protected void configurePacket(Interaction packet)

Fields:
public static final BuilderCodec<SpawnDeployableFromRaycastInteraction> CODEC
protected Object2FloatMap<String> unknownEntityStats
protected Int2FloatMap entityStats
protected float maxPlacementDistance
private DeployableConfig config

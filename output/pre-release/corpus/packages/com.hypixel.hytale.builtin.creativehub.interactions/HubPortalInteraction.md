# HubPortalInteraction

Type: class | Package: com.hypixel.hytale.builtin.creativehub.interactions | Extends: SimpleInstantInteraction

public class HubPortalInteraction extends SimpleInstantInteraction

Interaction handler extending `SimpleInstantInteraction`.

## Fields

- worldName | String | String field.
- worldGenType | String | String field.
- instanceTemplate | String | String field.

## Methods

- getWaitForDataFrom() | WaitForDataFrom | public method.
- firstRun(@Nonnull InteractionType type, @Nonnull InteractionContext context, @Nonnull CooldownHandler cooldownHandler) | void | protected method.

Complete API:
  public WaitForDataFrom getWaitForDataFrom()
  protected void firstRun(InteractionType type, InteractionContext context, CooldownHandler cooldownHandler)
  private static void teleportToLoadedWorld(Ref<EntityStore> playerRef, ComponentAccessor<EntityStore> componentAccessor, World targetWorld, Player playerComponent)
  private static void teleportToLoadingWorld(Ref<EntityStore> playerRef, ComponentAccessor<EntityStore> componentAccessor, CompletableFuture<World> worldFuture, World originalWorld, Player playerComponent)

Fields:
private static final HytaleLogger LOGGER
public static final BuilderCodec<HubPortalInteraction> CODEC
private String worldName
private String worldGenType
private String instanceTemplate

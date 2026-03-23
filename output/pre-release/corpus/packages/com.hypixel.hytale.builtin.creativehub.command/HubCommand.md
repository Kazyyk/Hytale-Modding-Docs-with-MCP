# HubCommand

Type: class | Package: com.hypixel.hytale.builtin.creativehub.command | Extends: AbstractPlayerCommand

public class HubCommand extends AbstractPlayerCommand

## Fields

- private static final Message MESSAGE_NOT_IN_HUB_WORLD
- private static final Message MESSAGE_ALREADY_IN_HUB

## Methods

- @Override protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)
- @Nullable private static World findParentHubWorld(Store<EntityStore> store, Ref<EntityStore> ref)

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)
  private static World findParentHubWorld(Store<EntityStore> store, Ref<EntityStore> ref)

Fields:
private static final Message MESSAGE_NOT_IN_HUB_WORLD
private static final Message MESSAGE_ALREADY_IN_HUB

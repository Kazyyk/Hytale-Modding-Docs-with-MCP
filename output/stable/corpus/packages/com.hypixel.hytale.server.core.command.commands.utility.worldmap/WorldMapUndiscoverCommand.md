# WorldMapUndiscoverCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.utility.worldmap | Extends: AbstractPlayerCommand

public class WorldMapUndiscoverCommand extends AbstractPlayerCommand

## Fields

- @Nonnull private static final Message MESSAGE_COMMANDS_WORLD_MAP_ALL_ZONES_REMOVED_FROM_DISCOVERED
- @Nonnull private final OptionalArg<String> zoneArg

## Constructors

- public WorldMapUndiscoverCommand()

## Methods

- @Override protected void execute(@Nonnull CommandContext context, @Nonnull Store<EntityStore> store, @Nonnull Ref<EntityStore> ref, @Nonnull PlayerRef playerRef, @Nonnull World world)

Also in this package: WorldMapClearMarkersCommand, WorldMapCommand, WorldMapDiscoverCommand, WorldMapReloadCommand, WorldMapViewRadiusGetCommand, WorldMapViewRadiusRemoveCommand, WorldMapViewRadiusSetCommand, WorldMapViewRadiusSubCommand

Complete API:
  protected void execute(CommandContext context, Store<EntityStore> store, Ref<EntityStore> ref, PlayerRef playerRef, World world)

Fields:
private static final Message MESSAGE_COMMANDS_WORLD_MAP_ALL_ZONES_REMOVED_FROM_DISCOVERED
private final OptionalArg<String> zoneArg

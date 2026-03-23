# WorldMapViewRadiusSetCommand

Type: class | Package: com.hypixel.hytale.server.core.command.commands.utility.worldmap | Extends: AbstractTargetPlayerCommand

public class WorldMapViewRadiusSetCommand extends AbstractTargetPlayerCommand

## Fields

- @Nonnull private final RequiredArg<Integer> radiusArg
- @Nonnull private final FlagArg bypassArg

## Constructors

- public WorldMapViewRadiusSetCommand()

## Methods

- @Override protected void execute(@Nonnull CommandContext context,
        @Nullable Ref<EntityStore> sourceRef,
        @Nonnull Ref<EntityStore> ref,
        @Nonnull PlayerRef playerRef,
        @Nonnull World world,
        @Nonnull Store<EntityStore> store)` |

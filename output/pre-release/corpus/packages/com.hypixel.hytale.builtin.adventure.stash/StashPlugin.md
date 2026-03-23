# StashPlugin

Type: class | Package: com.hypixel.hytale.builtin.adventure.stash | Extends: JavaPlugin

public class StashPlugin extends JavaPlugin

## Fields

- @Nonnull private static final HytaleLogger LOGGER

## Constructors

- public StashPlugin(@Nonnull JavaPluginInit init)

## Methods

- @Override protected void setup()
- @Nullable public static ListTransaction<ItemStackTransaction> stash(BlockModule.BlockStateInfo blockStateInfo, @Nonnull ItemContainerBlock containerState, boolean clearDropList)

## Inner Types

- StashPlugin.StashSystem -- chunk-store ECS system that populates container inventories from drop lists on entity add

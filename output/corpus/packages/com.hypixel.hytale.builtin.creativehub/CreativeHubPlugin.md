# CreativeHubPlugin

Type: class | Package: com.hypixel.hytale.builtin.creativehub | Extends: JavaPlugin

public class CreativeHubPlugin extends JavaPlugin

Plugin that registers systems, commands, interactions for the builtin subsystem.

## Fields

- instance | CreativeHubPlugin | Static CreativeHubPlugin field.
- creativeHubEntityConfigComponentType | ComponentType<EntityStore, CreativeHubEntityConfig> | ComponentType<EntityStore, CreativeHubEntityConfig> field.

## Constructors

- CreativeHubPlugin(@Nonnull JavaPluginInit init) | Creates a new CreativeHubPlugin instance.

## Methods

- get() | CreativeHubPlugin | static public method.
- getOrSpawnHubInstance(@Nonnull World parentWorld, @Nonnull CreativeHubWorldConfig hubConfig, @Nonnull Transform returnPoint) | World | public method.
- getActiveHubInstance(@Nonnull World parentWorld) | World | public method.
- clearHubInstance(@Nonnull UUID parentWorldUuid) | void | public method.
- spawnPermanentWorldFromTemplate(@Nonnull String instanceAssetName, @Nonnull String permanentWorldName) | CompletableFuture<World> | public method.
- getCreativeHubEntityConfigComponentType() | ComponentType<EntityStore, CreativeHubEntityConfig> | public method.
- setup() | void | protected method.
- onWorldRemove(@Nonnull RemoveWorldEvent event) | void | static private method.
- onPlayerConnect(@Nonnull PlayerConnectEvent event) | void | static private method.
- onPlayerAddToWorld(@Nonnull AddPlayerToWorldEvent event) | void | static private method.

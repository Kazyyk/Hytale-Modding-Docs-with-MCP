# WorldSettingsCommand

Type: class | Package: com.hypixel.hytale.server.core.universe.world.commands | Extends: AbstractCommandCollection

public class WorldSettingsCommand extends AbstractCommandCollection

Command collection providing sub-commands to view and modify world configuration settings at runtime. Registered under the name `settings` with alias `ws`. Each sub-command exposes a `WorldConfig` property with `set` and `reset` operations.

## Constructors


public WorldSettingsCommand()

Registers all sub-commands covering: `worldgentype`, `worldmaptype`, `chunkstoragetype`, `ticking`, `blockticking`, `pvp`, `timepaused`, `spawningnpc`, `spawnmarkers`, `freezeallnpcs`, `compassupdating`, `playersaving`, `chunksaving`, `chunkunloading`, `gamemode`, `gameplayconfig`, `pregenerate`, and `keeploaded`.

## Sub-Command Structure

Each setting sub-command displays the current value when invoked without arguments, and provides nested `set` and `reset` sub-commands. The `reset` sub-command reverts to the default `WorldConfig` value.

## Inner Classes

### WorldSettingsSubCommand


private static class WorldSettingsSubCommand<T> extends AbstractWorldCommand

Generic sub-command that reads/writes a typed property from `WorldConfig` via getter/setter functions.

### WorldSettingsBox2DCommand


private static class WorldSettingsBox2DCommand extends AbstractWorldCommand

Specialized sub-command for `Box2D` region properties (pregenerate, keeploaded) that require four coordinate arguments (minX, minZ, maxX, maxZ).

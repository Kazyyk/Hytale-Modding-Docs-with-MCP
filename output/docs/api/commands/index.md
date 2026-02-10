---
title: "Command System"
kind: "overview"
package: "com.hypixel.hytale.server.core.command.system"
api_surface: "public"
generator_version: "1.0.0"
generated_at: "2026-02-09T23:10:00Z"
tags:
  - "commands"
  - "overview"
  - "builder-pattern"
---

# Command System

> Package: `com.hypixel.hytale.server.core.command.system`

A builder-pattern command system with typed argument parsing, automatic permission generation, tab completion, usage variants, and subcommand support. Commands run on `ForkJoinPool.commonPool()`.

## Defining a Command

Commands are defined by extending a base class and declaring arguments as fields using builder methods:

```java
public class MyPlugin extends PluginBase {
    @Override
    protected void setup() {
        getCommandRegistry().registerCommand(new MyCommand());
    }
}

public class MyCommand extends CommandBase {
    private final RequiredArg<PlayerRef> targetArg =
        this.withRequiredArg("target", "Target player", ArgTypes.PLAYER_REF);
    private final DefaultArg<Integer> countArg =
        this.withDefaultArg("count", "Number of times", ArgTypes.INTEGER, 1, "1");
    private final OptionalArg<String> reasonArg =
        this.withOptionalArg("reason", "Optional reason", ArgTypes.STRING);

    public MyCommand() {
        super("mycommand", "Does something cool");
        this.addAliases("mc");
    }

    @Override
    protected void executeSync(CommandContext context) {
        PlayerRef target = this.targetArg.get(context);
        int count = this.countArg.get(context);
        if (this.reasonArg.provided(context)) {
            String reason = this.reasonArg.get(context);
        }
        context.sendMessage(Message.translation("myplugin.mycommand.success"));
    }
}
```

## Command Base Classes

| Class | Use Case |
|-------|----------|
| [CommandBase](../classes/CommandBase.md) | Most commands — synchronous `executeSync(CommandContext)` |
| AbstractAsyncCommand | Async commands — `executeAsync(CommandContext)` returns `CompletableFuture<Void>` |
| AbstractPlayerCommand | Player-only commands — auto-resolves sender to `PlayerRef`, `Ref<EntityStore>`, `World` |
| AbstractCommandCollection | Subcommand groups — shows usage listing when invoked without a subcommand |
| [AbstractCommand](../classes/AbstractCommand.md) | Core base class — provides the builder API for all argument types |

## Argument Builder Methods

Declared as fields on the command class. Available on `AbstractCommand`:

| Method | Returns | Description |
|--------|---------|-------------|
| `withRequiredArg(name, desc, ArgumentType<T>)` | `RequiredArg<T>` | Must be provided |
| `withOptionalArg(name, desc, ArgumentType<T>)` | `OptionalArg<T>` | May be omitted |
| `withDefaultArg(name, desc, ArgumentType<T>, T default, String defaultDesc)` | `DefaultArg<T>` | Uses default if omitted |
| `withFlagArg(name, desc)` | `FlagArg` | Boolean flag |
| `withListRequiredArg(name, desc, ArgumentType<T>)` | `ListRequiredArg<T>` | Required list `[a, b, c]` |
| `withListOptionalArg(name, desc, ArgumentType<T>)` | `ListOptionalArg<T>` | Optional list |
| `withListDefaultArg(name, desc, ArgumentType<T>, List<T> default, String defaultDesc)` | `ListDefaultArg<T>` | Default list |

## Built-in Argument Types

### Primitives

| Name | Java Type | Examples |
|------|-----------|---------|
| `BOOLEAN` | `Boolean` | `true`, `false` |
| `INTEGER` | `Integer` | `-1`, `0`, `56346` |
| `STRING` | `String` | `"Hytale is really cool!"` |
| `FLOAT` | `Float` | `3.14159`, `-2.5` |
| `DOUBLE` | `Double` | `-3.14`, `0.0` |
| `UUID` | `UUID` | `<UUID>` |
| `COLOR` | `Integer (ARGB)` | `#FF0000`, `0xFF0000`, `16711680` |

### Player

| Name | Java Type | Description |
|------|-----------|-------------|
| `PLAYER_UUID` | `UUID` | Resolves username to UUID |
| `PLAYER_REF` | `PlayerRef` | Resolves username to PlayerRef |
| `GAME_PROFILE_LOOKUP` | `PublicGameProfile` | Sync profile lookup |
| `GAME_PROFILE_LOOKUP_ASYNC` | `CompletableFuture<PublicGameProfile>` | Async profile lookup |

### Spatial

| Name | Java Type | Params | Description |
|------|-----------|--------|-------------|
| `RELATIVE_DOUBLE_COORD` | `Coord` | 1 | Single coordinate, `~` prefix for relative |
| `RELATIVE_INT_COORD` | `IntCoord` | 1 | Integer coordinate, `~` prefix |
| `VECTOR2I` | `Vector2i` | 2 | Two integers (x z) |
| `VECTOR3I` | `Vector3i` | 3 | Three integers (x y z) |
| `RELATIVE_BLOCK_POSITION` | `RelativeIntPosition` | 3 | Block position with `~` support |
| `RELATIVE_POSITION` | `RelativeDoublePosition` | 3 | Entity position with `~` support |
| `RELATIVE_CHUNK_POSITION` | `RelativeChunkPosition` | 2 | Chunk position with `~` support |
| `ROTATION` | `Vector3f` | 3 | Pitch/yaw/roll |

### Asset Types

| Name | Java Type |
|------|-----------|
| `BLOCK_TYPE_ASSET` | `BlockType` |
| `ITEM_ASSET` | `Item` |
| `MODEL_ASSET` | `ModelAsset` |
| `WEATHER_ASSET` | `Weather` |
| `EFFECT_ASSET` | `EntityEffect` |
| `ENVIRONMENT_ASSET` | `Environment` |
| `PARTICLE_SYSTEM` | `ParticleSystem` |
| `SOUND_EVENT_ASSET` | `SoundEvent` |

### Block Types

| Name | Java Type | Description |
|------|-----------|-------------|
| `BLOCK_TYPE_KEY` | `String` | Block type key (e.g., `Wood_Drywood_Planks_Half`) |
| `BLOCK_ID` | `Integer` | Block type key → integer ID |
| `BLOCK_PATTERN` | `BlockPattern` | Weighted block list `[20%Rock_Stone, 80%Rock_Shale]` |
| `BLOCK_MASK` | `BlockMask` | Block mask list `[!Fluid_Water, >Grass_Full]` |

### Enums & Other

| Name | Java Type | Description |
|------|-----------|-------------|
| `GAME_MODE` | `GameMode` | Game mode enum |
| `SOUND_CATEGORY` | `SoundCategory` | Sound category enum |
| `ArgTypes.forEnum(name, Class<E>)` | `E` | Factory for any enum type |
| `TICK_RATE` | `Integer (tps)` | Accepts `30tps`, `33ms`, or raw integer |
| `ENTITY_ID` | `UUID` | Entity UUID reference |

## Permission Model

### Auto-Generation

Permissions are auto-generated when a command is registered:

- **Plugin commands:** `plugin.getBasePermission() + ".command." + commandName`
- **Built-in commands:** `"hytale.system.command." + commandName`

### Explicit Permissions

Commands can declare additional permissions:

```java
this.requirePermission("mycommand.admin");
this.setPermissionGroups("admin", "moderator");
this.setPermissionGroup(GameMode.Adventure);  // available in adventure mode
```

### Permission Checking

`hasPermission(CommandSender)` checks `sender.hasPermission(permission)` and recurses up the parent command chain. All parents must also pass their permission checks.

## Usage Variants

Commands support multiple usage patterns via `addUsageVariant()`. Each variant is a separate `AbstractCommand` subclass with its own arguments and permissions:

```
/kill                  — kills self (AbstractPlayerCommand)
/kill <player>         — kills target (CommandBase with RequiredArg<PlayerRef>)

/gamemode <mode>       — sets own game mode
/gamemode <mode> <player> — sets another player's game mode
```

## Subcommands

Commands can have named subcommands via `addSubCommand()`. `AbstractCommandCollection` is a convenience base that shows all subcommands when invoked without arguments.

## Built-in Commands

55+ built-in commands organized by category:

| Category | Commands |
|----------|----------|
| Player | `gamemode` (`gm`), `kill`, `give`, `sudo`, `refer`, `player` |
| Server | `kick`, `stop`, `who`, `maxplayers`, `auth` |
| World/Entity | `entity` (clone, remove, effect, etc.), `spawn` |
| World/Chunk | `chunk` (load, unload, regenerate, info, etc.) |
| World Gen | `worldgen` (benchmark, reload) |
| Utility | `help` (`?`), `teleport` (`tp`), `time`, `weather`, `say`, `message` (`msg`), `scoreboard` |
| Debug | `ping`, `version`, `log`, `server`, `packetstats`, `stresstest`, `assets`, `packs` |
| Builder Tools | `fill`, `copy`, `paste`, `undo`, `redo`, `selection` |

## Related

- **[AbstractCommand](../classes/AbstractCommand.md)** — Core builder API for commands
- **[CommandBase](../classes/CommandBase.md)** — Synchronous command base class
- **[CommandContext](../classes/CommandContext.md)** — Execution context passed to command handlers
- **[CommandSender](../classes/CommandSender.md)** — Who executed the command
- **[CommandRegistry](../classes/CommandRegistry.md)** — Plugin-scoped registration

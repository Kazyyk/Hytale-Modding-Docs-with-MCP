# ArgTypes

Type: class | Package: com.hypixel.hytale.server.core.command.system.arguments.types | Extends: java.lang.Object

public final class ArgTypes

Central registry of built-in command argument types. Provides static `SingleArgumentType` and `ArgumentType` instances for parsing common data types from command input, including: `BOOLEAN`, `INTEGER`, `LONG`, `FLOAT`, `DOUBLE`, `STRING`, `GREEDY_STRING`, `GAME_MODE`, `PLAYER`, `OFFLINE_PLAYER`, `WORLD`, `BLOCK_TYPE`, `ITEM`, `SOUND_EVENT`, `SOUND_CATEGORY`, `PARTICLE`, `ENVIRONMENT`, `WEATHER`, `AMBIENCE_FX`, `ENTITY_EFFECT`, `MODEL`, `INTERACTION`, `VECTOR3I`, `VECTOR3F`, `VECTOR2I`, `BLOCK_FILTER`, `BLOCK_MASK`, `BLOCK_PATTERN`, and more.

Each argument type provides parsing, tab-completion suggestions, and usage information.

## Related Types

- ArgumentType -- abstract base class for all argument types
- `AbstractCommand` -- commands use these types for parameter definitions

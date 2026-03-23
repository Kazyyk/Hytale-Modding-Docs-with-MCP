# HiddenPlayersManager

Type: class | Package: com.hypixel.hytale.server.core.entity.entities.player

public class HiddenPlayersManager

Thread-safe manager for tracking which players are hidden from a given player. Uses a `ConcurrentHashMap`-backed set for concurrent access from multiple threads.

## Methods

- hidePlayer(@Nonnull UUID uuid) | void | Marks the specified player as hidden.
- showPlayer(@Nonnull UUID uuid) | void | Removes the hidden status for the specified player.
- isPlayerHidden(@Nonnull UUID uuid) | boolean | Returns true if the specified player is currently hidden.

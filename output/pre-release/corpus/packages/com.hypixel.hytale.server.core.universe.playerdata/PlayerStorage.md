# PlayerStorage

Type: interface | Package: com.hypixel.hytale.server.core.universe.playerdata

public interface PlayerStorage

Asynchronous interface for persisting and loading player entity data. All operations return `CompletableFuture` for non-blocking I/O. Implementations include `DiskPlayerStorageProvider` for file-backed storage and `DefaultPlayerStorageProvider`.

## Methods

- load(@Nonnull UUID var1) | CompletableFuture<Holder<EntityStore>> | Loads the entity data for the given player UUID.
- save(@Nonnull UUID var1, @Nonnull Holder<EntityStore> var2) | CompletableFuture<Void> | Saves entity data for the given player UUID.
- remove(@Nonnull UUID var1) | CompletableFuture<Void> | Removes stored data for the given player UUID.
- getPlayers() | Set<UUID> | Returns the set of all stored player UUIDs. Throws `IOException` on I/O failure.

# WorldSpawnPoint

Type: class | Package: com.hypixel.hytale.server.core.asset.type.gameplay.respawn | Implements: RespawnController

public class WorldSpawnPoint implements RespawnController

## Fields

- public static final WorldSpawnPoint INSTANCE
- public static final BuilderCodec<WorldSpawnPoint> CODEC

## Methods

- @Override public CompletableFuture<Void> respawnPlayer(World world, Ref<EntityStore> playerReference, ComponentAccessor<EntityStore> commandBuffer)

Also in this package: HomeOrSpawnPoint, RespawnController

Complete API:
  public CompletableFuture<Void> respawnPlayer(World world, Ref<EntityStore> playerReference, ComponentAccessor<EntityStore> commandBuffer)

Fields:
public static final WorldSpawnPoint INSTANCE
public static final BuilderCodec<WorldSpawnPoint> CODEC

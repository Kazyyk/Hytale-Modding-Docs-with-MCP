# HomeOrSpawnPoint

Type: class | Package: com.hypixel.hytale.server.core.asset.type.gameplay.respawn | Implements: RespawnController

public class HomeOrSpawnPoint implements RespawnController

## Fields

- public static final HomeOrSpawnPoint INSTANCE
- public static final BuilderCodec<HomeOrSpawnPoint> CODEC

## Methods

- @Override public CompletableFuture<Void> respawnPlayer(World world, Ref<EntityStore> playerReference, ComponentAccessor<EntityStore> commandBuffer)

Also in this package: RespawnController, WorldSpawnPoint

Complete API:
  public CompletableFuture<Void> respawnPlayer(World world, Ref<EntityStore> playerReference, ComponentAccessor<EntityStore> commandBuffer)

Fields:
public static final HomeOrSpawnPoint INSTANCE
public static final BuilderCodec<HomeOrSpawnPoint> CODEC
